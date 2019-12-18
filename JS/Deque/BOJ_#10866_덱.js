var input = require('fs').readFileSync('dev/stdin').toString().split('\n');
var n = Number(input[0]);

const deque = [];
var result = '';
for(var i = 1; i <= n; i++) {
    var command = input[i].split(' ');
    if (command[0] === 'push_front') {
        deque.unshift(command[1]);
    } else if (command[0] === 'push_back') {
        deque.push(command[1]);
    } else if (command[0] === 'pop_front') {
        if (deque.length === 0) {
            result += '-1\n';
        } else {
            result += deque.shift() + '\n';
        }
    } else if (command[0] === 'pop_back') {
        if (deque.length === 0) {
            result += '-1\n';
        } else {
            result += deque.pop() + '\n';
        }
    } else if (command[0] === 'size') {
        result += deque.length + '\n';
    } else if (command[0] === 'empty') {
        result += Number(deque.length === 0) + '\n'; 
    } else if (command[0] === 'front') {
        if (deque.length === 0) {
            result += '-1\n';
        } else {
            result += deque[0] + '\n';
        }
    } else if (command[0] === 'back') {
        if (deque.length === 0) {
            result += '-1\n';
        } else {
            result += deque[deque.length-1] + '\n';
        }
    }
}

console.log(result);
