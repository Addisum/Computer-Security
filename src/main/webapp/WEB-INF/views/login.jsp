<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<%@ taglib prefix="spring" uri="http://www.springframework.org/tags"%>

<link rel="stylesheet"	href="//netdna.bootstrapcdn.com/bootstrap/3.0.0/css/bootstrap.min.css">
<html lang="en">
    <head>
        <meta charset="utf-8">
        <meta name="viewport" content="width=device-width, initial-scale=1.0">
        <meta name="description" content="">
        <meta name="author" content="Bayansuren">
        <meta name="keyword" content="MUMSCRUM">
        <link rel="shortcut icon" href="img/favicon.png">

        <title>Com system</title>

        <!-- Bootstrap core CSS -->
        <link href="<c:url value="/resources/css/bootstrap.min.css" />" rel="stylesheet">
        <link href="<c:url value="/resources/css/bootstrap-reset.css" />" rel="stylesheet">
        <!--external css-->
        <link href="<c:url value="/resources/assets/font-awesome/css/font-awesome.css" />" rel="stylesheet" />
        <!-- Custom styles for this template -->
        <link href="<c:url value="/resources/css/style.css" />" rel="stylesheet">
        <link href="<c:url value="/resources/css/style-responsive.css" />" rel="stylesheet" />
    </head>


    <body class="login-body">

        <div class="container">
            <form class="form-signin" action="<c:url value="/j_spring_security_check"></c:url>" method="post">
                    <h2 class="form-signin-heading">sign in now</h2>

                <c:if test="${not empty error}">
                    <div class="alert alert-danger">
                        <spring:message
                            code="AbstractUserDetailsAuthenticationProvider.badCredentials" />
                        <br />
                    </div>
                </c:if>
                <div class="login-wrap">
                    <input type="text" name='j_username' class="form-control" placeholder="User ID" autofocus>
                    <input type="password" name='j_password' class="form-control" placeholder="Password">
                    <label class="checkbox">
                        <input type="checkbox" value="remember-me"> Remember me
                        <span class="pull-right">
                            <a data-toggle="modal" href="#myModal"> Forgot Password?</a>

                        </span>
                    </label>
                    <button class="btn btn-lg btn-login btn-block" type="submit">Sign in</button>
                </div>

                <!-- Modal -->
                <div aria-hidden="true" aria-labelledby="myModalLabel" role="dialog" tabindex="-1" id="myModal" class="modal fade">
                    <div class="modal-dialog">
                        <div class="modal-content">
                            <div class="modal-header">
                                <button type="button" class="close" data-dismiss="modal" aria-hidden="true">&times;</button>
                                <h4 class="modal-title">Forgot Password ?</h4>
                            </div>
                            <div class="modal-body">
                                <p>Enter your e-mail address below to reset your password.</p>
                                <input type="text" name="email" placeholder="Email" autocomplete="off" class="form-control placeholder-no-fix">

                            </div>
                            <div class="modal-footer">
                                <button data-dismiss="modal" class="btn btn-default" type="button">Cancel</button>
                                <button class="btn btn-success" type="button">Submit</button>
                            </div>
                        </div>
                    </div>
                </div>
                <!-- modal -->

            </form>

        </div>

        <!-- js placed at the end of the document so the pages load faster -->
        <script src="<c:url value="/resources/js/jquery.js" />"></script>
        <script src="<c:url value="/resources/js/bootstrap.min.js" />"></script>


    </body>
</html>

