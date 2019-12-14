let [n, k] = require('fs').readFileSync('dev/stdin').toString().split(' ').map(Number);

const dp = [];
const remain = 1000000000;
for(let i = 0; i <= n; i++) {
    dp[i] = [];
}
for(let i = 0; i <= k; i++) {
    dp[1][i] = i;
}
for(let i = 0; i <= n; i++) {
    dp[i][1] = 1;
}
for(let i = 2; i <= n; i++) {
    for(let j = 2; j <= k; j++) {
        dp[i][j] = (dp[i-1][j] + dp[i][j-1]) % remain;
    }
}
console.log(dp[n][k]);
