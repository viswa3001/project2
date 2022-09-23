var uri = "http://localhost:8080/books/{id}?id=1013";
function save() {
    alert("save");
    var newBook = {
        "id": 10,
        "title": "fe",
        "author": "auth",
        "price": 200
    }
    var xhttp = new XMLHttpRequest();
    xhttp.open("POST", "http://localhost:8080/books/", true);
    xhttp.setRequestHeader("Content-type", "application/json");
    xhttp.send(JSON.stringify(newBook));
}
function update() {
    alert("update");
    var updateBook = {
        "id": 3,
        "title": "Thirukural",
        "author": "Thiruvalluvar",
        "price": 155
    }
    var xhttp = new XMLHttpRequest();
    xhttp.open("PUT", "http://localhost:8080/books/{id}?id=3", true);
    xhttp.setRequestHeader("Content-type", "application/json");
    xhttp.send(JSON.stringify(updateBook));
}
function del() {
    alert("delete");
    var deleteBook = {
        "id": 1013,
        "title": "fromfe",
        "author": "author",
        "price": 500
    }
    var xhttp = new XMLHttpRequest();
    xhttp.open("DELETE", "http://localhost:8080/books/1013", true);
    xhttp.setRequestHeader("Content-type", "application/json");
    xhttp.send(JSON.stringify(deleteBook));
}
