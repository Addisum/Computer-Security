<%-- 
    Document   : add
    Created on : May 16, 2015, 6:55:56 PM
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
                Add File
            </header>
            <div class="panel-body">

                <div class="form">
                    <form:form class="cmxform form-horizontal tasi-form" id="signupForm" commandName="employee" method="post">
                        <div class="form-group ">
                            <label for="Name" class="control-label col-lg-2">Name</label>
                            <div class="col-lg-10">
                                <form:input required="" class=" form-control" type="text" path="Name" id="inputName" placeholder="Name"/>
                                <form:errors path="Name" cssClass="error" />
                            </div>
                        </div>
                        <div class="form-group ">
                            <label for="email" class="control-label col-lg-2">Location</label>
                            <div class="col-lg-10">
                                <form:input required="" class="form-control " type="email" path="Email" id="inputEmail" placeholder="Email"/>
                                <form:errors path="Email" cssClass="error" />
                            </div>
                        </div>
                        <div class="form-group ">
                            <label for="Name" class="control-label col-lg-2">Title</label>
                            <div class="col-lg-10">
                                <form:input required="" class=" form-control" type="text" path="Mobile" id="inputMobile" />
                                <form:errors path="Mobile" cssClass="error" />
                            </div>
                        </div>
                        <div class="form-group ">
                            <label class="control-label col-lg-2" for="ccomment">Destination</label>
                            <div class="col-lg-10">
                                <form:textarea class=" form-control" type="text" path="Address" id="inputAddress" />
                                <form:errors path="Address" cssClass="error" />
                            </div>
                        </div>

                        <div class="form-group">
                            <div class="col-lg-offset-2 col-lg-10">
                                <button class="btn btn-danger" type="submit">Save</button>
                                <a href="list"><button class="btn btn-default" type="button">Cancel</button></a>
                            </div>
                        </div>
                    </form:form>
                </div>
            </div>
        </section>
    </div>
</div>


