<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<jsp:useBean id="lb" class="bean.LoginBean" scope="request"></jsp:useBean>
<%@ page import="java.util.List" %>
<%@ page import="java.util.Map" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>ログイン</title>
<link href="https://cdn.jsdelivr.net/npm/bootstrap@5.0.2/dist/css/bootstrap.min.css" rel="stylesheet" integrity="sha384-EVSTQN3/azprG1Anm3QDgpJLIm9Nao0Yz1ztcQTwFspd3yD65VohhpuuCOmLASjC" crossorigin="anonymous">
</head>
<body>
	<div class="container">
		<h2>薬品在庫管理システム</h2>
		<h3>--ログイン--</h3>
		<div class="row justify-content-center">
			<div class="col-sm-8 bg-info text-white">
				<form action="" method="post">
					<div class="form-group">
						<label>社員コード</label>
						<input class="form-control" type="text" name="shain_code" value="<%=lb.getShain_code() %>" required>
					</div>
					<div class="form-group">
						<label>パスワード</label>
						<input class="form-control" type="password" name="password" value="<%=lb.getPassword() %>" required>
					</div>
					<div class="form-group">
						<label>店舗</label>
						<select name="tenpo_code" class="form-control">
							<option value="">--店舗を選択</option>
							<% for(Map<String,String> map: lb.getList()) { %>
								<% if(map.get("tenpo_code").equals(lb.getTenpo_code())) { %>
									<option value='<%=map.get("tenpo_code") %>' selected><%=map.get("tenpo_name") %></option>
								<% } else { %>
									<option value='<%=map.get("tenpo_code") %>'><%=map.get("tenpo_name") %></option>
								<% } %>
							<% } %>
						</select>
					</div>
					<div class="form-group text-center">
						<button type="submit" class="btn btn-dark">ログイン</button>
					</div>
				</form>
				<%=lb.getMsg() %>
			</div>
		</div>
	</div>
</body>
</html>