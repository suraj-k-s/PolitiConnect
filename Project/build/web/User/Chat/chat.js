
function sendChat() {
    var msg = document.getElementById("msg").value;
    var uid = document.getElementById("uid").value;
    $.ajax({
        url: "AjaxChat.jsp",
        type: "POST",
        data: {chat: msg,uid:uid},
        success: function(result) {
            document.getElementById("msg").value = "";
            $('#conversation').animate({scrollTop: $('#conversation')[0].scrollHeight});
            reloadSection();
        }
    });


}




reloadSection();

$(document).ready(function() {
    setInterval(function() {
        reloadSection();
    }, 1000);
});

function reloadSection() {
    
    $("#conversation").load('Load.jsp?uid='+document.getElementById("uid").value);
    $('#conversation').animate({scrollTop: $('#conversation')[0].scrollHeight});
}














   