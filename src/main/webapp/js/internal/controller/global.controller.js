(function () {

    angular.module('mybank')
        .config(globalRouteConfig)
        .controller('GlobalController', GlobalController);

    function globalRouteConfig($stateProvider) {
        $stateProvider
            .state('global', {
                abstract: true,
                templateUrl: '/global/layout',
                controller: 'GlobalController',
                controllerAs: 'global'
            })
    }

    function GlobalController($http, $rootScope) {
        var vm = this;

        $http.get('vocabulary/credit-types/all').then(function (responce) {
            $rootScope.creditTypes = responce.data;
        })
    }
})();

