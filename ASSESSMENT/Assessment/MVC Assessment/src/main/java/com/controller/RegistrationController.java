package com.controller;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import jakarta.servlet.http.HttpSession;

import java.io.IOException;

import com.dao.LoginDao;
import com.dao.RegistrationDao;
import com.model.UserModel;

public class RegistrationController extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    public RegistrationController() {
        super();
        // TODO Auto-generated constructor stub
    }
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException 
	{
		String action=request.getParameter("action");
		if(action.equalsIgnoreCase("submit"))
		{
			UserModel rmodel = new UserModel();
			rmodel.setFirstname(request.getParameter("firstname"));
			rmodel.setLastname(request.getParameter("lastname"));
			rmodel.setEmail(request.getParameter("email"));
			rmodel.setMobileno(request.getParameter("mobileno"));
			rmodel.setAddress(request.getParameter("address"));
			rmodel.setGender(request.getParameter("gender"));
			rmodel.setPassword(request.getParameter("password"));
			
			int x = new RegistrationDao().userRegistration(rmodel);
			if(x > 0) {
				request.setAttribute("msg", "Record Inserted");
				request.getRequestDispatcher("login.jsp").forward(request, response);
			}else {
				request.setAttribute("msg", "Record Not inserted");
				request.getRequestDispatcher("register.jsp").forward(request, response);
			}
		}
		else if(action.equalsIgnoreCase("login"))
		{
			UserModel lmodel=new UserModel();
			lmodel.setEmail(request.getParameter("email"));
			lmodel.setPassword(request.getParameter("password"));
			
			UserModel model=new RegistrationDao().getLogin(lmodel);
			if(model!=null)
			{
				response.sendRedirect("main.jsp");
			}
			else
			{
				request.setAttribute("msg", "Invalid username or password.");
				request.getRequestDispatcher("login.jsp").forward(request, response);
			}
		}
	
	}

}
