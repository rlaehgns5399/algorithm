let input = require('fs').readFileSync('dev/stdin').toString().split('\n');
let n = Number(input[0]);
const p = input[1].split(' ').map(Number);
p.unshift(0);

const dp = [0];

for(let i = 1; i <= n; i++) {
    dp[i] = 0;
    for(let j = 1; j <= i; j++) {
        dp[i] = Math.max(dp[i], dp[i-j] + p[j]);
    }
}

console.log(dp[n]);
