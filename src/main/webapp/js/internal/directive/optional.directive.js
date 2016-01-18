(function () {

    angular.module('mybank')
        .directive('optional', OptionalDirective);

    function OptionalDirective($http, $rootScope) {
        return {
            restrict: 'EA',
            templateUrl: '/component/optional/layout',
            scope: {
                model: '=',
                url: '=',
                property: '='
            },
            link: function(scope) {
                scope.entities = [];
                $http.get(scope.url).then(function (responce) {
                    scope.entities = responce.data;
                }).then(function () {
                    $rootScope.$emit('optional.loaded');
                })
            }
        }
    }
})();

