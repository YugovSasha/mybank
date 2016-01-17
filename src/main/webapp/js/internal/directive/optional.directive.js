(function () {

    angular.module('mybank')
        .directive('optionalDirective', OptionalDirective)
        .controller('OptionalDirectiveController', OptionalDirectiveController);

    function OptionalDirective() {
        return {
            templateUrl: '/optional/layout'
        }
    }
})();

