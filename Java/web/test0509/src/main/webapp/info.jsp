<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<jsp:useBean id="gb" class="bean.GuitarBean" scope="request"></jsp:useBean>

<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Guitar詳細</title>
<link rel="stylesheet" href="https://stackpath.bootstrapcdn.com/bootstrap/4.3.1/css/bootstrap.min.css">
</head>
<body>
	<div class="container">
		<div class="row justify-content-center">
			<div class="col-md-10">
				<div class="card mt-3">
					<div class="card-header">
						<h3 class="text-center">Infomation</h3>
					</div>
					<div class="card-body">
						<div class="text-center">
							<img alt="ストラトキャスター" src="<%=gb.getMap().get("images").toString() %>" class="img-fluid">
						</div>
						<div class="form-group">
							<label>名称</label>
							<h4 class="text-center"><%=gb.getMap().get("name").toString() %></h4>
						</div>
						<div class="form-group">
							<label>メーカー</label>
							<h4 class="text-center"><%=gb.getMap().get("maker").toString() %></h4>
						</div>
						<div class="form-group">
							<label>特徴</label>
							<p><%=gb.getMap().get("featuer").toString() %></p>
						</div>
						<div class="form-group">
							<label>代表的な愛用者</label>
							<p><%=gb.getMap().get("famous_user").toString() %></p>
						</div>
						<div class="form-group">
							<label>製造開始年</label>
							<p><%=gb.getMap().get("production_start").toString() %></p>
						</div>
						<div >
							<a href="guitars"><button class=" btn-primary form-control">一覧へ戻る</button></a>
						</div>

					</div>
				</div>
			</div>

		</div>
	</div>


</body>
</html>