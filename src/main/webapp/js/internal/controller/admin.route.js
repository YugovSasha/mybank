(function () {

    angular.module('mybank')
        .config(adminRouteConfig);

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
                controllerAs: 'adminUsers',
                views: {
                    filter: {
                        templateUrl: '/admin/users/filter'
                    },
                    table: {
                        templateUrl: '/admin/users/table'
                    }
                }
            }).state('admin.credits', {
                url: '/credits',
                controller: 'AdminCreditsController',
                controllerAs: 'adminCredits',
                views: {
                    filter: {
                        templateUrl: '/admin/credits/filter'
                    },
                    table: {
                        templateUrl: '/admin/credits/table'
                    }
                }
            })
    }
})();

