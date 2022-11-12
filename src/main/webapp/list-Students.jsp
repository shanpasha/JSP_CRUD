<%@page import="com.Model.Student"%>
<%@page import="java.util.List"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>GetStudents</title>
<link rel="stylesheet" href="https://fonts.googleapis.com/css?family=Sofia">
<style>

table{
padding: 10px;
margin-top:50px;
 border: 3px solid rgba(245, 40, 145, 0.8);
 width: 70%;
 height: 100%;
 margin-left: auto;
 margin-right: auto;
 
}
th{
padding: 10px;
margin: 5px;

}
td{
padding: 5px;
margin: 5px;
font-family: cursive;

}
.op:link ,.op:visited {
  background-color: #f44336;
  color: white;
  padding: 15px 25px;
  text-align: center;
  text-decoration: none;
  display: inline-block;
}

.op:hover, .op:active {
  background-color: red;
 
}

.s{
font-family:cursive;
color: blue;
text-align: center;

}

.h{
font-family:sofia;
text-align: center;
color:rgba(104, 83, 255, 0.81);

}
.home{
font-family:sofia; 
font-size:20px;

padding:10px 15px;
border :2px solid rgba(138, 81, 81, 0.63);
background-color:rgba(241, 0, 188, 0.37);

}
.home:hover{
background-color: rgba(6, 192, 67, 0.8);
}

</style>



</head>
<body>
<h1 class=h>Student Management System</h1>

<a class=home href="index.jsp">Home</a>
<a  class=home href="Add.jsp">Add Student</a>

<%
List<Student> students =(List<Student>) request.getAttribute("stu");

%>


<table border="5px">


<tr><th>Roll Number</th>

<th>Name</th>
<th>course</th>
<th>Location</th>
<th colspan="2" >Options</th>

</tr>


<tr>

<%

for(Student st:students){
	
%>





<td><%out.print(st.getRoll()); %></td>
<td><%out.print(st.getName()); %></td>
<td><%out.print(st.getCourse()); %></td>
<td><%out.print(st.getLocation()); %></td>

<td> <a class=op href="update?shan=<%= st.getRoll() %>">Edit</a>
</td>
<td> <a  class=op href="delete?roll=<%= st.getRoll() %>">Delete</a>

</td>
</tr>



<%} %>




</table>


<%if(request.getAttribute("sucess")!=null){%>
	
	<h3 class="s"><%out.print(request.getAttribute("sucess")); %></h3>
	
<%} %>


</body>
</html>