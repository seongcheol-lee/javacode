//window.onload = function() {
window.addEventListener("load", function () {
    var btnPrint = document.getElementById('btn-print');
    btnPrint.onclick = function () {
        var x, y;
        //x = prompt("X값을 입력하세요. ");
        //y = prompt("Y값을 입력하세요. ");
        x = parseInt(prompt("X값을 입력하세요. "));
        y = parseInt(prompt("Y값을 입력하세요. "));
        z = x + y;
        if (z >= 10) {
            btnPrint.type = "text";
            btnPrint.style.height = "20px";
            btnPrint.style.backgroundColor = "#999999";
        }
        btnPrint.value = z;
    };
});