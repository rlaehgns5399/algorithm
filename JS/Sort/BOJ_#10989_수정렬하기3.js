var input = require('fs').readFileSync('dev/stdin').toString().split('\n').map(Number);
var n = input[0];
var count = new Array(10001);
for(var i = 1; i <= 10000; i++) count[i] = 0;
for(var i = 1; i <= n; i++) {
    count[input[i]]++;
}
var result = '';
for(var i = 1; i <= 10000; i++) {
    for(var j = 0; j < count[i]; j++) {
        result += i + '\n';
    }
}
console.log(result);
