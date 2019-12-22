var input = require('fs').readFileSync('dev/stdin').toString().split('\n');
var n = Number(input[1]);
var left = input[0].split('');
var right = [];

for(var i = 2; i <= n + 1; i++) {
    var command = input[i];
    if (command[0] === 'L') {
        if(left.length !== 0) right.push(left.pop());
    } else if(command[0] === 'D') {
        if(right.length !== 0) left.push(right.pop());
    } else if(command[0] === 'B') {
        left.pop();
    } else if(command[0] === 'P') {
        left.push(command[2]);
    }
}
while(right.length !== 0) left.push(right.pop());

var result = '';
left.forEach((item) => result += item);
console.log(result);
