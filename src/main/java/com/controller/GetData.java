package com.controller;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.Model.Student;
import com.Service.Service;
import com.Service.ServiceImpl;

public class GetData extends HttpServlet {
	private static final long serialVersionUID = 1L;

   
  

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		PrintWriter p=response.getWriter();
	ServiceImpl service=new ServiceImpl();
	List<Student> stu=service.GetAll();
	
	

	request.setAttribute("stu",stu );
	request.getRequestDispatcher("list-Students.jsp").forward(request, response);
	
	
	

	
	
	}

	@Override
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
	doGet(request, response);
	}
}
