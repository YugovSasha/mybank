(function () {

    angular.module('mybank')
        .config(adminCreditsRouteConfig)
        .controller('AdminCreditsController', AdminCreditsController);

    function adminCreditsRouteConfig($stateProvider) {
        $stateProvider
            .state('admin.credits', {
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


    function AdminCreditsController() {
        var vm = this;
    }
})();

