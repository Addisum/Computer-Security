<%-- 
    Document   : navigation
    Created on : May 12, 2015, 12:09:33 PM
    Author     : Addisu
--%>

<%--<%@page contentType="text/html" pageEncoding="utf-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib prefix="security" uri="http://www.springframework.org/security/tags" %>
   Welcome <%= request.getUserPrincipal().toString() %>--%>
<div class="row state-overview">
    <div class="col-lg-3 col-sm-6">
        <section class="panel">
            <div class="symbol terques">
                <i class="fa fa-user"></i>
            </div>
            <div class="value">
                <h1 class="count">
                    0
                </h1>
                <p>Logged in</p>
            </div>
        </section>
    </div>
    <div class="col-lg-3 col-sm-6">
        <section class="panel">
            <div class="symbol red">
                <i class="fa fa-tags"></i>
            </div>
            <div class="value">
                <h1 class=" count2">
                    0
                </h1>
                <p>Total users</p>
            </div>
        </section>
    </div>
    <div class="col-lg-3 col-sm-6">
        <section class="panel">
            <div class="symbol yellow">
                <i class="fa fa-shopping-cart"></i>
            </div>
            <div class="value">
                <h1 class=" count3">
                    0
                </h1>
                <p>Active Pages</p>
            </div>
        </section>
    </div>
    <div class="col-lg-3 col-sm-6">
        <section class="panel">
            <div class="symbol blue">
                <i class="fa fa-bar-chart-o"></i>
            </div>
            <div class="value">
                <h1 class=" count4">
                    0
                </h1>
                <p>Total Profit</p>
            </div>
        </section>
    </div>
</div>
<!--state overview end-->

