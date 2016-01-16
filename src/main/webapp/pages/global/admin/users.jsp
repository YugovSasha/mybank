<div>
    <div class="row">
        <div class="col-md-12">
            <div ui-grid="adminUsers.gridOptions" ui-grid-selection></div>
        </div>
    </div>
    <br/>
    <div class="row">
        <div class="col-md-2">
            <button class="btn btn-success form-control" ng-disabled="!adminUsers.personSelected()" ng-click="adminUsers.editSelected()">Edit</button>
        </div>
    </div>
</div>
