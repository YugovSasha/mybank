(function () {

    angular.module('mybank')
        .config(adminRouteConfig)
        .controller('HomeController', HomeController);

    function adminRouteConfig($stateProvider) {
        $stateProvider
            .state('home', {
                parent: 'global',
                url: '/home',
                templateUrl: 'home/layout',
                controller: 'HomeController',
                controllerAs: 'home'
            })
    }

    function HomeController() {
        var vm = this;
    }
})();

