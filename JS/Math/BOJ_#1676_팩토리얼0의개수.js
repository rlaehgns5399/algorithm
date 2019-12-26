var input = require('fs').readFileSync('dev/stdin').toString().split('\n')[0];
var n = Number(input);

var result = 0;
var factorial = BigInt(1);
for(var i = 2; i <= n; i++) {
    factorial *= BigInt(i);
}
factorial = factorial.toString().split('').reverse();
for(var i = 0; i < factorial.length; i++) {
    if (factorial[i] === '0') {
        result++;
    } else {
        break;
    }
} 
console.log(result);
