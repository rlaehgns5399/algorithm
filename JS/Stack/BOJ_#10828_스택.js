var input = require('fs').readFileSync('dev/stdin').toString().split('\n');
var n = Number(input[0]);

const stack = [];
var result = '';
for(var i = 1; i <= n; i++) {
    var command = input[i].split(' ');
    switch (command[0]) {
        case 'push':
            stack.push(command[1]);
            break;
        case 'pop':
            if (stack.length === 0) {
                result += '-1\n';
            } else {
                result += stack.pop() + '\n';
            }
            break;
        case 'size':
            result += stack.length + '\n';
            break;
        case 'empty':
            result += Number(stack.length === 0) + '\n';
            break;
        case 'top':
            if (stack.length === 0) {
                result += '-1\n';
            } else {
                result += stack[stack.length-1] + '\n';
            }
            break;
    }
}

console.log(result);
