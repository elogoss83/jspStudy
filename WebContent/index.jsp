<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
<% String name = request.getParameter("name"); %>
<% for(int i = 0; i<5; i++) {%>
<h1>hello world!!</h1>
<%=name%>
<% } %>
 <% out.print("ttt"); %>
</body>
</html>