var input = require('fs').readFileSync('dev/stdin').toString().split('\n');
var n = Number(input[0]);

const gcd = (a, b) => {
    while (b !== 0) {
        var r = a % b;
        var a = b;
        var b = r;
    }
    return a;
}

const lcm = (a, b) => {
    return a * b / gcd(a, b);
}
var result = '';
for(var i = 1; i <= n; i++) {
    var line = input[i].split(' ').map(Number);
    var A = line[0];
    var B = line[1];
    result += lcm(A, B) + '\n';
}
console.log(result);
