<%@page import="java.util.ArrayList"%>
<%@ page language="java" contentType="text/html; charset=utf-8"
    pageEncoding="utf-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="utf-8">
<title>Insert title here</title>
</head>
<body>
<%-- JSP 주석문입니다  이코드는 서블릿으로 변환할 때 자바 코드로 변하지 않아요. --%>

<%-- 문제 4. ArrayList를 임포트해서 ArrayList를 이용해 1~10까지 저장하고 출력해주세요. --%>
<h1>ArrayList를 이용해 1~10까지 저장하고 출력</h1>
<%
	ArrayList<Integer> nl = new ArrayList<Integer>();
	for (int i = 1; i <= 10; i++) {
		nl.add(i);
	}
%>
<div>
<%
	for(int t = 0; t < nl.size(); t++) {
		out.println(nl.get(t));
	}
%>
	</div>
