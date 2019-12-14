let input = require('fs').readFileSync('dev/stdin').toString().split('\n');
let n = Number(input[0]);

let dp = [0, 1, 1, 1, 2, 2, 3, 4];
for(let i = 8; i <= 100; i++) {
    dp[i] = dp[i-1] + dp[i-5];
}
for(let i = 1; i <= n; i++) {
    console.log(dp[Number(input[i])]);
}
