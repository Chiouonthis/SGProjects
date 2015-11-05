/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.thesoftwareguild.sitelab.dao;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.Random;
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
@WebServlet(name = "LuckySevensServlet", urlPatterns = {"/LuckySevensServlet"})
public class LuckySevensServlet extends HttpServlet {

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
            out.println("<title>Servlet LuckySevensServlet</title>");
            out.println("</head>");
            out.println("<body>");
            out.println("<h1>Servlet LuckySevensServlet at " + request.getContextPath() + "</h1>");
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
        RequestDispatcher rd = request.getRequestDispatcher("luckyEntry");
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

        String startingFunds = request.getParameter("startingFunds"); //get player funds
        Integer convertedFunds = Integer.parseInt(startingFunds); //convert to int
       
        String message = "";
        String endGameMessage = "";
        
        if (convertedFunds <= 0) {
            message = "You need to enter a value greater than 0 in order to play!";
        } else {
            message = "Ok, we'll start playing with $" + convertedFunds + ". Good luck!";

            int maxFunds = convertedFunds;
            int rollCounter = 0;
            int maxTurn = 0;

            Random rGen = new Random();//generates random number

            //THIS LOOP CONTROLS THE DICE ROLLS
            do {
               
                int d1 = rGen.nextInt(6) + 1;//we add one since this starts at 0
             
                int d2 = rGen.nextInt(6) + 1; //ditto as above for the second die
               
                int dSum = d1 + d2; //adds two values
             
                rollCounter += 1; //increments the number of rolls by 1
               
                if (dSum == 7) {
                    convertedFunds += 4;
          
                } else {
                    convertedFunds -= 1;
                 
                }

                //Keep track of max winnings and then turn when that happened.
                if (convertedFunds > maxFunds) {
                    maxFunds = convertedFunds; //maxFunds gets the value of funds, if that variable's value is greater than what maxFunds originally was
                    maxTurn = rollCounter;//ditto for maxTurn
                }
                //When funds are greater than 0, the game continues
            } while (convertedFunds > 0);

            //If funds reach 0 or lower, then the game ends and stats are given.
            if (convertedFunds <= 0) {
                endGameMessage = "You lasted " + rollCounter + " turns!"
                        + "Too bad you didn't stop at turn " + maxTurn + ", "
                        + "you had $" + maxFunds + " then!";

            }
        }
        
          
            request.setAttribute("message", message);
            request.setAttribute("endGameMessage", endGameMessage);
            RequestDispatcher rd = request.getRequestDispatcher("luckyResult");
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
