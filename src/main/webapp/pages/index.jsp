<%@ page contentType="text/html;charset=UTF-8" language="java" %>
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
  <meta charset="utf-8">
</head>
<body>

<script src="<c:url value="/js/external/angular/angular.js"/>"></script>
<script src="<c:url value="/js/external/angular/angular-ui-router.js"/>"></script>
<script src="<c:url value="/js/external/angular/angular-mask.js"/>"></script>
<script src="<c:url value="/js/external/angular/angular-busy.js"/>"></script>
<script src="<c:url value="/js/external/angular/angular-growl.js"/>"></script>
<script src="<c:url value="/js/external/jquery/jquery-1.11.3.min.js"/>"></script>
<script src="<c:url value="/js/external/bootstrap/bootstrap.min.js"/>"></script>
<script src="<c:url value="/js/external/bootstrap/ui-bootstrap-tpls-0.14.3.js"/>"></script>
<script src="<c:url value="/js/external/lodash/lodash.js"/>"></script>

<script src="<c:url value="/js/internal/app.js"/>"></script>
<script src="<c:url value="/js/internal/config/route.config.js"/>"></script>
<script src="<c:url value="/js/internal/controller/GlobalController.js"/>"></script>
<script src="<c:url value="/js/internal/controller/HomeController.js"/>"></script>
<script src="<c:url value="/js/internal/controller/AdminController.js"/>"></script>

<div class="container-fluid">
  <div ui-view class="main-view"></div>
  <div growl class="notifications"></div>
</div>
</body>
</html>
