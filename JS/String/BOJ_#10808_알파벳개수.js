var input = require('fs').readFileSync('dev/stdin').toString().split('\n');

var array = [];
for(var i = 0; i <= 25; i++) {
    array[i] = 0;
}
for(var i = 0; i < input[0].length; i++) {
    array[input[0].charCodeAt(i) - 'a'.charCodeAt(0)]++;
}
var result = '';
for(var i = 0; i <= 25; i++) {
    result += array[i] + ' ';
}
console.log(result.trim());
