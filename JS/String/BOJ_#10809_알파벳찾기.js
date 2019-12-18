var input = require('fs').readFileSync('dev/stdin').toString().split('\n');
var result = '';
for(let i = 'a'.charCodeAt(0); i <= 'z'.charCodeAt(0); i++){
    result += input[0].indexOf(String.fromCharCode(i)) + ' ';
}
console.log(result.trim());
