<%-- 
    Document   : viewBookings
    Created on : Apr 19, 2021, 5:09:07 PM
    Author     : Ineza
--%>

<%@page import="Model.Parent"%>
<%@page import="Model.Nanny"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta charset="utf-8">
        <meta name="viewport"    content="width=device-width, initial-scale=1.0">
        <meta name="description" content="">
        <meta name="author"      content="Sergey Pozhilov (GetTemplate.com)">

        <title>View your new Parents</title>

        <link rel="shortcut icon" href="assets/images/gt_favicon.png">

        <link rel="stylesheet" media="screen" href="http://fonts.googleapis.com/css?family=Open+Sans:300,400,700">
        <link rel="stylesheet" href="assets/css/bootstrap.min.css">
        <link rel="stylesheet" href="assets/css/font-awesome.min.css">

        <!-- Custom styles for our template -->
        <link rel="stylesheet" href="assets/css/bootstrap-theme.css" media="screen" >
        <link rel="stylesheet" href="assets/css/main.css">
    </head>


    <%
        Nanny nanny = (Nanny) request.getSession().getAttribute("nanny");

        if (nanny == null) {

    %>
    <body>
        <div class="page-wrap d-flex flex-row align-items-center">
            <div class="container">
                <div class="row justify-content-center">
                    <div class="col-md-12 text-center">
                        <span class="display-1 d-block">404</span>
                        <div class="mb-4 lead">The page you are looking for was not found.</div>
                        <a href="index.html" class="btn btn-link">Back to Home</a>
                    </div>
                </div>
            </div>
        </div>
    </body>

    <%    } else {
    %>


    <body>
        <div class="navbar navbar-inverse navbar-fixed-top headroom" >
            <div class="container">
                <div class="navbar-header">
                    <!-- Button for smallest screens -->
                    <button type="button" class="navbar-toggle" data-toggle="collapse" data-target=".navbar-collapse"><span class="icon-bar"></span> <span class="icon-bar"></span> <span class="icon-bar"></span> </button>
                    <a class="navbar-brand" href="index.html"><img src="assets/images/logo.png" alt="Progressus HTML5 template"></a>
                </div>
                <div class="navbar-collapse collapse">
                    <ul class="nav navbar-nav pull-right">
                        <li class="active"><a href="#">Home</a></li>
                        <li><a href="about.html">About</a></li>
                        <li class="dropdown">
                            <a href="#" class="dropdown-toggle" data-toggle="dropdown">More Pages <b class="caret"></b></a>
                            <ul class="dropdown-menu">
                                <li><a href="sidebar-left.html">Left Sidebar</a></li>
                                <li class="active"><a href="sidebar-right.html">Right Sidebar</a></li>
                            </ul>
                        </li>
                        <li><a href="contact.html">Contact</a></li>>
                        <li><a class="btn" href="Controller/logoutNanny">Logout</a></li>
                    </ul>
                </div><!--/.nav-collapse -->
            </div>
        </div>


            <header id="head" class="secondary"></header>
            <div class="container">
                <h2>View Bookings</h2>  
                <ul class="list-group">
                    <%
                        int i=0;
                        for(Parent p : nanny.getParents()) {
                            i++;
                    %>
                    <li class="list-group-item"><div class="card">
                            <div class="card-header" id="headingThree">
                                <h5 class="mb-0">

                                    <button class="btn btn-link collapsed" data-toggle="collapse" data-target="#collapse<%=i%>">
                                        <%=p.getName() %>
                                    </button>
                                </h5>
                            </div>
                            <div id="collapse<%=i%>" class="collapse" data-parent="#accordion">
                                <div class="card-body">
                                    <div class="media">
                                        <div class="media-body">
                                            <h4 class="mt-0">Email: <%=p.getEmail()%></h4>
                                            <h4>Phone: <%=p.getPhone()%></h4>
                                            <h4>Location: <%=p.getLocation()%>
                                                </br>
                                                </br>
                                                </br>
                                                <p>Press on the "Talk via Email" to discuss further<p>
                                        </div>
                                    </div>
                                </div>
                                <a class="btn btn-primary" href="mailto:<%=p.getEmail()%>" role="button">Talk via Email</a>
                            </div>

                        </div>
                    </li>
                    <%
                        }
                    %>
                </ul>
            </div>






            <script src="http://ajax.googleapis.com/ajax/libs/jquery/1.10.2/jquery.min.js"></script>
            <script src="http://netdna.bootstrapcdn.com/bootstrap/3.0.0/js/bootstrap.min.js"></script>
            <script src="assets/js/headroom.min.js"></script>
            <script src="assets/js/jQuery.headroom.min.js"></script>
            <script src="assets/js/template.js"></script>
    </body>

    <%
        }
    %>
</html>
