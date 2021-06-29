package by.itacademy.newsportal.controller.impl;

import java.io.IOException;

import by.itacademy.newsportal.controller.Command;
import jakarta.servlet.RequestDispatcher;
import jakarta.servlet.ServletException;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

public class GoToRegistratedUserPage implements Command{

	@Override
	public void execute(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String path = "/WEB-INF/jsp/registratedUserPage";
		RequestDispatcher requestDispatcher = request.getRequestDispatcher(path);
		requestDispatcher.forward(request, response);
		
	}
	
}
