(function () {

    angular.module('mybank')
        .config(adminRouteConfig)
        .controller('AdminController', AdminController);

    function adminRouteConfig($stateProvider) {
        $stateProvider
            .state('admin', {
                url: '/admin',
                parent: 'global',
                templateUrl: 'admin/layout',
                controller: 'AdminController',
                controllerAs: 'admin'
        })
    }

    function AdminController() {
        var vm = this;
    }
})();

