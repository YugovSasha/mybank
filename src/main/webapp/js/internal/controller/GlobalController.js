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
                controllerAs: 'global',
                resolve: {
                    currentUser: function($http) {
                        return $http.get('account/current').then(function (payload) {
                            return payload.data;
                        })
                    }
                }/*,
                onEnter: function*/
            })
    }

    function GlobalController(currentUser) {
        var vm = this;

        console.log(currentUser);
    }
})();

