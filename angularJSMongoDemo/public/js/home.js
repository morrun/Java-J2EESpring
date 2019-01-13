var app = angular.module("mainApp",[]);
app.controller("homeCtrl",["$scope",function($scope) {

}]);
app.directive("testA",function() { 
	return {
		restrict: 'AECM',
		template:'<p>THis is a test</p>',
		replace:true,
		scope: false,
		controller:["$scope",function($scope) {
		
		}]
	};
});

