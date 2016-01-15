(function () {

    angular.module('mybank')
        .config(adminRouteConfig)
        .controller('AdminController', AdminController);

    function adminRouteConfig($stateProvider) {
        $stateProvider
            .state('admin', {
                abstract: true,
                parent: 'global',
                url: '/admin',
                templateUrl: '/admin/layout'
            }).state('admin.users', {
                url: '/users',
                controller: 'AdminUsersController',
                views: {
                    filter: {
                        template: '<p>alala</p>'
                    }
                }
            }).state('admin.credits', {
                url: '/credits',
                controller: 'AdminUsersController',
                views: {
                    filter: {
                        template: '<p>ololo</p>'
                    }
                }
            })
    }

    function AdminController() {
        var vm = this;
    }
})();

