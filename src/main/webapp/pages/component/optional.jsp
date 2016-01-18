<select class="selectpicker" ng-model="model"
        ng-options="entity.{{property}} for entity in entities track by entity.id">
</select>