<%@ page language="java" contentType="text/html; charset=UTF-8"
    import="javax.servlet.RequestDispatcher"
    pageEncoding="UTF-8"%>
<%
	request.setAttribute("name", "김승준");
	request.setAttribute("address", "부산시 사상구");

%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title> session 내장 객체 스코프 테스트 </title>
</head>
<body>

<%
	RequestDispatcher dispatch = request.getRequestDispatcher("request2.jsp");
	dispatch.forward(request, response);
%>

</body>
</html>