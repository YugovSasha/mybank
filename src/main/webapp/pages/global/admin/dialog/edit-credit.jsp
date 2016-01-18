<div class="modal-header">Edit credit</div>

<div class="modal-body">
    <optional data-model="credit.creditType" url="'/vocabulary/credit-types/all'" property="'name'"></optional>
</div>

<div class="modal-footer">
    <button class="btn btn-danger" type="button" ng-click="$dismiss()">Cancel</button>
    <button class="btn btn-success" type="button" ng-click="$close(credit)">Edit</button>
</div>