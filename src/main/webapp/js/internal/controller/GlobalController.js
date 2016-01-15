(function () {

    angular.module('mybank')
        .config(globalRouteConfig)
        .controller('GlobalController', GlobalController);

    function globalRouteConfig($stateProvider) {
        $stateProvider
            .state('global', {
                abstract: true,
                templateUrl: '/',
                controller: 'GlobalController',
                controllerAs: 'global'
            })
    }

    function GlobalController() {
        var vm = this;
    }
})();

