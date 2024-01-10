<%@page import="com.ty.app.dto.Car"%>
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
  Object object=request.getAttribute("car3");
  List<Car> car1=(List<Car>) object;
%>
<table>
<head>
  <tr>
    <td>manufacture name </td>
    <td> Car name</td>
    <td> Car Type</td>
    <td> engine</td>
    <td>cylinders</td>
    <td>horse power</td>
    <td>torque</td>
    <td>image url</td>
    <td>seats</td>
    <td>boot</td>
    </tr>
    </thead>
    </tbody>
    <% for(Car car2:car1){ %>
    <tr>
    <td><%= car2.getManufacturername() %></td>
    <td><%= car2.getCarname() %></td>
    <td><%= car2.getCartype() %></td>
    <td><%= car2.getEngine() %></td>
     <td><%= car2.getCylinders() %></td>
    <td><%=  car2.getHorsepower()%></td>
    <td><%= car2.getTorque() %></td>
     <td><img src=<%= car2.getImageurl() %> width="200px" heigth="200px"></td>
    <td><%= car2.getSeatscapacity() %></td>
    <td><%= car2.getBoot() %></td>
   
    
    <%} %>
    </tbody>
</head>
</table>
</body>
</html>