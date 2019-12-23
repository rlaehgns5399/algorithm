var input = require('fs').readFileSync('dev/stdin').toString().split('\n')[0].split(' ').map(Number);
var A = input[0];
var B = input[1];
var C = input[2];

console.log((A + B) % C);
console.log(((A % C) + (B % C)) % C);
console.log((A * B) % C);
console.log((A % C * B % C) % C);
