<%@page import="com.Model.Student"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<link rel="stylesheet" href="https://fonts.googleapis.com/css?family=Sofia">
<meta charset="ISO-8859-1">
<title>Update</title>
<style >
input[type=text] {
  width: 60%;
  padding: 10px;
  margin: 10px;
  box-sizing: border-box;
  border: 3px solid rgba(252, 0, 228, 0.63);
  display: list-item;
 
  }
  
 
.ff{
width: 60%;
  margin: 30px auto;
  


}
input[type=submit] {
  width: 15%;
  font-family:"sofia";
  box-sizing: border-box;
  border: 2px solid blue;
  border-radius: 10px;
  font-size: 16px;
  background-color: black;
  color: white;
  margin-left:0%;
 padding:20px;
  cursor: pointer;
  text-align: center;
 
}.h{
font-family:sofia;
text-align: center;
color:rgba(104, 83, 255, 0.81);

}
  </style>
</head>
<body>
<h1 class="h">Update Details</h1>
<div align="center">
<form action="update" method="post" class="ff" >
<%Student ss=(Student)request.getAttribute("student"); 
request.getAttribute("sucess");
%>
	

Roll Number<input type="text" name="roll" value="<%=ss.getRoll()  %>"readonly="readonly">
Name<input type="text" name="name" value ="<%=ss.getName() %>">
Course<input type="text" name="course" value="<%=ss.getCourse() %>">
Location<input type="text" name="location" value="<%=ss.getLocation() %>">

<input type="submit" value="update"> 

</form>
</div>

</body>
</html>