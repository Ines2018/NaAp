<%-- 
    Document   : Login
    Created on : Apr 19, 2021, 5:37:20 PM
    Author     : Ineza
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
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
         <header id="header" class="d-flex align-items-center">
    <div class="container d-flex align-items-center justify-content-between">

      <a href="index_2.html" class="logo mr-auto"><img src="1assets/img/logo.png" alt=""></a>
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
  </header><!-- End Header -->
        <form>
            
            <div style="width: 700px;margin: auto;padding: 80px; margin: inherit">
                <label for="Email" class="form-label">Email address</label>
                <input type="email" class="form-control" id="InputEmail">


                <label for="Password" class="form-label">Password</label>
                <input type="password" class="form-control" id="InputPassword">

                <div id="passwordHelpBlock" class="form-text">
                    Your password must be 8-20 characters long, contain letters and numbers, and must not contain spaces, special characters, or emoji.
                </div>

                <br>
                <button type="submit" class="btn btn-primary">Submit</button>
            </div>

        </form>
    </body>
</html>
