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

        <title>500</title>

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

    <body class="body-500">

        <div class="container">

            <section class="error-wrapper">
                <i class="icon-500"></i>
                <h1>Ouch!</h1>
                <h2>500 Page Error</h2>
                <p class="page-500">Looks like Something went wrong. <a href="../">Return Home</a></p>
            </section>

        </div>


    </body>
</html>
