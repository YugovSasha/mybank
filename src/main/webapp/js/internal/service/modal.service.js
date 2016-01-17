(function () {
    'use strict';

    angular
        .module('mybank')
        .service('Modal', ModalService);

    /** @ngInject */
    function ModalService($uibModal, $rootScope) {

        this.open = function (options) {
            var modalInstance = $uibModal.open(options);
            modalInstance.rendered.then(function () {
                $rootScope.$emit('modal.open');
            });
            return modalInstance;
        }
    }

})();
