<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<h2>ログイン画面</h2>
	<form action="home.jsp" method="post">
		<table>
       <tr>
         <th>ID</th>
         <td>
           <input type="text" name="id">
         </td>
       </tr>
       <tr>
         <th>パスワード</th>
         <td>
           <input type="password" name="pass">
         </td>
       </tr>
       <tr>
         <td colspan="2" style="text-align:center">
           <button type="submit">登録</button>
         </td>
       </tr>
     </table>
	</form>
</body>
</html>