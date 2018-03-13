(function (){
    var currencyCutOffModule = angular.module("currencyCutOffApp");
    currencyCutOffModule.controller("dashboardController",dashboardController);

    function dashboardController($http,alertService){
        var ctrl = this;
        ctrl.cutOffData = [];


        function display(response){
            ctrl.cutOffData = response.data;
        }

        function error(response){
            alertService.addAlert(response.data);
        }

        function getDashboardData(){
            $http.get('/dashboard').then(display).catch(error);
        }

        getDashboardData();
    }




})();