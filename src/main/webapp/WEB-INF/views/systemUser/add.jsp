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
                Add User
            </header>
            <div class="panel-body">
                <div class="form">
                    <form:form class="cmxform form-horizontal tasi-form" id="signupForm" action="${pageContext.request.contextPath}/systemUser/add" commandName="userCommand" method="post">
                        <div class="form-group ">
                            <label for="username" class="control-label col-lg-2">Username</label>
                            <div class="col-lg-10">
                                <form:input required="" class=" form-control" type="text" path="username" id="username" placeholder=""/>
                                <form:errors path="username" cssClass="error" />
                            </div>
                        </div>
                        <div class="form-group ">
                            <label for="password" class="control-label col-lg-2">Password</label>
                            <div class="col-lg-10">
                                <form:input required="" class="form-control " type="password" path="password" id="password" placeholder=""/>
                                <form:errors path="password" cssClass="error" />
                            </div>
                        </div>
                        <div class="form-group ">
                            <label class="control-label col-lg-2" for="enabled">Status</label>
                            <div class="col-lg-10">
                                <form:select cssClass="form-control" path="enabled">
                                    <form:option value="1">Enable</form:option>
                                    <form:option value="0">Disable</form:option>
                                </form:select>
                                <form:errors path="enabled" cssClass="error" />
                            </div>
                        </div>
                        <div class="form-group ">
                            <label class="control-label col-lg-2" for="employee">Employee</label>
                            <div class="col-lg-10">

                                <form:select class="form-control"  path="employee.id">
                                    <form:options itemLabel="name" itemValue="id" items="${employeeList}"></form:options>
                                </form:select>
                                <form:errors path="enabled" cssClass="error" />
                            </div>
                        </div>
                        <div class="form-group ">
                            <label class="control-label col-lg-2" for="roles">Roles</label>
                            <div class="col-lg-10">
                                <c:forEach items="${roles}" var="role">
                                    <div  class="checkbox">
                                        <label>
                                            <%-- Note: here <c:if> tag is used right inside <input> tag --%>
                                            <input type="checkbox" value="${role.roleId}" name="roles" />${role.roleName}
                                        </label>
                                    </div>
                                </c:forEach>
                                <form:errors path="enabled" cssClass="error" />
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


