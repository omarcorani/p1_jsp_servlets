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


@WebServlet(name = "Cambio_Moneda", urlPatterns = {"/Cambio_Moneda"})
public class Cambio_Moneda extends HttpServlet {


    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        response.setContentType("text/html;charset=UTF-8");
        PrintWriter out = response.getWriter();
              try {
            /* TODO output your page here. You may use following sample code. */
            out.println("<!DOCTYPE html>");
            out.println("<html>");
            out.println("<head>");
            out.println("<title>Cambio_Moneda</title>");            
            out.println("</head>");
            out.println("<body>");
            out.println("<h1>Introduce el Monto a cambiar</h1>");
            
            out.println("<form name='form' id='form1' action='Cambio_Moneda' method='post'>");
            out.println("<table border='1'>");
            out.println("<tr>");

            out.println("<tr>");
            out.println("<td>Bs a $us: :</td>");
            out.println("<td><input type='number' min='1' name='sus' ></td>");
            out.println("</tr>");
            out.println("<tr>");
            out.println("<td>$us a Bs</td>");
            out.println("<td><input type='number' min='7' name='bs' ></td>");
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
        response.setContentType("text/html;charset=UTF-8");
        PrintWriter out = response.getWriter();
        
        int Sus = Integer.parseInt(request.getParameter("sus"));
        int Bs = Integer.parseInt(request.getParameter("bs"));
        
         try {
            /* TODO output your page here. You may use following sample code. */
            out.println("<!DOCTYPE html>");
            out.println("<html>");
            out.println("<head>");
            out.println("<title>Cambio_Moneda</title>");            
            out.println("</head>");
            out.println("<body>");
            out.println("<h1>Las Monedas Fueron Cambiadas</h1>");
            out.println("<h2>Cifras:</h2>");
            out.println("<b>Bs a $us :</b>" + (Bs / 6.90) + "Dolares <br>" );
            out.println("<b>$us a Bs :</b>" + (Sus * 6.90) + "Dolares <br>" );
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
