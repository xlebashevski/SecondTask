package by.itacademy.newsportal.controller;

import java.io.IOException;

import jakarta.servlet.ServletException;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

public interface Command {
 void execute(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException;
}
