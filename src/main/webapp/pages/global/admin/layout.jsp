<div class="row">
    <div class="col-md-2">
        <ul class="nav nav-pills nav-stacked">
            <li ui-sref-active="active"><a ui-sref="admin.users">Users</a></li>
            <li ui-sref-active="active"><a ui-sref="admin.credits">Credits</a></li>
        </ul>
    </div>

    <div class="col-md-2">
        <div ui-view="filter"></div>
    </div>

    <div class="col-md-8">
        <div ui-view="main"></div>
    </div>
</div>



