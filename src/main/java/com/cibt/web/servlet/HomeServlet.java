/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.cibt.web.servlet;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 *
 * @author apple
 */
@WebServlet(value = {"/","/home"})
public class HomeServlet extends HttpServlet{

    @Override
    protected void doGet(HttpServletRequest request, 
            HttpServletResponse response) 
            throws ServletException, IOException {
        request.setAttribute("name", "CIBT");
        request.setAttribute("colors", new String[]{"red","green","blue"});
        request.getRequestDispatcher("/WEB-INF/views/index.jsp")
                .forward(request, response);
    }
    
}
