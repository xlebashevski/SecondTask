package by.itacademy.newsportal.controller;

import java.util.HashMap;
import java.util.Map;

import by.itacademy.newsportal.controller.impl.GoToAuthorizationPage;
import by.itacademy.newsportal.controller.impl.GoToRegistrationPage;
import by.itacademy.newsportal.controller.impl.GoToAuthorizatedUserPage;

public class CommandProvider {
	private Map<CommandName, Command> commands = new HashMap<>();
	
	public CommandProvider() {
		commands.put(CommandName.AUTHORIZATION, new GoToAuthorizationPage());
		commands.put(CommandName.REGISTRATION, new GoToRegistrationPage());
		commands.put(CommandName.AUTHORIZATED_USER_PAGE, new GoToAuthorizatedUserPage());
		commands.put(CommandName.REGISTRATED_USER_PAGE, new GoToAuthorizatedUserPage());
	}
	
	public Command findCommand(String name) {
		CommandName commandName = CommandName.valueOf(name.toUpperCase());
		Command command = commands.get(commandName);
		return command;
	}
}
