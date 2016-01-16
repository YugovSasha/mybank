(function () {

    angular.module('mybank')
        .config(adminUsersRouteConfig)
        .controller('AdminUsersController', AdminUsersController);

    function adminUsersRouteConfig($stateProvider) {
        $stateProvider
            .state('admin.users', {
                url: '/users',
                views: {
                    "filter": {
                        templateUrl: '/admin/users/filter',
                        controller: function(AdminFilter) {
                            this.filter = AdminFilter.provide();
                        },
                        controllerAs: 'vm'
                    },
                    "main": {
                        templateUrl: '/admin/users/table',
                        controller: 'AdminUsersController',
                        controllerAs: 'adminUsers'
                    }
                },
                onExit: function(AdminFilter) {
                    AdminFilter.clear();
                }
            });
    }

    function AdminUsersController($http, AdminFilter) {
        var vm = this;

        vm.users = [];

        vm.columnNames = ['id', 'firstName', 'lastName'];
        vm.gridOptions = {
            columnDefs: _.map(vm.columnNames, function (columnName) {
                return {field: columnName};
            }),
            data: vm.users
        };

        function initData() {
            $http.get('admin/users/all').then(function (responce) {
                vm.users = responce.data;
            })
        }

        initData();
    }
})();

