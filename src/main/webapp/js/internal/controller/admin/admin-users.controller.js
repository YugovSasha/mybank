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

    function AdminUsersController($http) {
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
    }
})();

