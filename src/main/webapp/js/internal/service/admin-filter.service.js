(function () {
    'use strict';

    angular
        .module('mybank')
        .service('AdminFilter', AdminFilterService);

    /** @ngInject */
    function AdminFilterService() {

        var filter = {};

        this.provide = function () {
            return filter;
        };

        this.clear = function() {
            filter = {};
        };
    }
})();
