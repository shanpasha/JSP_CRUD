<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<link rel="stylesheet" href="https://fonts.googleapis.com/css?family=Sofia">
<meta charset="ISO-8859-1">
<title>Add Student</title>
<style >
input[type=text] {
  width: 60%;
  padding: 10px;
  margin: 0px;
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
.home{
font-family:sofia; 
font-size:20px;
margin:20px;
padding:10px 15px;
border :2px solid rgba(138, 81, 81, 0.63);
background-color:rgba(241, 0, 188, 0.37);

}
.home:hover{
background-color: rgba(6, 192, 67, 0.8);
}

  </style>
</head>
<h1 class="h">Add Student</h1>
<body class="bod">
<a  href="index.jsp" class="home" >Home</a>
<div align="center">
<form action="add" method="post" class="ff" >

Roll Number<input type="text" name="roll" required="required"  placeholder="Roll Number"><br><br>
Name<input type="text" name="name" required="required" placeholder="Name"><br><br>
Course<input type="text" name="course" required="required" placeholder="Course"><br><br>
Location<input type="text" name="location" required="required" placeholder="Location"><br><br>
<h3><%request.getAttribute("sucess"); %></h3>
<input type="submit" value="save" > 
 
</form>
</div>
</body>
</html>