function SimpleCtrl($scope) {
	$scope.hello = "Hello, World!";
	
	$scope.showMessage = function() {
		$("#spanEvent").hide();
		$("#spanEvent").html("Hello, World!");
		$("#spanEvent").show('slow');
	};
	
	$scope.doAjaxRequest = function() {
		//en vez de hacer la llamada por jquery habría que hacer uso del
		//rest api de angular, TBD...
		$("#spanAjax").hide();
		$.ajax({
			url : contextPath+"/user/list",
			data : {},
			dataType : "json",
			success : function(data) {
				var str = "";
				for(var i in data){
					p = data[i];
					str += p.email+"("+p.username+") ";
				}
				$("#spanAjax").html(str);
				$("#spanAjax").show('slow');
			}
		});

	};
}
