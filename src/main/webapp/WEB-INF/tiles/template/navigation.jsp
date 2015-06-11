<%-- 
    Document   : navigation
    Created on : May 12, 2015, 12:09:33 PM
    Author     : Addisu
--%>

<%@page contentType="text/html" pageEncoding="utf-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib prefix="spring" uri="http://www.springframework.org/tags"%>
<%@ taglib prefix="security" uri="http://www.springframework.org/security/tags" %>
<aside>
    <div id="sidebar"  class="nav-collapse ">
        <!-- sidebar menu start-->
        <ul class="sidebar-menu" id="nav-accordion">
            <li>
                <a class="active" href="<spring:url value="/"/>">
                    <i class="fa fa-dashboard"></i>
                    <span>Dashboard</span>
                </a>
            </li>
            <security:authorize access="hasAnyRole('ROLE_ADMIN','ROLE_HR')"> 
                <li class="sub-menu">
                    <a href="javascript:;">
                        <i class="fa fa-comments-o"></i>
                        <span>Employee</span>
                    </a>

                    <ul class="sub">
                        <li><a href="<spring:url value="/employee/list"/>">List</a></li>
                        <li><a href="<spring:url value="/employee/add"/>">Add</a></li>
                    </ul>
                </li>
            </security:authorize>

            <security:authorize access="hasAnyRole('ROLE_ADMIN')"> 
                <li class="sub-menu">
                    <a href="javascript:;">
                        <i class="fa fa-comments-o"></i>
                        <span>Roles</span>
                    </a>

                    <ul class="sub">
                        <li><a href="<spring:url value="/role/list"/>">List</a></li>
                        <li><a href="<spring:url value="/role/add"/>">Add</a></li>
                    </ul>
                </li>

                <li class="sub-menu">
                    <a href="javascript:;">
                        <i class="fa fa-comments-o"></i>
                        <span>Users</span>
                    </a>

                    <ul class="sub">
                        <li><a href="<spring:url value="/systemUser/list"/>">List</a></li>
                        <li><a href="<spring:url value="/systemUser/add"/>">Add</a></li>
                    </ul>
                </li>
            </security:authorize>

          
        </ul>
        <!-- sidebar menu end-->
    </div>
</aside>
