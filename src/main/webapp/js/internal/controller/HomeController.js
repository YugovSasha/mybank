(function () {

    angular.module('mybank')
        .config(adminRouteConfig)
        .controller('HomeController', HomeController);

    function adminRouteConfig($stateProvider) {
        $stateProvider
            .state('home', {
                url: '/home',
                parent: 'global',
                templateUrl: 'home/layout',
                controller: 'HomeController',
                controllerAs: 'home'
            })
    }

    function HomeController() {
        var vm = this;
    }
})();

