<%@ page language="java" contentType="text/html; charset=utf-8"
    pageEncoding="utf-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=utf-8">
<title>Insert title here</title>
 <link href="resources/style.css" rel="stylesheet" type="text/css">
</head>
<body>
	<h1>NEWS PORTAL</h1>
	<form action="Controller" method="post">
		<input type="hidden" name="command" value="registration"/>
		<input type="submit" value="Registration" />
	</form>
	<br />
	<form action="Controller" method="post">
	    <input type="hidden" name="command" value="authorization"/>
		<input type="submit" value="Authorization" />
	</form>
</body>
</html>