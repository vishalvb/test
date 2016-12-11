var app = angular.module('trialModule', []);

app.controller('trialController', function($scope, $http) {
	var pathArray = location.href.split( '/' );
	var protocol = pathArray[0];
	var host = pathArray[2];
	var uri = protocol + '//' + host;

    $http({
        method : "POST",
        url : uri+"/BestSpringWithHibernateExample/restList.pinneapple"
    }).then(function mySuccess(response) {
        $scope.myData = response.data;
    }, function myError(response) {
        $scope.myData = response.statusText;
    });
});