<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<jsp:useBean id="lb" class="been.LoginBeen" scope="request"></jsp:useBean>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<form action="login" method="post">
		<div>
			<h1>ログイン</h1>
			<div>
				<h2>ID</h2>
				<input type="text" name="id" value="<%=lb.getId()%>">
				<h2>PASS</h2>
				<input type="password" name="pass" value="<%=lb.getPass()%>">
				<button type="submit"> ログイン </button>
			</div>
		</div>
	</form>
	<%=lb.getMsg()%>
</body>
</html>