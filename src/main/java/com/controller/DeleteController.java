package com.controller;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.Service.ServiceImpl;


public class DeleteController extends HttpServlet {
	private static final long serialVersionUID = 1L;

	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		ServiceImpl service=new ServiceImpl();
	int roll=Integer.parseInt(request.getParameter("roll"));
	
		service.delete_by_ID(roll);
		request.setAttribute("sucess", "Record Successfully Deleted");
		request.getRequestDispatcher("getData").forward(request, response);
		
		
		
	}
	

}
