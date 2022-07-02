<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>hello..</title>
</head>
<body bgcolor="lightgreen">

<br><br><br>

<h3>You are successfully logged in...!!</h3>


<br><br>

<%


	//HttpSession ses=request.getSession(false);
	//			String s1=(String)ses.getAttribute("bean");
//	out.print("Welcome  "+// s1);

	LoginBean bean=(LoginBean)request.getAttribute("bean");

	out.print(bean.getName());

%>





</body>
</html>