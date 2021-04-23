<%-- 
    Document   : chooseSkills
    Created on : Apr 19, 2021, 2:42:31 PM
    Author     : Ineza
--%>

<%@page import="java.util.List"%>
<%@page import="Model.Skill"%>
<%@page import="Controller.GenericDao"%>
<%@page import="Model.Nanny"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Choose Skills</title>
        <meta charset="utf-8">
        <meta content="width=device-width, initial-scale=1.0" name="viewport">



        <!-- Vendor CSS Files -->
        <link href="1assets/vendor/aos/aos.css" rel="stylesheet">
        <link href="1assets/vendor/bootstrap/css/bootstrap.min.css" rel="stylesheet">
        <link href="1assets/vendor/bootstrap-icons/bootstrap-icons.css" rel="stylesheet">
        <link href="1assets/vendor/glightbox/css/glightbox.min.css" rel="stylesheet">
        <link href="1assets/vendor/swiper/swiper-bundle.min.css" rel="stylesheet">

        <!-- Template Main CSS File -->
        <link href="1assets/css/style.css" rel="stylesheet">
    </head>
    <body>
        
        <%
            Nanny nanny = (Nanny) request.getSession().getAttribute("nannies");
            
            if (nanny == null) {
                response.sendRedirect("./RegisterNanny.jsp");
            }
            
            GenericDao<Skill>sdao = new GenericDao<>(Skill.class);
            List <Skill> skills= sdao.findAll();
            
            
        %>
        <header id="header" class="d-flex align-items-center">
            <div class="container d-flex align-items-center justify-content-between">

                <a href="index.html" class="logo mr-auto"><img src="1assets/img/logo.png" alt=""></a>
                <!-- Uncomment below if you prefer to use a text logo -->
                <!-- <h1 class="logo mr-auto"><a href="index.html">Imperial</a></h1> -->

                <nav id="navbar" class="navbar">
                    <ul>
                        <li><a class="nav-link scrollto active" href="#hero">Home</a></li>
                        <li><a class="nav-link scrollto" href="#about">About</a></li>
                        <li><a class="nav-link scrollto" href="#services">Services</a></li>

                        <li><a class="nav-link scrollto" href="#testimonials">Testimonials</a></li>

                        <li><a class="nav-link scrollto" href="#contact">Contact</a></li>
                        <li><a class="btn-get-started" href="Login.jsp">Login</a></li>

                    </ul>
                    <i class="bi bi-list mobile-nav-toggle"></i>
                </nav><!-- .navbar -->

            </div>
        </header>
        <div style="width: 700px;margin: auto;padding: 80px; margin:5px;">
             <h3>List of skills</h3>
        <ul class="list-group">
            <%
            for (Skill s :skills){
           
           
            
                    
            %>
            <li class="list-group-item d-flex justify-content-between align-items-center">
                <%=s.getName()%>
                <%
                    if(nanny.ExistingSkill(s.getCode())){
                        
                    
                
                %>
                <a href="Controller/removeSkills?code=<%=s.getCode() %>" class="btn btn-danger " tabindex="-1" role="button" aria-disabled="true">Remove</a>
              
                <%
                }else{
                %>
               
                 <a href="Controller/addSkills?code=<%=s.getCode() %>" class="btn btn-primary " tabindex="-1" role="button" aria-disabled="true">Add</a>
                <%}%>
            </li>
            <%}%>
            
        </ul>
            <a href="Controller/saveNanny" class="btn btn-primary " tabindex="-1" role="button" aria-disabled="true">Add my skills</a>
        </div>
    </body>
</html>
