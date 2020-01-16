package com.ryan.servlet;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.ryan.db.MemberDAO;
import com.ryan.db.MemberDTO;


@WebServlet("/lg_ok")
public class LoginServlet extends HttpServlet {
        private static final long serialVersionUID = 1L;
       
    public LoginServlet() {
        super();
    }

        protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
                //response.getWriter().append("Served at: ").append(request.getContextPath());
                
                // 세션 사용하기
                HttpSession session = request.getSession();
                
                
                // 한글 깨짐 방지
                response.setContentType("text/html;charset=utf-8");
                // 로그인.jsp 에서 받아온 아이디,비번 정보
                String id = request.getParameter("id");
                String pw = request.getParameter("pw");
                
                // script 문 사용하기위해 씀
                PrintWriter out = response.getWriter();
                
                // 디비에 물어봄 id,pw있는지??
                // MemberDAO 파일 속 select(STtring tid, String, tpw ) 메소드에 tid,tpw 값을 넣으면서 작동한다
                // ex ) tid = id , tpw = pw 
                // MemberDAO dto 변수로 Getter 메소드들을 호출함 
                MemberDTO dto = MemberDAO.select(id,pw);
                
                // DBClass 에서 받아온 dto 값을 확인 
                if (dto == null ) {
                	// 로그인이 안되며는
                        out.println("<Script>alert('정보가 맞지않습니다.'); history.back();</script>");

                }
                else
                {
                        // session.setAttribute("변수", "값");
                        
                        session.setAttribute("name" , dto.getName());
                        response.sendRedirect("main.jsp");
                        //response.sendRedirect("index.html");
                }
        
        }

        protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
                doGet(request, response);
        }

}
