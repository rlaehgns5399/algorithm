let n = require('fs').readFileSync('dev/stdin').toString().trim();
let result = [0, 0];
for(let i = 2; i <= n; i++) {
    result[i] = result[i-1] + 1;
    if (i % 3 === 0) result[i] = Math.min(result[i], result[Math.floor(i/3)] + 1);
    if (i % 2 === 0) result[i] = Math.min(result[i], result[Math.floor(i/2)] + 1);
}
console.log(result[n]);
