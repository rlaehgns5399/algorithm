var input = require('fs').readFileSync('dev/stdin').toString().split('\n')[0].split(' ').map(Number);

var N = input[0];
var B = input[1];

var result = '';
var stack = [];
while(N !== 0) {
    stack.push(N % B);
    N = Math.floor(N / B);
}

while(stack.length !== 0) {
    var item = stack.pop();
    if (item >= 10) {
        result += String.fromCharCode(item + 55);
    } else {
        result += item;
    }
}

console.log(result);
