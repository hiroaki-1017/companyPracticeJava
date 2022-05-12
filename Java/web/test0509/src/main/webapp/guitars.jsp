<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<jsp:useBean id="gb" class="bean.GuitarBean" scope="request"></jsp:useBean>
<%@ page import="java.util.List" %>
<%@ page import="java.util.Map" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>ギター名鑑</title>
<link rel="stylesheet" href="https://stackpath.bootstrapcdn.com/bootstrap/4.3.1/css/bootstrap.min.css">
</head>
<body>
	<div class="container">
		<div class="row justify-content-center">
			<div class="col-md-8">
				<h2 class="text-center my-3">Guitarー一覧</h2>
				<table class="table table-striped table-bordered">
					<tr>
						<th>name</th>
						<th>maker</th>
						<th>info</th>
					</tr>
					<% for(Map<String,Object> map : gb.getList()){ %>
						<tr>
							<td><%=map.get("name") %></td>
							<td><%=map.get("maker") %></td>
							<td>
								<form action="guitars" method="post">
									<input type="hidden" name="id" value="<%=map.get("id").toString() %>">
									<input type="hidden" name="name" value="<%=map.get("name").toString() %>">
									<input type="hidden" name="maker" value="<%=map.get("maker").toString() %>">
									<input type="hidden" name="type" value="<%=map.get("type").toString() %>">
									<input type="hidden" name="featuer" value="<%=map.get("featuer").toString() %>">
									<input type="hidden" name="famous_user" value="<%=map.get("famous_user").toString() %>">
									<input type="hidden" name="production_start" value="<%=map.get("production_start").toString() %>">
									<input type="hidden" name="images" value="<%=map.get("images").toString() %>">
									<button type="submit" class="bgn btn-primary">Info</button>
								</form>
							</td>
						</tr>
					<% } %>
				</table>
			</div>
		</div>
	</div>
</body>
</html>