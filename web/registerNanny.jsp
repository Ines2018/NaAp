<!DOCTYPE html>
<html lang="en">
    <head>
        <meta charset="utf-8">
        <meta name="viewport"    content="width=device-width, initial-scale=1.0">
        <meta name="description" content="">
        <meta name="author"      content="Sergey Pozhilov (GetTemplate.com)">

        <title>Sign up</title>

        <link rel="shortcut icon" href="assets/images/gt_favicon.png">
        <link rel="stylesheet" media="screen" href="http://fonts.googleapis.com/css?family=Open+Sans:300,400,700">
        <link rel="stylesheet" href="assets/css/bootstrap.min.css">
        <link rel="stylesheet" href="assets/css/font-awesome.min.css">
        <link rel="stylesheet" href="assets/css/bootstrap-theme.css" media="screen" >
        <link rel="stylesheet" href="assets/css/main.css">
    </head>

    <body>
        <!-- Fixed navbar -->
        <div class="navbar navbar-inverse navbar-fixed-top headroom" >
            <div class="container">
                <div class="navbar-header">
                    <!-- Button for smallest screens -->
                    <button type="button" class="navbar-toggle" data-toggle="collapse" data-target=".navbar-collapse"><span class="icon-bar"></span> <span class="icon-bar"></span> <span class="icon-bar"></span> </button>
                    <a class="navbar-brand" href="index.html">NAAP</a>
                </div>
                <div class="navbar-collapse collapse">
                    <ul class="nav navbar-nav pull-right">
                        <li><a href="index.html">Home</a></li>
                        <li><a href="about.html">About</a></li>
                        
                        <li><a href="contact.html">Contact</a></li>
                        <li class="active"><a class="btn" href="loginNanny.jsp">SIGN IN</a></li>
                    </ul>
                </div><!--/.nav-collapse -->
            </div>
        </div> 
        <!-- /.navbar -->

        <header id="head" class="secondary"></header>

        <!-- container -->
        <div class="container">

            <ol class="breadcrumb">
                <li><a href="index.html">Home</a></li>
                <li class="active">Registration</li>
            </ol>

            <div class="row">

                <!-- Article main content -->
                <article class="col-xs-12 maincontent">
                    <header class="page-header">
                        <h1 class="page-title">Registration</h1>
                    </header>

                    <div class="col-md-6 col-md-offset-3 col-sm-8 col-sm-offset-2">
                        <div class="panel panel-default">
                            <div class="panel-body">
                                <h3 class="thin text-center">Register a new Nanny account</h3><hr>

                                <form action="Controller/createNanny">
                                    <div class="top-margin">
                                        <label>Name</label>
                                        <input type="text" class="form-control" name="name">
                                    </div>
                                    <div class="top-margin">
                                        <label>Gender</label>
                                        <select name="gender">
                                            <option></option>
                                            <option>Male</option>
                                            <option>Female</option>
                                        </select>
                                    </div>
                                    <div class="top-margin">
                                        <label>Date of Birth:</label>
                                        <input type="date" class="form-control" name="dob">
                                    </div>
                                    <div class="top-margin">
                                        <label>Phone</label>
                                        <input type="number" class="form-control" name="phone">
                                    </div>
                                    <div class="top-margin">
                                        <label>Location</label>
                                        <input type="text" class="form-control" name="location">
                                    </div>
                                    <div class="top-margin">
                                        <label>Price</label>
                                        <input type="number" class="form-control" name="price">
                                    </div>
                                    <div class="top-margin">
                                        <label>Email Address <span class="text-danger">*</span></label>
                                        <input type="email" class="form-control" name="email">
                                    </div>

                                    <div class="row top-margin">
                                        <div class="col-sm-6">
                                            <label>Password <span class="text-danger">*</span></label>
                                            <input type="password" class="form-control" name="password">
                                        </div>
                                        <div class="col-sm-6">
                                            <label>Confirm Password <span class="text-danger">*</span></label>
                                            <input type="password" class="form-control" name="2password">
                                        </div>
                                    </div>

                                    <hr>

                                    <div class="row">
                                        <div class="col-lg-8">
                                            <label class="checkbox">
                                                <a href="loginNanny.jsp">Already have an account?</a>
                                            </label>                        
                                        </div>
                                        <div class="col-lg-4 text-right">
                                            <button class="btn btn-action" type="submit">Register</button>
                                        </div>
                                    </div>
                                </form>
                            </div>
                        </div>

                    </div>

                </article>
                <!-- /Article -->

            </div>
        </div>	<!-- /container -->


        <footer id="footer" class="top-space">

            <div class="footer1">
                <div class="container">
                    <div class="row">

                        <div class="col-md-3 widget">
                            <h3 class="widget-title">Contact</h3>
                            <div class="widget-body">
                                <p>+234 23 9873237<br>
                                    <a href="mailto:#">some.email@somewhere.com</a><br>
                                    <br>
                                    234 Hidden Pond Road, Ashland City, TN 37015
                                </p>	
                            </div>
                        </div>

                       
                </div>
            </div>

            <div class="footer2">
                <div class="container">
                    <div class="row">

                        <div class="col-md-6 widget">
                            <div class="widget-body">
                                <p class="simplenav">
                                    <a href="#">Home</a> | 
                                    <a href="about.html">About</a> |
                                    
                                    <a href="contact.html">Contact</a> |
                                    <b><a href="registerNanny.jsp">Sign up Nanny</a></b>
                                </p>
                            </div>
                        </div>

                        <div class="col-md-6 widget">
                            <div class="widget-body">
                                <p class="text-right">
                                    Copyright &copy; 2021 
                                </p>
                            </div>
                        </div>

                    </div> <!-- /row of widgets -->
                </div>
            </div>
        </footer>	





        <!-- JavaScript libs are placed at the end of the document so the pages load faster -->
        <script src="http://ajax.googleapis.com/ajax/libs/jquery/1.10.2/jquery.min.js"></script>
        <script src="http://netdna.bootstrapcdn.com/bootstrap/3.0.0/js/bootstrap.min.js"></script>
        <script src="assets/js/headroom.min.js"></script>
        <script src="assets/js/jQuery.headroom.min.js"></script>
        <script src="assets/js/template.js"></script>
    </body>
</html>