(function () {

    angular.module('mybank')
        .config(adminUsersRouteConfig)
        .controller('AdminUsersController', AdminUsersController);

    function adminUsersRouteConfig($stateProvider) {
        $stateProvider
            .state('admin.users', {
                url: '/users',
                templateUrl: '/admin/users',
                controller: 'AdminUsersController',
                controllerAs: 'adminUsers'
            });
    }

    function AdminUsersController($http, $uibModal) {
        var vm = this;

        vm.users = [];

        var columns = [
            { field: 'id', displayName: 'Id' },
            { field: 'user.email', displayName: 'Email' },
            { field: 'firstName', displayName: 'First name' },
            { field: 'lastName', displayName: 'Last name' },
            { field: 'patronymic', displayName: 'Patronymic' },
            { field: 'user.expired', displayName: 'Expired'}
        ];

        vm.gridOptions = {
            columnDefs: columns,
            data: vm.users,
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
            $http.get('admin/users/all').then(function (responce) {
                _.extend(vm.users, responce.data);
            })
        }

        initData();

        vm.personSelected = function() {
            return vm.gridApi ? vm.gridApi.selection.getSelectedRows().length : false;
        };

        vm.editSelected = function() {
            $uibModal.open({

            }).result.then(function (user) {
                    console.log(_.last(vm.gridApi.selection.getSelectedRows()));
                }).then(initData);
        }
    }
})();

