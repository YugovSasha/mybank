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


    function AdminCreditsController($http) {
        var vm = this;

        vm.credits = [];

        var columns = [
            { field: 'id', displayName: 'Id' },
            { field: 'userProfile.id', displayName: 'User id' }
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
    }
})();

