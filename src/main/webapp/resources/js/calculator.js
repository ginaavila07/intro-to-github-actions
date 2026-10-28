$(document).ready(function () {

    $('#firstNumber').change(function () {
        var first = $('#firstNumber').val().trim();
        if (!isValidInput(first)) {
            alert('You have entered wrong input');
            return;
        }
        $('#secondNumber').val(0);
    });

    $('#secondNumber').change(function (){
        var second = $('#secondNumber').val().trim();
        if (!isValidInput(second)) {
            alert('you have entered a wrong input');
            return;
        }
    });

    $("#operator").change(function () {
        var sel = $(this).val();
        if(sel==5){
            $(".secondNumber").hide();
        }else {
            $(".secondNumber").show();
        }
    });

});

function isValidInput(inputValue) {
    if (inputValue === null || inputValue === undefined) {
        return false;
    }
    return inputValue.length !== 0;
}