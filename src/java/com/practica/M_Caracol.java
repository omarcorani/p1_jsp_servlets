
package com.practica;

import java.io.IOException;
import java.io.PrintWriter;
import static java.lang.System.out;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import  java.util.Scanner; 
@WebServlet(name = "M_Caracol", urlPatterns = {"/M_Caracol"})
public class M_Caracol extends HttpServlet {

     /*public  static  void  main ( String [] args ) {
        int scanner de =  nuevo  scanner ( Sistema .de);
        Sistema . fuera . impresión ( " Dimesión De La Matriz: " );
        int n = en . nextInt ();
        mostrarMatriz (generarMatrizCaracol (n, 1 ), n, n);
    }*/

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
            out.println("<title>Servlet M_Caracol</title>");            
            out.println("</head>");
            out.println("<body>");
            out.println("<h1>Generar Matriz Caracol</h1>");
            out.println("<form action='' name='caracol'>");
            out.println("<p>Introdusca la Dimencion de la Matriz: </p>");
            out.println("<input type='number' min='1' name='num'>");
            out.println("<br>");
            out.println("<input type='submit' value='Procesar'>");
            out.println("</form>");

            out.println("</body>");
            out.println("</html>");
            
            
           
      
    
        } finally{
           out.close();           
        }
    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        
        response.setContentType("text/html;charset=UTF-8");
        PrintWriter out = response.getWriter();
        
        try{
        int n = Integer.parseInt(request.getParameter("caracol"));
        int i;
        generarMatrizCaracol(n,1);
        
        out.println("<!DOCTYPE html>");
            out.println("<html>");
            out.println("<head>");
            out.println("<title>Servlet M_Caracol</title>");            
            out.println("</head>");
            out.println("<body>");
  out.println("<table border='1' cellspacing='0'>");
	 	out.println("<tr>");
                generarMatrizCaracol(n,1);
	out.println("<th>"+ n +"</th>");
	 		for(i=0;i<=n-1;i++)
	 		out.println("<td>"+ i +"</td>");
	 	out.println("</tr>");
	 out.println("</table>");
            out.println("</body>");
            out.println("</html>");
       
        }finally{
            out.close();
        }
    }
        
   public  static  void  mostrarMatriz ( int [] [] M , int  f , int  c ) {
        for( int i =  1 ; i <= f; i ++ ) {
            for ( int j =  1 ; j <= c; j ++ ) {
                out.println("\t"+ M[i][j]);
            }
            out.println();
        }
    } 
   
    public static int[][] generarMatrizCaracol(int n, int x) {
   int[][] M = new int[n + 1][n + 1];
   for (int a = 1; a <= n / 2; a++) {
      for (int i = a; i <= n - a; i++) {
         M[a][i] = x;
         x++;
      }
      for (int i = a; i <= n - a; i++) {
         M[i][n - a + 1] = x;
         x++;
      }
      for (int i = n - a + 1; i >= a + 1; i--) {
         M[n - a + 1][i] = x;
         x++;
      }
      for (int i = n - a + 1; i >= a + 1; i--) {
         M[i][a] = x;
         x++;
      }
   }
   if (n % 2 == 1) {
      M[n / 2 + 1][n / 2 + 1] = x;
   }
   return M;
}
    
}
