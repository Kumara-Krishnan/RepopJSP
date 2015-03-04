/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controllers;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 *
 * @author MRuser
 */
public class Verify extends HttpServlet {

    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {

        String sname = request.getParameter("sname");
        String sno = request.getParameter("sno");
        String sage = request.getParameter("sage");
        long mobile = 0;
        int age=0;
        ArrayList<String> errors = new ArrayList<String>();
        if (sname.isEmpty()) {
            errors.add("Please Enter Name");
        }
        if (sno.isEmpty()) {
            errors.add("Please Enter Mobile Number");
        }else {
            try {
                mobile = Long.parseLong(sno);
            } catch (NumberFormatException e) {
                errors.add("Please Enter Valid Mobile Number");
            }
        }
        if (sage.isEmpty()) {
            errors.add("Please Enter Mobile Number");
        }else {
            try {
                age = Integer.parseInt(sage);
            } catch (NumberFormatException e) {
                errors.add("Please Enter Valid age");
            }
        }

        if(errors.isEmpty())
        {
            //contact model
        request.getRequestDispatcher("Success.jsp").forward(request, response);
        }
        else
        {
         request.setAttribute("err", errors);
        request.getRequestDispatcher("index.jsp").forward(request, response);
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
        processRequest(request, response);
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
        processRequest(request, response);
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
