var input = require('fs').readFileSync('dev/stdin').toString().split('\n')[0];
var N = Number(input);

var stack = [];
var result = '';
if (N === 0) {
    console.log(0);
} else {
    while(N !== 0) {
        if (N % 2 === 0) {
            stack.push(0);
            N = Math.ceil(-(N / 2));
        } else {
            if ( N > 0 ) {
                N = Math.ceil(-(N / 2));
            } else {
                N = Math.ceil((-N+1) / 2);
            }
            stack.push(1);
        }
    }
    while(stack.length !== 0) result += stack.pop();
    console.log(result);
}
