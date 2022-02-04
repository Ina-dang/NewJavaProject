<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<% 
		String[] courses = request.getParameterValues("course");
		String subject = request.getParameter("subject");
		
		if(courses != null)
		for( String s : courses){
			out.print("<h2>" + s + "</h2>");
		}
	%>
	<h2><%=subject%></h2>
</body>
</html>