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
            });
    }
})();

