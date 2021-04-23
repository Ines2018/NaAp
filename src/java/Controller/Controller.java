/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controller;

import Model.Nanny;
import Model.Skill;
import java.io.IOException;
import java.io.PrintWriter;
import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 *
 * @author Ineza
 */
@WebServlet(urlPatterns = {"/Controller/createNanny","/Controller/addSkills","/Controller/removeSkills","/Controller/saveNanny","/Controller/loginNanny"})
public class Controller extends HttpServlet {

    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        String path = request.getServletPath();
        
        switch (path) {
            case "/Controller/createNanny":
                createNanny(request, response);
                break;
                
            case "/Controller/addSkills":
                addSkills(request, response);
                break;
                
            case "/Controller/removeSkills":
                removeSkills(request, response);
                break;
                
            case "/Controller/saveNanny":
                saveNanny(request, response);
                break;
                
            case "/Controller/logoutNanny":
                logoutNanny(request,response);
                break;
            
            case "/Controller/loginNanny":
                break;
                
            case "/Controller/logoutParent":
                break;
              
            case "/Controller/loginParent":
                break;
        }
    }
    
        private void createNanny(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {

        RequestDispatcher dis = request.getRequestDispatcher("/chooseSkill.jsp");

        String name = request.getParameter("name");
        String gender = request.getParameter("gender");
        String date = request.getParameter("dob");
        DateFormat format = new SimpleDateFormat("yyyy-mm-dd");
        Date dob = null;
        try {
            dob = format.parse(date);
        } catch (ParseException ex) {
            Logger.getLogger(Controller.class.getName()).log(Level.SEVERE, null, ex);
        }
        String phone = request.getParameter("phone");
        String email = request.getParameter("email");
        String location = request.getParameter("location");
        Double price = Double.parseDouble(request.getParameter("price"));
        String password = request.getParameter("password");

        Nanny nan = new Nanny();
        nan.setName(name);
        nan.setGender(gender);
        nan.setDob(dob);
        nan.setPhone(phone);
        nan.setEmail(email);
        nan.setLocation(location);
        nan.setPrice(price);
        nan.setPassword(password);
        request.getSession().setAttribute("nannies", nan);
        response.sendRedirect("../chooseSkills.jsp");

    }
    
    
    private void logoutNanny(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {

        RequestDispatcher dis = request.getRequestDispatcher("/chooseSkills.jsp");

        request.getSession().setAttribute("nannies", null);
        response.sendRedirect("../index.html");

    }

    private void addSkills(HttpServletRequest request, HttpServletResponse response) 
            throws ServletException, IOException {
        
         RequestDispatcher dis = request.getRequestDispatcher("chooseSkills.jsp");
         String code = request.getParameter("code");
         
         Nanny n = (Nanny) request.getSession().getAttribute("nannies");
         
         if (n==null) {
            dis = request.getRequestDispatcher("/RegisterNanny.jsp");
            response.sendRedirect("../RegisterNanny.jsp");
        }
         
        GenericDao<Skill> sdao = new GenericDao<Skill>(Skill.class);
        Skill s = sdao.findById(code);
        n.registerSkill(s);

        response.sendRedirect("../chooseSkills.jsp");
         
        
    }

    private void removeSkills(HttpServletRequest request, HttpServletResponse response) 
             throws ServletException, IOException {
        
         RequestDispatcher dis = request.getRequestDispatcher("/chooseSkills.jsp");
         String code = request.getParameter("code");
         
         Nanny n = (Nanny) request.getSession().getAttribute("nannies");
         
         if (n==null) {
            dis = request.getRequestDispatcher("/RegisterNanny.jsp");
            response.sendRedirect("../RegisterNanny.jsp");
        }
         
        GenericDao<Skill> sdao = new GenericDao<Skill>(Skill.class);
        Skill s = sdao.findById(code);
        n.removeSkill(s);

        response.sendRedirect("../chooseSkills.jsp");
         
     
     
            
    }

    private void saveNanny(HttpServletRequest request, HttpServletResponse response) 
             throws ServletException, IOException {
        
         RequestDispatcher dis = request.getRequestDispatcher("/viewBookings.jsp");
         
         Nanny n = (Nanny) request.getSession().getAttribute("nannies");
         
         if (n==null) {
            dis = request.getRequestDispatcher("/RegisterNanny.jsp");
            dis.forward(request, response);
        }
         
        GenericDao<Nanny> sdao = new GenericDao<Nanny>(Nanny.class);
        
        sdao.create(n);

        response.sendRedirect("../viewBookings.jsp");
         
        
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
