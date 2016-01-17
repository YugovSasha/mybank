<div class="modal-header">Edit credit</div>

<div class="modal-body">
  <select class="selectpicker" ng-model="credit.creditType"
          ng-options="creditType.name for creditType in creditTypes track by creditType.id">
  </select>
</div>

<div class="modal-footer">
  <button class="btn btn-danger" type="button" ng-click="$dismiss()">Cancel</button>
  <button class="btn btn-success" type="button" ng-click="$close(credit)">Edit</button>
</div>