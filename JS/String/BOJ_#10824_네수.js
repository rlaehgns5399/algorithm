var input = require('fs').readFileSync('dev/stdin').toString().split('\n');
var abcd = input[0].split(' ').map(Number);

var ab = abcd[0] + '' + abcd[1];
var cd = abcd[2] + '' + abcd[3];

console.log(Number(ab) + Number(cd));
