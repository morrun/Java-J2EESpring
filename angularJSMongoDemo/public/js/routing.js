angular.module("routing-module",['ui.router'])
	.service("routing-service",function() {
		this.name="routing";
	})
	.config(["$stateProvider","$urlRouterProvider", function($stateProvider,$urlRouterProvider) {
		$stateProvider.state({
			name:'home',
			url:'/home',
			templateUrl: 'ui-template/home.html',
			controller:["$scope","$http","edituser",function($scope,$http,editUser) {
				$scope.type = "";
				$scope.text = "";
				$scope.min = null;
				$scope.max = null;
				$scope.name = "morrun";
				$http.get("/users")
				     .then(function(res) {
					$scope.users = res.data;
				     });
				$scope.edit = function(temUser) {
					editUser.user = temUser;  	
				};
                $scope.delete = function(temUser) {
                    $http.delete("/users/" + temUser._id);
                    // $scope.$digest();
                    $http.get("/users")
                     .then(function(res) {
                    $scope.users = res.data;
                     });
                }
	
			}]
		}).state({
			name:'add',
			url:'/add',
			templateUrl: 'ui-template/add.html',
			controller:["$scope","$http","$location","state","edituser",function($scope,$http,$location,state,editUser) {
				$scope.states = state.states;
				$scope.user = {
					name:"",
					age:0,
					city:"",
					state:""
				};
				$scope.submit = function(){
					var stNae = $scope.states.find(function(st) {
						return st.name === $scope.user.state;
					});
					$scope.user.state = stNae.abbreviation;
					$http.post("/users",$scope.user)
					     .then(function(res) {
						console.log(res.success);
					     });
					$location.path("/home");
				};
			}]
		}).state({
			name:'edit',
			url:'/edit',
			templateUrl: 'ui-template/edit.html',
			controller:["$scope","$http","$location","state","edituser",function($scope,$http,$location,state,editUser) {
				$scope.states = state.states;
				$scope.user = editUser.user; 
				var tem = $scope.states.find(function (st) {
					return st.abbreviation === $scope.user.state;
				});
				$scope.user.state = tem.name;
				$scope.submit1 = function(){
					var stNae = $scope.states.find(function(st) {
						return st.name === $scope.user.state;
					});
					$scope.user.state = stNae.abbreviation;
					$http.put("/users",$scope.user)
                        .then();
                    $location.path("/home");
				};
			}]

		});	
		$urlRouterProvider.otherwise("/home");
	}])
	.filter("filt",function() {
		return function(user,type,text,min,max) {
			var localUser = user;
			if (type !== ""){
				if(type === "Name"){
					localUser = localUser.filter(function(u) {
						return u.name.indexOf(text) != -1;
					});
				} else if( type === "City") {
					localUser = localUser.filter(function(u) {
						return u.city.indexOf(text) != -1;
					});
				} else if (type === "State") {
					localUser = localUser.filter(function(u) {
						return u.state.indexOf(text) != -1;
					});
				}
			}
			min = min||Number.MIN_VALUE;
			max = max||Number.MAX_VALUE;
			return localUser && localUser.filter(function(u) {
				return u.age >= min && u.age <= max;
			});
		}
	})
	.service("edituser",function() {
		this.user = {};
	})
	.service("state", function() {
		this.states = [
    {
        "name": "Alabama",
        "abbreviation": "AL"
    },
    {
        "name": "Alaska",
        "abbreviation": "AK"
    },
    {
        "name": "American Samoa",
        "abbreviation": "AS"
    },
    {
        "name": "Arizona",
        "abbreviation": "AZ"
    },
    {
        "name": "Arkansas",
        "abbreviation": "AR"
    },
    {
        "name": "California",
        "abbreviation": "CA"
    },
    {
        "name": "Colorado",
        "abbreviation": "CO"
    },
    {
        "name": "Connecticut",
        "abbreviation": "CT"
    },
    {
        "name": "Delaware",
        "abbreviation": "DE"
    },
    {
        "name": "District Of Columbia",
        "abbreviation": "DC"
    },
    {
        "name": "Federated States Of Micronesia",
        "abbreviation": "FM"
    },
    {
        "name": "Florida",
        "abbreviation": "FL"
    },
    {
        "name": "Georgia",
        "abbreviation": "GA"
    },
    {
        "name": "Guam",
        "abbreviation": "GU"
    },
    {
        "name": "Hawaii",
        "abbreviation": "HI"
    },
    {
        "name": "Idaho",
        "abbreviation": "ID"
    },
    {
        "name": "Illinois",
        "abbreviation": "IL"
    },
    {
        "name": "Indiana",
        "abbreviation": "IN"
    },
    {
        "name": "Iowa",
        "abbreviation": "IA"
    },
    {
        "name": "Kansas",
        "abbreviation": "KS"
    },
    {
        "name": "Kentucky",
        "abbreviation": "KY"
    },
    {
        "name": "Louisiana",
        "abbreviation": "LA"
    },
    {
        "name": "Maine",
        "abbreviation": "ME"
    },
    {
        "name": "Marshall Islands",
        "abbreviation": "MH"
    },
    {
        "name": "Maryland",
        "abbreviation": "MD"
    },
    {
        "name": "Massachusetts",
        "abbreviation": "MA"
    },
    {
        "name": "Michigan",
        "abbreviation": "MI"
    },
    {
        "name": "Minnesota",
        "abbreviation": "MN"
    },
    {
        "name": "Mississippi",
        "abbreviation": "MS"
    },
    {
        "name": "Missouri",
        "abbreviation": "MO"
    },
    {
        "name": "Montana",
        "abbreviation": "MT"
    },
    {
        "name": "Nebraska",
        "abbreviation": "NE"
    },
    {
        "name": "Nevada",
        "abbreviation": "NV"
    },
    {
        "name": "New Hampshire",
        "abbreviation": "NH"
    },
    {
        "name": "New Jersey",
        "abbreviation": "NJ"
    },
    {
        "name": "New Mexico",
        "abbreviation": "NM"
    },
    {
        "name": "New York",
        "abbreviation": "NY"
    },
    {
        "name": "North Carolina",
        "abbreviation": "NC"
    },
    {
        "name": "North Dakota",
        "abbreviation": "ND"
    },
    {
        "name": "Northern Mariana Islands",
        "abbreviation": "MP"
    },
    {
        "name": "Ohio",
        "abbreviation": "OH"
    },
    {
        "name": "Oklahoma",
        "abbreviation": "OK"
    },
    {
        "name": "Oregon",
        "abbreviation": "OR"
    },
    {
        "name": "Palau",
        "abbreviation": "PW"
    },
    {
        "name": "Pennsylvania",
        "abbreviation": "PA"
    },
    {
        "name": "Puerto Rico",
        "abbreviation": "PR"
    },
    {
        "name": "Rhode Island",
        "abbreviation": "RI"
    },
    {
        "name": "South Carolina",
        "abbreviation": "SC"
    },
    {
        "name": "South Dakota",
        "abbreviation": "SD"
    },
    {
        "name": "Tennessee",
        "abbreviation": "TN"
    },
    {
        "name": "Texas",
        "abbreviation": "TX"
    },
    {
        "name": "Utah",
        "abbreviation": "UT"
    },
    {
        "name": "Vermont",
        "abbreviation": "VT"
    },
    {
        "name": "Virgin Islands",
        "abbreviation": "VI"
    },
    {
        "name": "Virginia",
        "abbreviation": "VA"
    },
    {
        "name": "Washington",
        "abbreviation": "WA"
    },
    {
        "name": "West Virginia",
        "abbreviation": "WV"
    },
    {
        "name": "Wisconsin",
        "abbreviation": "WI"
    },
    {
        "name": "Wyoming",
        "abbreviation": "WY"
    }
];
});
