/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.thesoftwareguild.sitelab.dao;

import java.io.IOException;
import java.io.PrintWriter;
import java.text.DecimalFormat;
import java.util.ArrayList;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 *
 * @author apprentice
 */
@WebServlet(name = "InterestCalculatorServlet", urlPatterns = {"/InterestCalculatorServlet"})
public class InterestCalculatorServlet extends HttpServlet {

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
            out.println("<title>Servlet InterestCalculatorServlet</title>");
            out.println("</head>");
            out.println("<body>");
            out.println("<h1>Servlet InterestCalculatorServlet at " + request.getContextPath() + "</h1>");
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
        RequestDispatcher rd = request.getRequestDispatcher("intCalc");
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

        String interestRateString = request.getParameter("annIntRate");
        Double aInterest = Double.parseDouble(interestRateString);

        String principalString = request.getParameter("principal");
        Double principal = Double.parseDouble(principalString);

        String yearsString = request.getParameter("years");
        Integer years = Integer.parseInt(yearsString);

        //converts to percentage
        double qInterest = ((aInterest / 4) * .01);

        //quarterly interest earned
        double intEarnedQ = principal * qInterest;

        //quarterly updataed principal is principal + quarterly interest
        double nPrincipal = principal + intEarnedQ;

        //calls the method
        ArrayList<String> results = calcQuarterEarnings(aInterest, principal, qInterest, years);

        request.setAttribute("results", results);
        RequestDispatcher rd = request.getRequestDispatcher("results");
        rd.forward(request, response);

    }

    public ArrayList<String> calcQuarterEarnings(double aInterest, double principal, double qInterest, double years) {
        DecimalFormat df = new DecimalFormat("#.00");
        int thisYear = 2015;
        ArrayList<String> results = new ArrayList<>();

        //Loop through the calculations for each year
        for (int i = 0; i < years; i++) {

            double nPrincipal = principal; //holds value for year end principal 

            String first = ("\nYEAR: " + thisYear + "\nSTARTING PRINCIPAL: $" + df.format(principal));

            //This loop calculates compounded quarterly interest and the year end principal 
            for (int x = 0; x < 4; x++) {
                //quarterly interest earned
                double intEarnedQ = principal * qInterest;
               //System.out.println("new interest earned " + intEarnedQ);

                //principal + quarterly interest
                principal = principal + intEarnedQ;
                //System.out.println("new principal " + principal);
            }

            //this variable holds the value for the yearEnd principal
            double yearEnd = principal - nPrincipal;

            String last = ("\nTOTAL INTEREST ACCRUED $" + df.format(yearEnd) + "\nYEAR END PRINCIPAL: $" + df.format(principal));

            thisYear += 1;//this increments the calendar year by 1.

            String message = first + last;
            results.add(message);
        }
        return results;

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
