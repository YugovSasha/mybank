(function () {

    angular.module('mybank')
        .config(loginRouteConfig)
        .controller('LoginController', LoginController);

    function loginRouteConfig($stateProvider) {
        $stateProvider
            .state('login', {
                parent: 'global',
                url: '/login',
                templateUrl: 'login',
                controller: 'LoginController',
                controllerAs: 'login'
            })
    }

    function LoginController($http, $state) {
        var vm = this;

        vm.submit = function(loginForm) {
            $http.post('login', {}, {params: {'email': loginForm.email.$viewValue, 'password': loginForm.password.$viewValue}}).then(function() {
                alert('adfasdfasdf');
                $state.go('admin');
            });
        }
    }
})();

