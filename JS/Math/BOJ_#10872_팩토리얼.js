var input = require('fs').readFileSync('dev/stdin').toString().split('\n')[0];
var n = Number(input);

var result = 1;
for(var i = 2; i <= n; i++) {
    result *= i;
}
console.log(result);
