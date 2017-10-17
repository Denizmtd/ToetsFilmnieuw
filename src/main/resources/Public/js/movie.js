var table = $("#table").DataTable();

$("#linkAddMovie").click(function (e) {
    e.preventDefault();
    $("#btnAddMovie").show();
})
getAll();
// get all information
function getAll() {
    $.get("/api/bookings/", function (result) {
        table.clear();
        for (var i = 0; i < result.length; i++) {
            table.row.add([
                result[i].title,
                result[i].score,
                result[i].watched]);
        }
        table.draw();
    });
}