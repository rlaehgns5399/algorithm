var input = require('fs').readFileSync('dev/stdin').toString().split('\n');

var stack = 0;
var result = 0;
for(var i = 0; i < input[0].length; i++) {
    if (input[0][i] === '(') {
        stack++;
    } else {
        stack--;
        if (input[0][i-1] === '(') {
            result += stack;
        } else {
            result++;
        }
    }
}
console.log(result);
