(function () {

    angular.module('mybank')
        .config(adminUsersRouteConfig)
        .controller('AdminUsersController', AdminUsersController);

    function adminUsersRouteConfig($stateProvider) {
        $stateProvider
            .state('admin.users', {
                url: '/users',
                controller: 'AdminUsersController',
                controllerAs: 'adminUsers',
                views: {
                    filter: {
                        templateUrl: '/admin/users/filter'
                    },
                    table: {
                        templateUrl: '/admin/users/table'
                    }
                }
            });
    }

    function AdminUsersController() {
        var vm = this;
    }
})();

