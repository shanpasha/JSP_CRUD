package com.controller;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.Model.Student;
import com.Service.ServiceImpl;


public class AddStudent extends HttpServlet {
	private static final long serialVersionUID = 1L;



	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		ServiceImpl impl=new ServiceImpl();
				
	int roll=Integer.parseInt(request.getParameter("roll"));
		String name=request.getParameter("name");
		String course=request.getParameter("course");
		String location=request.getParameter("location");
		
		Student stu=new Student(name, roll, course, location);
		impl.AddStudent(stu);
		request.setAttribute("sucess", "Added sucessfully...");
		request.getRequestDispatcher("getData").forward(request, response);
		
	}
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		doPost(request, response);
	}
}
