
package com.practica;

import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


@WebServlet(name = "Operadores", urlPatterns = {"/Operadores"})
public class Operadores extends HttpServlet {

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
            out.println("<title>Servlet Operadores</title>");            
            out.println("</head>");
            out.println("<body>");
            
            out.println("<h1>Operadores</h1>");
            out.println("<form action='' method='post'>");
            out.println("1er Digito :");
            out.println("<input type='number' name='txtnum1' ><br>");
            
            out.println("2do Digito :");
            out.println("<input type='number' name='txtnum2' ><br>");
            
            out.println("Seleccione un Operador :");
            out.println("<select name='operaciones'>");
            out.println("<option value='1' >Suma</option>");
            out.println("<option value='2' >Resta</option>");
            out.println("<option value='3' >Producto</option>");
            out.println("<option value='4' >Divición</option>");
            out.println("</select>");
            out.println("<br>");
            out.println("<input type='submit' value='Procesar'>");
            out.println("<br>");
            
             out.println("</form>"); 
            out.println("</body>");
            out.println("</html>");
        }finally{
            out.close();
        }
    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        
        response.setContentType("text/html;charset=UTF-8");
        PrintWriter out = response.getWriter();
         //int ope = Integer.parseInt(request.getParameter("operaciones"));
         
         try{
         
      double n1=0, n2=0, r=0;

       int valor;

       n1= Double.parseDouble(request.getParameter("txtnum1"));

       n2= Double.parseDouble(request.getParameter("txtnum2"));

       valor=Integer.parseInt(request.getParameter("operaciones"));
        out.println("<br><br>");
       if(valor==1){
           
           r=n1+n2;
           
           out.print("<b>La suma es : </b>" +r);

       }else if(valor==2){

           r=n1-n2;

           out.print("<b>La resta es : </b>" +r);

       }else if(valor==3){

           r=n1*n2;

           out.print("<b>El producto es : </b>" +r);

       }else if(valor==4){

           r=n1/n2;

           out.print("<b>El resto de la división es : </b>" +r);

       } 
            out.println("<br><br>");
            out.println("<a href='Operadores'><input type='submit' value='Regresar'></a>");
            out.println("<br><br><br>");
            out.println("<a href='index.jsp'><input type='submit' value='Ir a Inicio' ></a>");
           }finally{
             out.close();
         }
    }

}
