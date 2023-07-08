import connection from './pass.js';


connection.query("delete from role(id) where = inputid", function (err, rows, fields) {
    if(err) console.log(err);
    console.log('rows', rows); // row는 배열이다
    console.log('fields', fields); // fields는 컬럼을 의미한다
});