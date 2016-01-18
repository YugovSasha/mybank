<div>
    <div class="row">
        <div class="col-md-12">
            <div ui-grid="adminRequests.gridOptions" ui-grid-selection></div>
        </div>
    </div>
    <br/>
    <div class="row">
        <div class="col-md-2">
            <button class="btn btn-success form-control" ng-disabled="!adminRequests.requestSelected()"
                    ng-click="adminRequests.approve()">
                Edit
            </button>
        </div>
    </div>
</div>
