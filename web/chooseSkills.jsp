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
         <meta charset="utf-8">
  <meta content="width=device-width, initial-scale=1.0" name="viewport">

  <title>First Page</title>
  <link href="https://fonts.googleapis.com/css?family=Open+Sans:300,300i,400,400i,700,700i|Raleway:300,400,500,700,800" rel="stylesheet">

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

            GenericDao<Skill> sdao = new GenericDao<>(Skill.class);
            List<Skill> skills = sdao.findAll();


        %>
        <!-- Fixed navbar -->
        <div class="navbar navbar-inverse navbar-fixed-top headroom" >
            <div class="container">
                <div class="navbar-header">
                    <!-- Button for smallest screens -->
                    <button type="button" class="navbar-toggle" data-toggle="collapse" data-target=".navbar-collapse"><span class="icon-bar"></span> <span class="icon-bar"></span> <span class="icon-bar"></span> </button>
                    <a class="navbar-brand" href="index.html"><img src="assets/images/logo.png" alt="Progressus HTML5 template"></a>
                </div>
                <div class="navbar-collapse collapse">
                    <ul class="nav navbar-nav pull-right">
                        <li><a href="index.html">Home</a></li>
                        <li><a href="about.html">About</a></li>
                        <li class="dropdown">
                            <a href="#" class="dropdown-toggle" data-toggle="dropdown">More Pages <b class="caret"></b></a>
                            <ul class="dropdown-menu">
                                <li><a href="sidebar-left.html">Left Sidebar</a></li>
                                <li><a href="sidebar-right.html">Right Sidebar</a></li>
                            </ul>
                        </li>
                        <li><a href="contact.html">Contact</a></li>
                        <li class="active"><a class="btn" href="signin.html">SIGN IN / SIGN UP</a></li>
                    </ul>
                </div><!--/.nav-collapse -->
            </div>
        </div> 
        <!-- /.navbar -->

        <header id="head" class="secondary"></header>
        <div style="width: 700px;margin: auto;padding: 80px; margin:5px;">
            <h3>List of skills</h3>
            <ul class="list-group">
                <%                for (Skill s : skills) {


                %>
                <li class="list-group-item d-flex justify-content-between align-items-center">
                    <%=s.getName()%>
                    <%
                        if (nanny.ExistingSkill(s.getCode())) {


                    %>
                    <a href="Controller/removeSkills?code=<%=s.getCode()%>" class="btn btn-danger " tabindex="-1" role="button" aria-disabled="true">Remove</a>

                    <%
                    } else {
                    %>

                    <a href="Controller/addSkills?code=<%=s.getCode()%>" class="btn btn-primary " tabindex="-1" role="button" aria-disabled="true">Add</a>
                    <%}%>
                </li>
                <%}%>

            </ul>
            <a href="Controller/saveNanny" class="btn btn-primary " tabindex="-1" role="button" aria-disabled="true">Add my skills</a>
        </div>
    </body>
</html>
