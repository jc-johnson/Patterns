<%@page import ="main.java.MVC"%>
<%@ page import="main.java.MVC.LoginBean" %>

<p>You are successfully logged in!</p>
<%
    LoginBean bean = (LoginBean)request.getAttribute("bean");
    out.print("Welcome, "+bean.getName());

%>