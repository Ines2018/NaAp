<%-- 
    Document   : listNannies
    Created on : Apr 23, 2021, 12:19:26 PM
    Author     : Ineza
--%>

<%@page import="Model.Skill"%>
<%@page import="java.util.List"%>
<%@page import="Controller.GenericDao"%>
<%@page import="Model.Nanny"%>
<%@page import="Model.Parent"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta charset="utf-8">
        <meta name="viewport"    content="width=device-width, initial-scale=1.0">
        <meta name="description" content="">
        <meta name="author"      content="Sergey Pozhilov (GetTemplate.com)">

        <title>View Nanny</title>

        <link rel="shortcut icon" href="assets/images/gt_favicon.png">

        <link rel="stylesheet" media="screen" href="http://fonts.googleapis.com/css?family=Open+Sans:300,400,700">
        <link rel="stylesheet" href="assets/css/bootstrap.min.css">
        <link rel="stylesheet" href="assets/css/font-awesome.min.css">
        <link rel="stylesheet" href="assets/css/bootstrap-theme.css" media="screen" >
        <link rel="stylesheet" href="assets/css/main.css">
    </head>
    
    <%
        Parent parent = (Parent) request.getSession().getAttribute("parent");
        if(parent == null){
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
    <%
        } else {
    %>
    <body style="background-color:#232323">

        <%
            GenericDao<Nanny> ndao = new GenericDao<>(Nanny.class);
            List<Nanny> nannies = ndao.findAll();
        %>
       
        
        <div class="navbar navbar-inverse navbar-fixed-top headroom" >
            <div class="container">
                <div class="navbar-header">
                    <button type="button" class="navbar-toggle" data-toggle="collapse" data-target=".navbar-collapse"><span class="icon-bar"></span> <span class="icon-bar"></span> <span class="icon-bar"></span> </button>
                    <a class="navbar-brand" href="index.html">NAAP</a>
                </div>
                <div class="navbar-collapse collapse">
                    <ul class="nav navbar-nav pull-right">
                        <li><a href="index.html">Home</a></li>
                        <li><a href="about.html">About</a></li>
    
                        <li><a href="contact.html">Contact</a></li>
                        <li class="active"><a class="btn" href="parentController/logoutParent">Sign out</a></li>
                    </ul>
                </div>
            </div> 
        </div>
            <!-- /.navbar -->


            <header id="head" class="secondary"></header>

            <div class="container">

                <h3 style="color:white"> View a nanny and book them </h3>

                <ul class="list-group">
                    <%
                        int i = 0;
                        for (Nanny n : nannies) {
                            i++;
                    %>
                    <li class="list-group-item"><div class="card">
                            <div class="card-header" id="headingThree">
                                <h5 class="mb-0">

                                    <button class="btn btn-link collapsed" data-toggle="collapse" data-target="#collapse<%=i%>">
                                        <img src="./assets/images/1_1.jpg" class="mr-3" alt="...">&nbsp;&nbsp;&nbsp;&nbsp;<%=n.getName()%>
                                    </button>
                                </h5>
                            </div>
                            <div id="collapse<%=i%>" class="collapse" data-parent="#accordion">
                                <div class="card-body">
                                    <div class="media">
                                        <div class="media-body">
                                            <h4 class="mt-0">Price: <%=n.getPrice()%> RWF/hour</h4>
                                            <h4>Skills</h4>
                                            <ul>
                                                <%
                                                    for (Skill s : n.getSkill()) {
                                                %>
                                                <li><%=s.getName()%></li>

                                                <%
                                                    }
                                                %>
                                            </ul>
                                        </div>
                                    </div>
                                </div>
                                <%
                                    if(parent.isExist(n.getEmail())){
                                %>
                                <a class="btn btn-outline-danger" href="parentController/removeNanny?email=<%=n.getEmail()%>" role="button">Cancel Nanny</a>
                                <%
                                   } else {
                                %>
                                <a class="btn btn-danger" href="parentController/chooseNanny?email=<%=n.getEmail() %>" role="button">Choose Nanny</a>
                                <%
                                    }
                                %>
                            </div>

                        </div>
                    </li>
                    <%                        }
                    %>
                </ul>

            </div>
    </body>
    
    <% } %>

    <!-- JavaScript libs are placed at the end of the document so the pages load faster -->
    <script src="http://ajax.googleapis.com/ajax/libs/jquery/1.10.2/jquery.min.js"></script>
    <script src="http://netdna.bootstrapcdn.com/bootstrap/3.0.0/js/bootstrap.min.js"></script>
    <script src="assets/js/headroom.min.js"></script>
    <script src="assets/js/jQuery.headroom.min.js"></script>
    <script src="assets/js/template.js"></script>
</html>
