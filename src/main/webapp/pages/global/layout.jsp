<%@ taglib prefix="c" uri="http://java.sun.com/jstl/core" %>

<div>
  <div class="navbar navbar-default navbar-fixed-top" role="navigation">
    <div class="container-fluid">
      <div class="navbar-header">
        <a class="navbar-brand" ui-sref="home">YourBank</a>
      </div>

      <div class="collapse navbar-collapse">
        <div class="navbar-header-right navbar-right">
          <div ng-if="!global.current.user">
            <a ui-sref="login" type="button" class="btn btn-success navbar-btn">Log in</a>
          </div>
          <div ng-if="global.current.user">
            <span class="navbar-text">Logged as: <span class="well well-sm">{{global.current.user.email}}</span></span>
            <a href="<c:url value="/logout"/>" type="button" class="btn btn-success navbar-btn">Logout</a>
          </div>
        </div>
      </div>
    </div>
  </div>

  <div class="container-fluid page-content">
    <div ui-view></div>
  </div>
</div>