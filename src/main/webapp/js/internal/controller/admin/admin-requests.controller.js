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
    }
})();