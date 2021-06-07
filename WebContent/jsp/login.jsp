<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>

<form action = "../servlet/authenticate" method = "post" >
ユーザーID<input type = "text" name = "user"><br>
パスワード<input type = "text" name = "pass"><br>
<input type = "submit" value = "ログイン"><br>

</form>

</body>
</html>