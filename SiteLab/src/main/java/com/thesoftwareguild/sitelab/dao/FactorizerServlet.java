/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.thesoftwareguild.sitelab.dao;


import com.thesoftwareguild.sitelab.model.Factor;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 *
 * @author Jonathan Chiou
 */
@WebServlet(name = "FactorizerServlet", urlPatterns = {"/FactorizerServlet"})
public class FactorizerServlet extends HttpServlet {

    /**
     * Processes requests for both HTTP <code>GET</code> and <code>POST</code>
     * methods.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        response.setContentType("text/html;charset=UTF-8");
        try (PrintWriter out = response.getWriter()) {
            /* TODO output your page here. You may use following sample code. */
            out.println("<!DOCTYPE html>");
            out.println("<html>");
            out.println("<head>");
            out.println("<title>Servlet FactorizerServlet</title>");
            out.println("</head>");
            out.println("<body>");
            out.println("<h1>Servlet FactorizerServlet at " + request.getContextPath() + "</h1>");
            out.println("</body>");
            out.println("</html>");
        }
    }

    // <editor-fold defaultstate="collapsed" desc="HttpServlet methods. Click on the + sign on the left to edit the code.">
    /**
     * Handles the HTTP <code>GET</code> method.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        RequestDispatcher rd = request.getRequestDispatcher("factorizer");
        rd.forward(request, response);
    }

    /**
     * Handles the HTTP <code>POST</code> method.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
     
        
        String userInputString = request.getParameter("userNumber");
        Integer userInput = Integer.parseInt(userInputString);
        int factorSum = 0;// Track the sum of factors to evaluate if perfect number

        String message = "Factors of " + userInput + " are: ";

        
        ArrayList<Factor> factorList = new ArrayList<>();
        Factor factor = null;
        //for loop to find factors
        for (int i = 1; i <= userInput; i++) {
            factor = new Factor();
            
            if (userInput == i) {
                factorSum = factorSum + i;
            } else if (userInput % i == 0) {                
                factor.setValue(i);
                factorSum = factorSum + i;
                 factorList.add(factor);
            } else {
            //do nothing!
        }
       
        }

        String primeMessage = "";
        //if conditional to test if prime or not
        if (factorSum == userInput + 1) {
            primeMessage = userInput + " is prime.";
        } else {
            primeMessage = userInput + " is not prime.";
        }

        String perfectMessage = "";
        //if condition to test if perfect or not
        if (factorSum - userInput == userInput) {
            perfectMessage = userInput + " is a perfect number.";
        } else {
            perfectMessage = userInput + " is not a perfect number.";
        }

        request.setAttribute("message", message);
        request.setAttribute("factorList", factorList);
        request.setAttribute("primeMessage", primeMessage);
        request.setAttribute("perfectMessage", perfectMessage);

        RequestDispatcher rd = request.getRequestDispatcher("factorizerOutput");
        rd.forward(request, response);

    }

    /**
     * Returns a short description of the servlet.
     *
     * @return a String containing servlet description
     */
    @Override
    public String getServletInfo() {
        return "Short description";
    }// </editor-fold>

}
