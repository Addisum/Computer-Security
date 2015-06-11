<!DOCTYPE html>
<%-- 
    Document   : baseJS
    Created on : May 15, 2015, 3:08:28 AM
    Author     : Addisu
--%>

<%@page contentType="text/html" pageEncoding="utf-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib prefix="spring" uri="http://www.springframework.org/tags"%>
<html lang="en">
    <head>
        <meta charset="utf-8">
        <meta name="viewport" content="width=device-width, initial-scale=1.0">
        <meta name="description" content="">
        <meta name="author" content="Bayansuren">
        <meta name="keyword" content="MUMScrum">
        <link rel="shortcut icon" href="img/favicon.png">

        <title>404</title>

        <!-- Bootstrap core CSS -->
        <link href="<c:url value="/resources/css/bootstrap.min.css" />" rel="stylesheet">
              <link href="<c:url value="/resources/css/bootstrap-reset.css" />" rel="stylesheet">
        <!--external css-->
        <link href="<c:url value="/resources/assets/font-awesome/css/font-awesome.css" />" rel="stylesheet" />
        <!-- Custom styles for this template -->
        <link href="<c:url value="/resources/css/style.css" />" rel="stylesheet">
        <link href="<c:url value="/resources/css/style-responsive.css" />" rel="stylesheet" />

        <!-- HTML5 shim and Respond.js IE8 support of HTML5 tooltipss and media queries -->
        <!--[if lt IE 9]>
        <script src="js/html5shiv.js"></script>
        <script src="js/respond.min.js"></script>
        <![endif]-->
    </head>




    <body class="body-404">

        <div class="container">

            <section class="error-wrapper">
                <i class="icon-404"></i>
                <h1>403</h1>
                <h2>Doesn't have enough permissions </h2>
                <p class="page-403">Your permission doesn't enough. <a href="../">Return Home</a></p>
            </section>

        </div>


    </body>
</html>
