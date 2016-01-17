(function () {
    'use strict';

    angular
        .module('mybank')
        .config(routeDefaultPathConfig)
        .run(routeErrorConfig)
        .run(bootstrapSelectConfig);

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

    function bootstrapSelectConfig($rootScope) {
        $rootScope.$on('$viewContentLoaded', function () {
            $('.selectpicker').selectpicker();
        });
        $rootScope.$on('modal.open', function () {
            $('.selectpicker').selectpicker();
        });
    }

})();
