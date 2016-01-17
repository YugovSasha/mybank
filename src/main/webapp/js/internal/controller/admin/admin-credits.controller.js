(function () {

    angular.module('mybank')
        .config(adminCreditsRouteConfig)
        .controller('AdminCreditsController', AdminCreditsController);

    function adminCreditsRouteConfig($stateProvider) {
        $stateProvider
            .state('admin.credits', {
                url: '/credits',
                templateUrl: '/admin/credits',
                controller: 'AdminCreditsController',
                controllerAs: 'adminCredits'
            })
    }


    function AdminCreditsController($rootScope, $http, Modal) {
        var vm = this;

        vm.credits = [];

        var columns = [
            { field: 'id', displayName: 'Id' },
            { field: 'userProfile.id', displayName: 'User id' },
            { field: 'creditType.name', displayName: 'Credit type' }
        ];

        vm.gridOptions = {
            columnDefs: columns,
            data: vm.credits,
            enableRowSelection: true,
            enableRowHeaderSelection: false,
            enableFullRowSelection: true,
            multiSelect: false,
            enableHorizontalScrollbar: 0,
            enableVerticalScrollbar: 2,
            onRegisterApi: function(gridApi) {
                vm.gridApi = gridApi;
            }
        };

        function initData() {
            $http.get('admin/credit/all').then(function (responce) {
                _.extend(vm.credits, responce.data);
            })
        }

        initData();

        vm.creditSelected = function() {
            return vm.gridApi ? vm.gridApi.selection.getSelectedRows().length : false;
        };

        vm.editSelected = function() {
            Modal.open({
                size: 'lg',
                scope: _.extend($rootScope.$new(), {
                    credit: _.last(vm.gridApi.selection.getSelectedRows())
                }),
                templateUrl: '/admin/credit/edit/layout'
            }).result.then(function (credit) {
                    return $http.post('/admin/credit/edit', credit);
                }).then(initData);
        }
    }
})();

