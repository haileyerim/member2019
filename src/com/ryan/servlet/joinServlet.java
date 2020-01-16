package com.ryan.servlet;

import java.io.IOException;
//import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.ryan.db.MemberDAO;

@WebServlet("/mb_ok")
public class joinServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	public joinServlet() {
		super();
	}

	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		request.setCharacterEncoding("UTF-8");
		// 한글 깨짐 방지

		// 클라이언트(브라우저)에서 받음
		String id = request.getParameter("id");
		String pw = request.getParameter("pw");
		String name = request.getParameter("name");
		String email = request.getParameter("email");
		String phone = request.getParameter("phone");
		
		// 클라이언트(브라우저)에서 받은 위 정보를 디비클래스에 넣기 
		int result = MemberDAO.insert(id, pw, name, email, phone);
		if(result == 0) { 
			// 에러페이지 이동
			response.sendRedirect("joinerr.jsp");
		} else { 
			// 메인 , 로그인 이동
			response.sendRedirect("mb_ok.jsp");
		}
		// 클라이언트(브라우저)에 보냄
//		response.setContentType("text/html; charset=UTF-8");
//		PrintWriter out = response.getWriter();

//		out.println(id);
//		out.println(pw);
//		out.println(name);
//		out.println(email);
//		out.println(phone);

		// response.getWriter().append("Served at: ").append(request.getContextPath());

	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		doGet(request, response);
	}

}
