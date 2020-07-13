window.addEventListener("load", function(){
	var employeeId = document.getElementById('employee-id');
	var submit = document.getElementById('submit');
	submit.onclick = function() {
		var id = parseInt(employeeId.value);
		if(id > 999999){
			alert("사원 번호가 너무 큽니다.");
			employeeId.value = '';
			employeeId.style.backgroundColor = "blue";
			employeeId.focus;
		}else{
			employeeId.style.backgroundColor = "";
		}
		return;
	}
});