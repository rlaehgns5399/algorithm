var input = require('fs').readFileSync('dev/stdin').toString().split('\n')[0].split(' ').map(Number);

var A = input[0];
var B = input[1];

const gcd = (a, b) => {
    while (b !== 0) {
        var r = a % b;
        a = b;
        b = r;
    }
    return a;
}

const lcd = (a, b) => {
    return a * b / gcd(a, b);
}

console.log(gcd(A, B));
console.log(lcd(A, B));
