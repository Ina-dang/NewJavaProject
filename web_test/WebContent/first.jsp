<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<h1>안녕하세요 JSP</h1>
	<%
		//for (int i = 0; i < 10 ; i++){
		//	System.out.println(i);
		//}
		//request.getParameter("keyword");
		// getParameter = 문자열
		request.setCharacterEncoding("utf-8");
		String keyword = request.getParameter("keyword");
		out.print("<h3>검색어 : " + keyword + "</h3>");
	%>
</body>
</html>