(function () {

    angular.module('mybank')
        .config(adminUsersRouteConfig)
        .controller('AdminUsersController', AdminUsersController);

    function adminUsersRouteConfig($stateProvider) {
        $stateProvider
            .state('admin.users', {
                url: '/users',
                templateUrl: '/admin/users',
                controller: 'AdminUsersController',
                controllerAs: 'adminUsers'
            });
    }

    function AdminUsersController($rootScope, $http, Modal) {
        var vm = this;

        vm.users = [];

        var columns = [
            { field: 'id', displayName: 'Id' },
            { field: 'user.email', displayName: 'Email' },
            { field: 'firstName', displayName: 'First name' },
            { field: 'lastName', displayName: 'Last name' },
            { field: 'patronymic', displayName: 'Patronymic' },
            { field: 'user.expired', displayName: 'Expired'}
        ];

        vm.gridOptions = {
            columnDefs: columns,
            data: vm.users,
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
            $http.get('admin/user/all').then(function (responce) {
                _.extend(vm.users, responce.data);
            })
        }

        initData();

        vm.personSelected = function() {
            return vm.gridApi ? vm.gridApi.selection.getSelectedRows().length : false;
        };

        vm.editSelected = function() {
            Modal.open({
                size: 'lg',
                scope: _.extend($rootScope.$new(), {userProfile: _.last(vm.gridApi.selection.getSelectedRows())}),
                templateUrl: '/admin/user/edit/layout'
            }).result.then(function (userProfile) {
                    return $http.post('/admin/user/edit', userProfile);
                }).then(initData);
        }
    }
})();

