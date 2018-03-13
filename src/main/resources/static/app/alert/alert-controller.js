(function (){
    var currencyCutOffModule = angular.module("currencyCutOffApp");
    currencyCutOffModule.controller("alertController",alertController);

    function alertController($scope,alertService){

        var ctrl = this;
        ctrl.alerts =alertService.getAlerts();


        $scope.$watch(function(){
            alertService.getAlerts();

        },function (){
            ctrl.alerts = alertService.getAlerts();
        },true);


        $scope.closeAlert = closeAlert;



        function closeAlert(index){
            alertService.removeAlert(index);
        }

    }


})();