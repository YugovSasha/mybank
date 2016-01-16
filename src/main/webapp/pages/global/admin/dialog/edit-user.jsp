<div class="modal-header">Edit user</div>

<div class="modal-body">
  <input type="text" class="form-control" ng-model="userProfile.firstName">
</div>

<div class="modal-footer">
  <button class="btn btn-danger" type="button" ng-click="$dismiss()">Cancel</button>
  <button class="btn btn-success" type="button" ng-click="$close(userProfile)">Edit</button>
</div>