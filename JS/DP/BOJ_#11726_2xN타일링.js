let n = require('fs').readFileSync('dev/stdin').toString().trim();
let result = [0, 1, 2];
for(let i = 3; i <= Number(n); i++) {
    result[i] = (result[i-2] + result[i-1]) % 10007;
}
console.log(result[Number(n)]);
