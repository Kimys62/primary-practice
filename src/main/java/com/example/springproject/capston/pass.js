var mysql = require('mysql');
const connection = mysql.createConnection({
    host: 'localhost',
    user: 'root',
    password: '1761011',
    port: '3306',
    database: 'capston-db' // 데이터베이스 이름
    //데이터베이스는 mysql에서 참조할 스키마를 집어넣어줘야 내부 table 생성
});

function dbconnect() {
    connection.connect();
}
function endconnect() {
    connection.end();
}

dbconnect(); //db연결

connection.query('select * from role', function (err, rows, fields) {
    if(err) console.log(err);
    console.log('rows', rows); // row는 배열이다
    console.log('fields', fields); // fields는 컬럼을 의미한다
});

/*
var inputid = document.getElementById('id');
connection.query("insert into role(id) values ?", inputid.value, function (err, rows, fields) {
    if(err) console.log(err);
    console.log('rows', rows); // row는 배열이다
    console.log('fields', fields); // fields는 컬럼을 의미한다
});


connection.query("delete from role(id) where = inputid", function (err, rows, fields) {
    if(err) console.log(err);
    console.log('rows', rows); // row는 배열이다
    console.log('fields', fields); // fields는 컬럼을 의미한다
});

*/


