package com.ryan.servlet;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.ryan.db.MemberDAO;
import com.ryan.db.MemberDTO;

@WebServlet("/list")
public class memberlist extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    public memberlist() {
        super();
    }

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// response.getWriter().append("Served at: ").append(request.getContextPath());
		
		// 세션 사용하기
        HttpSession session = request.getSession();

        // 한글 깨짐 방지
        response.setContentType("text/html;charset=utf-8");
        ArrayList<MemberDTO> mlist = MemberDAO.pink();
        
        for (MemberDTO m : mlist ) { 
			System.out.println(m.getId());
			System.out.println(m.getPw());
			System.out.println(m.getName());
			System.out.println(m.getEmail());
			System.out.println(m.getPhone());
		}
		
        
        
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		doGet(request, response);
	}

}
