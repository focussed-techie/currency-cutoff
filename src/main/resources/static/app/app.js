(function(){
  var currencyCutOffApp = angular.module("currencyCutOffApp",['ui.validate','ui.router','ui.bootstrap']);

  currencyCutOffApp.config(configuration);
    configuration.$inject = ['$stateProvider','$urlRouterProvider'];

  function configuration($stateProvider,$urlRouterProvider){

      $urlRouterProvider.otherwise('/dashboard');

      $stateProvider
          .state('base',{
              abstract:true,
              views :{
                  'headerView' :{
                      controller :'alertController',
                      controllerAs : 'alertCtrl',
                      templateUrl :'app/alert/alert-partial.html'
                  }
              }
          })
          .state('dashboard',{
            url:"/dashboard",
              parent : 'base',
          views : {
              'bodyView@': {
                  controller: 'dashboardController',
                  controllerAs: 'dashboardCtrl',
                  templateUrl: 'app/dashboard/dashboard-partial.html'
              },
          },


      })/*.state('changeCutOffs',{
          url: '/changeCutOffs',
          parent : 'base',
          views : {
              'bodyView@': {
                  controller :'changePasswordController as passwordChangeCtrl',
                  controllerAs :'passwordChangeCtrl',
                  templateUrl : 'app/changePassword/change-password-partial.html'

              }
          }

      })*/;


  }


})();