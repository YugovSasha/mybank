(function () {
    'use strict';

    angular
        .module('mybank')
        .config(routeDefaultPathConfig)
        .run(routeErrorConfig);

    /** @ngInject */
    function routeDefaultPathConfig($urlRouterProvider) {
        $urlRouterProvider.otherwise(function ($injector) {
            $injector.get('$state').go('home');
        });
    }

    /** @ngInject */
    function routeErrorConfig($rootScope, $state) {
        $rootScope.$on('$stateChangeError', function (event) {
            event.preventDefault();
            $state.go('home');
        });
    }

})();
