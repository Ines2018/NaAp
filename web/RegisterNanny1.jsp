<%-- 
    Document   : RegisterNanny
    Created on : Apr 19, 2021, 1:44:11 PM
    Author     : Ineza
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta charset="utf-8">
        <meta content="width=device-width, initial-scale=1.0" name="viewport">

        <title>Register Nanny</title>
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
                        <li><a class="btn-get-started" href="#">Login</a></li>

                    </ul>
                    <i class="bi bi-list mobile-nav-toggle"></i>
                </nav><!-- .navbar -->

            </div>
        </header><!-- End Header -->

        <div style="width: 700px;margin: auto;padding: 80px; margin: inherit">

            <form action="Controller/createNanny">

                <label for="Name" class="form-label">Name</label>
                <input type="name" class="form-control" name="name" required="">

                <label for="Gender" class="form-label">Gender</label>
               <!--                <input type="gender" class="form-control" name="gender">-->

                <select class="form-control" name="gender" required>
                    <option></option>
                    <option>Male</option>
                    <option>Female</option>
                </select>

                <label for="dob" class="form-label">DOB</label>
                <input type="date" class="form-control" name="dob">


                <label for="Phone" class="form-label">Phone</label>
                <input type="phone" class="form-control" name="phone">

                <label for="Location" class="form-label">Location</label>
                <input type="location" class="form-control" name="location">

                <label for="Price" class="form-label">Price</label>
                <input type="price" class="form-control" name="price">

                <label for="Email" class="form-label">Email address</label>
                <input type="email" class="form-control" name="email">


                <label for="Password" class="form-label">Password</label>
                <input type="password" class="form-control" name="password">

                <div id="passwordHelpBlock" class="form-text">
                    Your password must be 8-20 characters long, contain letters and numbers, and must not contain spaces, special characters, or emoji.
                </div>

                <br>
                <button type="submit" class="btn btn-primary">Create my Account</button>
            </form>
        </div>


    </body>

</html>
