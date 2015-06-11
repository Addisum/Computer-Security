<%-- 
    Document   : list
    Created on : May 16, 2015, 7:47:04 PM
    Author     : Addisu
--%>

<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<%@ taglib prefix="spring" uri="http://www.springframework.org/tags"%>

<div class="row">
    <div class="col-lg-12">
        <section class="panel">
            <header class="panel-heading">
                Employee List Page
            </header>
            <div class="panel-body">
                <c:if test="${!empty message}">
                    <div class="alert alert-success" role="alert">${message}</div>
                </c:if>    
                <a class="btn btn-success" href="${pageContext.request.contextPath}/employee/add" data-toggle="modal"> Create Employee </a>
            </div>
            <table class="table table-striped table-advance table-hover">
                <thead>
                    <tr>
                        <th>#</th>
                        <th><i class="fa fa-credit-card"></i> Name</th>
                        <th><i class="fa fa-envelope-o"></i> Email</th>
                        <th><i class="fa fa-mobile"></i> Mobile</th>
                        <th><i class=" fa fa-align-justify"></i> Address</th>
                        <th><i class=" fa fa-edit"></i> Action</th> 
                    </tr>
                </thead>
                <tbody>
                    <c:set var="count" value="1" scope="page" />
                    <c:forEach var="employee" items="${employees}" >
                        <tr>
                            <td><a href="#">
                                    ${count}
                                    <c:set var="count" value="${count + 1}" scope="page"/></a></td>
                            <td class="hidden-phone">${employee.name}</td>
                            <td>${employee.email} </td>
                            <td> ${employee.mobile}</td>
                            <td>${employee.address}</td>
                            <td>
                                <a href="${pageContext.request.contextPath}/employee/edit/${employee.id}">
                                    <button class="btn btn-success btn-xs"><i class="fa fa-pencil"></i></button>
                                </a>
                                <a data-toggle="modal" href="#confirmRemove">
                                    <button class="btn btn-danger btn-xs confirmRemove" id="${pageContext.request.contextPath}/employee/delete/${employee.id}"><i class="fa fa-trash-o "></i></button>
                                </a>
                                <!-- Modal -->
                                <div class="modal fade" id="confirmRemove" tabindex="-1" role="dialog" aria-labelledby="myModalLabel" aria-hidden="true">
                                    <div class="modal-dialog">
                                        <div class="modal-content">
                                            <div class="modal-header">
                                                <button type="button" class="close" data-dismiss="modal" aria-hidden="true">&times;</button>
                                                <h4 class="modal-title">Are you sure remove</h4>
                                            </div>
                                            <div class="modal-footer">
                                                <button data-dismiss="modal" class="btn btn-default" type="button">Close</button>
                                                <a id="urlAddId" href="">
                                                    <button class="btn btn-danger" type="button"> Confirm</button>
                                                </a>
                                            </div>
                                        </div>
                                    </div>
                                </div>
                                <!-- modal -->
                            </td>
                        </tr>
                    </c:forEach>
                </tbody>
            </table>
        </section>
    </div>
</div>
<script>
    $(document).ready(function () {
        $(".confirmRemove").click(function () {
            console.log(this.id);
            $('#urlAddId').attr('href', this.id);
        });
    });
</script> 
