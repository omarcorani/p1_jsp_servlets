/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.practica;

import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 *
 * @author Usuario
 */
@WebServlet(name = "Edad", urlPatterns = {"/Edad"})
public class Edad extends HttpServlet {
    
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        
        response.setContentType("text/html;charset=UTF-8");
        PrintWriter out = response.getWriter();
                try{
            /* TODO output your page here. You may use following sample code. */
 
            out.println("<!DOCTYPE html>");
            out.println("<html>");
            out.println("<head>");
            out.println("<title>Servlet Edad</title>");            
            out.println("</head>");
            out.println("<body>");
            
            out.println("<form name='form' id='form1' action='Edad' method='post'>");
            out.println("<table border='1'>");
            out.println("<tr>");
            out.println(" <td>Nombre :</td>");
            out.println("<td><input type='text' name='txtNombre' required></td>");
            out.println("</tr>");
            out.println("<tr>");
            out.println("<td>Año Actual :</td>");
            out.println("<td><input type='number' max=2020 name='txtActual' required></td>");
            out.println("</tr>");
            out.println("<tr>");
            out.println("<td>Año de Nacimiento</td>");
            out.println("<td><input type='number' max='2020' name='txtNac' required></td>");
            out.println("</tr>");
            out.println("<tr>");
            out.println("<td colspan='2'>");
            out.println("<input type='submit' value='Enviar'>");
            out.println("</td>");
            out.println("</tr>");
            out.println("</table>");
                
            out.println("</form>");
            out.println("</body>");
            out.println("</html>");
        } finally {
            out.close();
        }
    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        
        String nombre = request.getParameter("txtNombre");
        int actual = Integer.parseInt(request.getParameter("txtActual"));
        int nacimiento = Integer.parseInt(request.getParameter("txtNac"));
        
         response.setContentType("text/html;charset=UTF-8");
        PrintWriter out = response.getWriter();
                try{
            /* TODO output your page here. You may use following sample code. */
 
            out.println("<!DOCTYPE html>");
            out.println("<html>");
            out.println("<head>");
            out.println("<title>Servlet Edad</title>");            
            out.println("</head>");
            out.println("<body>");
            
            out.println("<h1>Datos</h1>");
            out.println("<b>Nombre:</b> " + nombre + "<br>");
            out.println("<b>Año de Nacimiento:</b> " + nacimiento+  "<br>");
            out.println("<b>Edad:</b> " + "<mark>"+(actual-nacimiento)+" años</mark> <br>");
            out.println("<br>");
            out.println("<a href='Edad'><input type='submit' value='Regresar' ></a>");
            out.println("<br><br><br>");
            out.println("<a href='index.jsp'><input type='submit' value='Ir a Inicio' ></a>");
            
            out.println("</body>");
            out.println("</html>");
        } finally { 
            out.close();
        }
    }

}
