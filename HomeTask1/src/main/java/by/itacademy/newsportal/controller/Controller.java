package by.itacademy.newsportal.controller;


import java.io.IOException;

import jakarta.servlet.ServletException;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

public class Controller extends HttpServlet {
	private static final long serialVersionUID = 1L;
	private static final String COMMAND_REQUEST_PARAM = "command";
	private final CommandProvider provider = new CommandProvider();
 
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		doPost(request, response);
	}
	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		response.setContentType("text/html");

		User user = new User();
		user.setLogin("Vasya");
		user.setPassword("1991");

		request.setAttribute("user", user);
		
		
		String commandName = request.getParameter(COMMAND_REQUEST_PARAM);
		Command command = provider.findCommand(commandName);
		command.execute(request, response);
	}
}

