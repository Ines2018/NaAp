<%-- 
    Document   : test
    Created on : Apr 23, 2021, 11:31:17 AM
    Author     : Ineza
--%>

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
        <h1>Hello World!</h1>

        <p>
            <a class="btn btn-primary" data-toggle="collapse" href="#collapseExample" role="button" aria-expanded="false" aria-controls="collapseExample">
                Link with href
            </a>
            <button class="btn btn-primary" type="button" data-toggle="collapse" data-target="#collapseExample" aria-expanded="false" aria-controls="collapseExample">
                Button with data-target
            </button>
        </p>
        <div class="collapse" id="collapseExample">
            <div class="card card-body">
                Some placeholder content for the collapse component. This panel is hidden by default but revealed when the user activates the relevant trigger.
            </div>
        </div>
    </body>
</html>
