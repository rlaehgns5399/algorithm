const input = require('fs').readFileSync('dev/stdin').toString().split('\n').map((x) => Number(x));
const n = input[0];

const ref = [0];
const dp = [0];
for(let i = 1; i <= n; i++) {
    ref[i] = input[i];
}
dp[1] = ref[1];
dp[2] = ref[1] + ref[2];
for(let i = 3; i <= n; i++) {
    dp[i] = Math.max(dp[i-1], Math.max(dp[i-2] + ref[i], dp[i-3] + ref[i-1] + ref[i]));
}
console.log(dp[n]);
