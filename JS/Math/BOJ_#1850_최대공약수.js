var input = require('fs').readFileSync('dev/stdin').toString().split('\n')[0].split(' ');
var A = BigInt(input[0]);
var B = BigInt(input[1]);

const GCD = (a, b) => {
    while (b.toString() !== '0') {
        var r = a % b;
        a = b;
        b = r;
    }
    return a;
}

var gcd = GCD(A, B);
var result = '';

for(var i = BigInt(0); i < gcd; i = BigInt(i) + BigInt(1)){
    result += '1';
}
console.log(result);
