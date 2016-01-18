(function () {

    angular.module('mybank')
        .config(adminRequestsRouteConfig)
        .controller('AdminRequestsController', AdminRequestsController);

    function adminRequestsRouteConfig($stateProvider) {
        $stateProvider
            .state('admin.requests', {
                url: '/requests',
                templateUrl: '/admin/requests',
                controller: 'AdminRequestsController',
                controllerAs: 'adminRequests'
            })
    }


    function AdminRequestsController($scope, $http) {
        var vm = this;

        vm.requests = [];

        var columns = [
            { field: 'id', displayName: 'Id' },
            { field: 'firstName', displayName: 'First name' },
            { field: 'lastName', displayName: 'Last name' },
            { field: 'patronymic', displayName: 'Patronymic' },
            { field: 'expired', displayName: 'Expired'}
        ];

        vm.gridOptions = {
            columnDefs: columns,
            data: vm.requests,
            enableRowSelection: true,
            enableRowHeaderSelection: false,
            enableFullRowSelection: true,
            multiSelect: false,
            enableHorizontalScrollbar: 0,
            enableVerticalScrollbar: 2,
            onRegisterApi: function(gridApi) {
                vm.gridApi = gridApi;
            }
        };

        function initData() {
            $http.get('admin/requests/all').then(function (responce) {
                _.extend(vm.requests, responce.data);
            })
        }

        initData();

        vm.requestSelected = function() {
            return vm.gridApi ? vm.gridApi.selection.getSelectedRows().length : false;
        };

        vm.approve = function() {
            $http.post('admin/request/approve', _.last(vm.gridApi.selection.getSelectedRows()));
        }
    }
})();