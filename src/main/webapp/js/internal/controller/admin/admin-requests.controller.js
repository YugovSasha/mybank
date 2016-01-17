(function () {

    angular.module('mybank')
        .config(adminRequestsRouteConfig)
        .controller('AdminRequestsController', AdminRequestsController)
        .filter('propsFilter', function() {
            return function(items, props) {
                var out = [];

                if (angular.isArray(items)) {
                    items.forEach(function(item) {
                        var itemMatches = false;

                        var keys = Object.keys(props);
                        for (var i = 0; i < keys.length; i++) {
                            var prop = keys[i];
                            var text = props[prop].toLowerCase();
                            if (item[prop].toString().toLowerCase().indexOf(text) !== -1) {
                                itemMatches = true;
                                break;
                            }
                        }

                        if (itemMatches) {
                            out.push(item);
                        }
                    });
                } else {
                    // Let the output be the input untouched
                    out = items;
                }

                return out;
            }
        });

    function adminRequestsRouteConfig($stateProvider) {
        $stateProvider
            .state('admin.requests', {
                url: '/requests',
                templateUrl: '/admin/requests',
                controller: 'AdminRequestsController'
                //controllerAs: 'adminRequests'
            })
    }


    function AdminRequestsController($scope, $http) {
        $scope.model = {
            people: 'test'
        }
    }
})();