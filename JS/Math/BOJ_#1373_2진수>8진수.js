var input = require('fs')
    .readFileSync('dev/stdin')
    .toString()
    .split('\n')[0]
    .split('')
    .map(Number);

if (input.length % 3 === 1) {
    input.unshift(0, 0);
} else if (input.length % 3 === 2) {
    input.unshift(0);
}

var result = '';
for(let i = 0; i < input.length; i += 3) {
    result += 4 * input[i] + 2 * input[i+1] + 1 * input[i+2];
}
console.log(result);
