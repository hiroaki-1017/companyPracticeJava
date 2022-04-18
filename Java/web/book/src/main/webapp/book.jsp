<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<jsp:useBean id="bk" class="bean.BookBean" scope="request"></jsp:useBean>
<%@ page import="java.util.List" %>
<%@ page import="java.util.Map" %>

<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<div class="books-container">
		<div class="page-title">
			<h2>書籍一覧</h2>
		</div>
		<div class="book-contents">
			<% for(Map<String,Object> map : bk.getList()){ %>
				<p><%=map.get("id") %><p>
				<p><%=map.get("title") %></p>
				<p><%=map.get("another") %></p>
				<p><%=map.get("publish") %></p>
				<p><%=map.get("date") %></p>
			<% } %>
		</div>
	</div>
</body>
</html>