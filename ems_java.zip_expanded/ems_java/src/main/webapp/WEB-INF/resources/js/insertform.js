window.addEventListener("load", function () {
    var employeeId = document.getElementById('employee-id');
    var submit = document.getElementById('submit');
    submit.onclick = function () {
    	var id = parseInt(employeeId.value);	//태그 자체에는 접근 못하기 때문에 .value를 붙여 값을 가져온다
    	if(id > 999999) {
    		alert("사원 번호 숫자가 너무 큽니다.");
    		employeeId.value = '';
    		employeeId.style.backgroundColor = "Red";
    		employeeId.focus;
		} else {
			employeeId.style.backgroundColor = "";
		}
    	return;
	}
});