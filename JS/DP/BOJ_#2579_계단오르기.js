let input = require('fs').readFileSync('dev/stdin').toString().split('\n');
let n = Number(input[0]);

let array = [0];
let dp = [0];
for(let i = 1; i <= n; i++) {
    array.push(Number(input[i]));
}
dp[1] = array[1];
dp[2] = Math.max(array[1] + array[2], array[2]);
dp[3] = Math.max(array[1] + array[3], array[2] + array[3]);

for(let i = 4; i <= n; i++) {
    dp[i] = Math.max(array[i] + dp[i-2], array[i] + array[i-1] + dp[i-3]);
}

console.log(dp[n]);
