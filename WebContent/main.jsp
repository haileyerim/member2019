<%@page import="com.ryan.db.MemberDTO"%>
<%@page import="java.util.ArrayList"%>
<%@page import="com.ryan.db.MemberDAO"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%

		String name = (String)session.getAttribute("name");
		
 		if ( name == null ) { 
 			// 로그인 안된 사람 
 			response.sendRedirect("login.jsp");
 			
 		} else { 
 			// 로그인 된 사람 
 			System.out.println("로그인 된 사람: " + name);
 			
 		}
	
 		ArrayList<MemberDTO> mlist = MemberDAO.pink();
 		for (MemberDTO m : mlist ) { 
			System.out.print(m.getId());		
			System.out.print(" "+ m.getName());
			System.out.print(" "+ m.getEmail());
			System.out.print(" "+ m.getPhone());
			System.out.println(" "+ m.getPw());
			
 		}		
 		%>	

<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
착한 사람만 보이는 창 
<%=name %> 님 반가웡

<a href="logout.jsp">로그아웃 하고 싶어용 ? </a>

</body>
</html>