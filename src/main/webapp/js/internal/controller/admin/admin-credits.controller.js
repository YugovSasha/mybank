(function () {

    angular.module('mybank')
        .config(adminCreditsRouteConfig)
        .controller('AdminCreditsController', AdminCreditsController);

    function adminCreditsRouteConfig($stateProvider) {
        $stateProvider
            .state('admin.credits', {
                url: '/credits',
                views: {
                    "filter": {
                        templateUrl: '/admin/credits/filter',
                        controller: function(AdminFilter) {
                            this.filter = AdminFilter.provide();
                        },
                        controllerAs: 'vm'
                    },
                    "main": {
                        templateUrl: '/admin/credits/table',
                        controller: 'AdminCreditsController',
                        controllerAs: 'adminCredits'
                    }
                },
                onExit: function(AdminFilter) {
                    AdminFilter.clear();
                }
            })
    }


    function AdminCreditsController() {
        var vm = this;
    }
})();

