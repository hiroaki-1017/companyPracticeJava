<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<jsp:useBean id="lb" class="bean.LoginBean" scope="request"></jsp:useBean>
<%@ page import="java.util.List" %>
<%@ page import="java.util.Map" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>ヤクゾ</title>
</head>
<body>
	<div class="login-container">
		<h2>ヤクゾシステム</h2>
		<h3>ログイン</h3>
		<form action="login" method="post" class="form">
			<h4>社員コード</h4>
			<input type="text" name="shain_code" value="<%=lb.getShain_code() %>"required>
			<h4>パスワード</h4>
			<input type="password" name="password" value="<%=lb.getPassword() %>"required>
			<h4>店舗</h4>
			<select name="tenpo_code">
				<option value="">店舗を選択</option>
				<% for(Map<String,String> map : lb.getList()) { %>
					<% if(lb.getTenpo_code().equals(map.get("tenpo_code"))) { %>
						<option value="<%=map.get("tenpo_code") %>"> selected><%=map.get("tenpo_name") %> </option>
					<% } else { %>
						<option value="<%=map.get("tenpo_code") %>"> <%=map.get("tenpo_name") %> </option>
					<% } %>
				<% } %>
			</select>
			<button type="submit">ログイン</button>
		</form>
		<h3><%=lb.getMsg() %></h3>
	</div>
</body>
</html>