<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ page import="java.util.List" %>
<%@ page import="java.util.Map" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<h1>サーブレットから呼ばれたJSPです</h1>
	<% List<Map<String,Object>> list = (List<Map<String,Object>>)request.getAttribute("list");
	for(Map<String,Object>map : list) {
	%>
		<h3><%=map.get("name")%></h3>
		<h3><%=map.get("defence")%></h3>
		<h3><%=map.get("win")%></h3>
		<h3><%=map.get("lost")%></h3>
	<%}%>

</body>
</html>