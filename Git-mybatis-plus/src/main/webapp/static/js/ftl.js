$(function () {

});

//艺人第一模板
function listNames() {
    $.ajax({
        url: '/data/listNames',
        type: "get",
        success: function (data) {
            console.log(data);
        }
    });
}

//艺人商务价格
function listBusinessPrice() {
    $.ajax({
        url: '/data/listBusinessPrice',
        type: "get",
        success: function (data) {
            console.log(data);
        }
    });
}

//艺人日指数
function listDayIndex() {
    $.ajax({
        url: '/data/listDayIndex',
        type: "get",
        success: function (data) {
            console.log(data);
        }
    });
}

//艺人月指数
function listMonthIndex() {
    $.ajax({
        url: '/data/listMonthIndex',
        type: "get",
        success: function (data) {
            console.log(data);
        }
    });
}

//艺人月指数
function listMovieLevel() {
    $.ajax({
        url: '/data//listMovieLevel',
        type: "get",
        success: function (data) {
            console.log(data);
        }
    });
}