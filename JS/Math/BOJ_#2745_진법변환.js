var input = require('fs').readFileSync('dev/stdin').toString().split('\n')[0].split(' ');
var N = input[0].split('').reverse();
var B = Number(input[1]);

var result = 0;
for(var i = 0; i < N.length; i++) {
    if (N[i].charCodeAt(0) >= 65 && N[i].charCodeAt(0) <= 90) {
        result += (N[i].charCodeAt(0)-55) * Math.pow(B, i);
    } else {
        result += Number(N[i]) * Math.pow(B, i);
    }
}
console.log(result);
