(function () {

    angular.module('mybank')
        .config(adminCreditsRouteConfig)
        .controller('AdminCreditsController', AdminCreditsController);

    function adminCreditsRouteConfig($stateProvider) {
        $stateProvider
            .state('admin.credits', {
                url: '/credits',
                templateUrl: '/admin/credits',
                controller: 'AdminCreditsController',
                controllerAs: 'adminCredits'
            })
    }


    function AdminCreditsController() {
        var vm = this;
    }
})();

