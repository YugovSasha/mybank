<div class="modal-header">Edit credit</div>

<div class="modal-body">
  <%--<ui-select ng-model="credit.creditType" theme="bootstrap">--%>
    <%--<ui-select-match>{{$item.id}}</ui-select-match>--%>
    <%--<ui-select-choices repeat="tag in creditTypes | filter: {name: $select.search}">{{creditType.id}}</ui-select-choices>--%>
  <%--</ui-select>--%>
</div>

<div class="modal-footer">
  <button class="btn btn-danger" type="button" ng-click="$dismiss()">Cancel</button>
  <button class="btn btn-success" type="button" ng-click="$close(credit)">Edit</button>
</div>