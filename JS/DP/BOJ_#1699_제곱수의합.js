const n = Number(require('fs').readFileSync('dev/stdin').toString());
const dp = [0];

for(let i = 1; i <= n; i++) dp[i] = i;
for(let i = 2; i <= n; i++) {
    for(let j = 2; j*j <= i; j++) {
        dp[i] = Math.min(dp[i], dp[i-j*j] + 1);
    }
}

console.log(dp[n]);
