package org.anzo;


import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Iterator;
import java.util.List;

public class BeerSelect extends HttpServlet {

    public void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
//        resp.setContentType("text/html");
//        PrintWriter out = resp.getWriter();
//
//        out.println("Beer Selection Advice <br> ");
        String c = req.getParameter("color");

        BeerExpert br = new BeerExpert();
        List s = br.getBrand(c);

//        out.println("Try"+ s);
//
//        out.println("<br> Got beer " + c);


        req.setAttribute("styles",s);
        RequestDispatcher view = req.getRequestDispatcher("result.jsp");
        view.forward(req , resp);



    }

}
