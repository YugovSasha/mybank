<%@ page contentType="text/html; charset=UTF-8" language="java" pageEncoding="UTF-8" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jstl/core" %>

<!DOCTYPE html>
<html ng-app="mybank">
<head>
  <title>Yourbank</title>
  <link href="<c:url value="/css/internal/style.css"/>" rel="stylesheet" type="text/css">
  <link href="<c:url value="/css/external/bootstrap.css"/>" rel="stylesheet" type="text/css">
  <link href="<c:url value="/css/external/bootstrap-theme.css"/>" rel="stylesheet" type="text/css">
  <link href="<c:url value="/css/external/angular-busy.css"/>" rel="stylesheet" type="text/css">
  <link href="<c:url value="/css/external/angular-growl.css"/>" rel="stylesheet" type="text/css">
  <link href="<c:url value="/css/external/ui-grid.css"/>" rel="stylesheet" type="text/css">
  <link href="<c:url value="/css/external/select.css"/>" rel="stylesheet" type="text/css">
  <meta charset="utf-8">
</head>
<body>

<script src="<c:url value="/js/external/angular/angular.js"/>"></script>
<script src="<c:url value="/js/external/angular/angular-ui-router.js"/>"></script>
<script src="<c:url value="/js/external/angular/ui-grid.js"/>"></script>
<script src="<c:url value="/js/external/angular/select.js"/>"></script>
<script src="<c:url value="/js/external/angular/angular-mask.js"/>"></script>
<script src="<c:url value="/js/external/angular/angular-busy.js"/>"></script>
<script src="<c:url value="/js/external/angular/angular-growl.js"/>"></script>
<script src="<c:url value="/js/external/jquery/jquery-1.11.3.min.js"/>"></script>
<script src="<c:url value="/js/external/bootstrap/bootstrap.min.js"/>"></script>
<script src="<c:url value="/js/external/bootstrap/ui-bootstrap-tpls-0.14.3.js"/>"></script>
<script src="<c:url value="/js/external/lodash/lodash.js"/>"></script>

<script src="<c:url value="/js/internal/app.js"/>"></script>
<script src="<c:url value="/js/internal/config/route.config.js"/>"></script>
<script src="<c:url value="/js/internal/controller/global.controller.js"/>"></script>
<script src="<c:url value="/js/internal/controller/home.controller.js"/>"></script>
<script src="<c:url value="/js/internal/controller/admin/admin.controller.js"/>"></script>
<script src="<c:url value="/js/internal/controller/login.controller.js"/>"></script>
<script src="<c:url value="/js/internal/controller/admin/admin-users.controller.js"/>"></script>
<script src="<c:url value="/js/internal/controller/admin/admin-credits.controller.js"/>"></script>

<div ui-view class="main-view"></div>
<div growl class="notifications"></div>

</body>
</html>
