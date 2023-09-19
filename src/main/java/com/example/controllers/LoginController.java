package com.example.controllers;

import java.io.IOException;

import jakarta.servlet.ServletException;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

import com.example.models.User;

public class LoginController extends HttpServlet {

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws IOException, ServletException {
        String url = "/index.html";

        String action = request.getParameter("action");

        if (action == null)
            action = "join";

        if (action.equals("join"))
            url = "/index.html";

        else if (action.equals("add")) {
            String firstname = request.getParameter("firstName");
            String lastname = request.getParameter("lastName");
            String email = request.getParameter("email");
            User user = new User(lastname, firstname, email);

            request.setAttribute("user", user);
            url = "/login.jsp";
        }

        getServletContext().getRequestDispatcher(url).forward(request, response);
    }

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        String url = "/index.html"; // URL mặc định cho yêu cầu GET

        // Xử lý yêu cầu GET tại đây (nếu cần)

        getServletContext().getRequestDispatcher(url).forward(request, response);
    }
}
