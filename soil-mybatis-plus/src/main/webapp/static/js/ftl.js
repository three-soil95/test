$(function () {
    listNames();
});
//测试
function listNames() {
    $.ajax({
        url: '/user/user/listUser',
        type: "get",
        success: function (data) {
            console.log(data);
        }
    });
}
