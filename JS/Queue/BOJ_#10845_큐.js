var input = require('fs').readFileSync('dev/stdin').toString().split('\n');
var n = Number(input[0]);

const queue = [];
var result = '';
for(var i = 1; i <= n; i++) {
    var command = input[i].split(' ');
    if (command[0] === 'push') {
        queue.push(command[1]);
    } else if (command[0] === 'pop') {
        if (queue.length === 0) {
            result += '-1\n';
        } else {
            result += queue.shift() + '\n';
        }
    } else if (command[0] === 'size') {
        result += queue.length + '\n';
    } else if (command[0] === 'empty') {
        result += Number(queue.length === 0) + '\n'; 
    } else if (command[0] === 'front') {
        if (queue.length === 0) {
            result += '-1\n';
        } else {
            result += queue[0] + '\n';
        }
    } else if (command[0] === 'back') {
        if (queue.length === 0) {
            result += '-1\n';
        } else {
            result += queue[queue.length-1] + '\n';
        }
    }
}

console.log(result);
