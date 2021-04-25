/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controller;

import Model.Nanny;
import Model.Parent;
import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 *
 * @author Ineza
 */
@WebServlet(urlPatterns = {"/parentController/registerParent", "/parentController/loginParent", "/parentController/logoutParent", "/parentController/chooseNanny", "/parentController/removeNanny"})
public class ParentController extends HttpServlet {

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
        String path = request.getServletPath();

        switch (path) {
            case "/parentController/registerParent":
                registerParent(request, response);
                break;
            case "/parentController/loginParent":
                loginParent(request, response);
                break;
            case "/parentController/logoutParent":
                logoutParent(request, response);
                break;
            case "/parentController/chooseNanny":
                chooseNanny(request, response);
                break;
            case "/parentController/removeNanny":
                removeNanny(request, response);
                break;
        }
    }

    protected void registerParent(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        Parent p = new Parent();
        String name = request.getParameter("name");
        String phone = request.getParameter("phone");

        String location = request.getParameter("location");
        String email = request.getParameter("email");

        String password = request.getParameter("password");

        p.setName(name);
        p.setPhone(phone);
        p.setLocation(location);
        p.setEmail(email);
        p.setPassword(password);

        GenericDao<Parent> pdao = new GenericDao<>(Parent.class);
        pdao.create(p);
        request.getSession().setAttribute("parent", p);

        response.sendRedirect("../listNannies.jsp");
    }

    protected void loginParent(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        String email = request.getParameter("email");
        String password = request.getParameter("password");

        GenericDao<Parent> pdao = new GenericDao<>(Parent.class);

        try {

            Parent parent = pdao.findById(email);
            if (parent != null && parent.getPassword().equals(password)) {
                request.getSession().setAttribute("parent", parent);
                response.sendRedirect("../listNannies.jsp");
            } else {
                response.sendRedirect("../errorPage.jsp");
            }
        } catch (Exception e) {
            response.sendRedirect("../errorPage.jsp");
        }

    }
    
    protected void logoutParent(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        request.getSession().setAttribute("parent", null);
        response.sendRedirect("../index.html");

    }
    
    protected void chooseNanny(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        String nannyEmail = request.getParameter("email");
        GenericDao<Nanny> ndao = new GenericDao<>(Nanny.class);
        GenericDao<Parent> pdao = new GenericDao<>(Parent.class);
        Nanny nanny = ndao.findById(nannyEmail);
        Parent parent =(Parent) request.getSession().getAttribute("parent");
        
        parent.AddAppointment(nanny);
        nanny.addParent(parent);
        pdao.update(parent);
        ndao.update(nanny);
        request.getSession().setAttribute("parent", parent);
        response.sendRedirect("../listNannies.jsp");

    }
    
    protected void removeNanny(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        String nannyEmail = request.getParameter("email");
        GenericDao<Nanny> ndao = new GenericDao<>(Nanny.class);
        GenericDao<Parent> pdao = new GenericDao<>(Parent.class);
        Nanny nanny = ndao.findById(nannyEmail);
        Parent parent =(Parent) request.getSession().getAttribute("parent");
        
        parent.removeAppointnment(nanny);
        nanny.removeParent(parent);
        pdao.update(parent);
        ndao.update(nanny);
        request.getSession().setAttribute("parent", parent);
        response.sendRedirect("../listNannies.jsp");

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
