package com.controller;

import java.io.IOException;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.Model.Student;
import com.Service.ServiceImpl;

/**
 * Servlet implementation class UpdateController
 */
public class UpdateController extends HttpServlet {
	private static final long serialVersionUID = 1L;

	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		ServiceImpl service = new ServiceImpl();
		int id = Integer.parseInt(request.getParameter("shan"));
		Student ss = service.GetbyId(id);

		request.setAttribute("student", ss);
		request.getRequestDispatcher("updateStudent.jsp").forward(request, response);

	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

		int roll = Integer.parseInt(request.getParameter("roll"));
		String name = request.getParameter("name");
		String course = request.getParameter("course");
		String location = request.getParameter("location");

		Student st = new Student(name, roll, course, location);

		ServiceImpl service = new ServiceImpl();

		service.update(st);
		request.setAttribute("sucess", "Sucessfully updated...");

		request.getRequestDispatcher("getData").forward(request, response);

	}

}
