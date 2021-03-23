package controller;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class SearchController extends HttpServlet   {
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		try {
			
			String name=request.getParameter("abstract"); 
			System.out.println("Sendin response "+name);
			Thread t1 = new Thread();
			t1.sleep(1000);
			request.setAttribute("errorMessage", "No matces found for "+name);
			//response.sendRedirect("success.jsp",);
			request.getRequestDispatcher("/success.jsp").forward(request, response);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
