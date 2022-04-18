<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<jsp:useBean id="lb" class="bean.LoginBean" scope="request"></jsp:useBean>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<form action="login" method="post">
		<div>
			<h1>計算ページ</h1>
			<div style="display:flex;, aline-items: center;">
				<input type="text" name="num1" value="<%=lb.getNum1()%>">
				<p>+</p>
				<input type="text" name="num2" value="<%=lb.getNum2()%>">
				<button type="submit"> 計算 </button>
			</div>
		</div>
	</form>
	<%=lb.getAnswer()%>
	<%=lb.getMsg()%>
</body>
</html>