
<%@page import="java.util.List"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
 <% 
     List<String> op=(List<String>) request.getAttribute("name");
 %>
 <%
     for(String m:op){
 %>
     <%= m%>
     <%
        }
     %>
     
 
 
</body>
</html>