<div>
    <div class="row">
        <div class="col-md-12">
            <div ui-grid="adminCredits.gridOptions" ui-grid-selection></div>
        </div>
    </div>
    <br/>
    <div class="row">
        <div class="col-md-2">
            <button class="btn btn-success form-control" ng-disabled="!adminCredits.creditSelected()" ng-click="adminCredits.editSelected()">Edit</button>
        </div>
    </div>
</div>
