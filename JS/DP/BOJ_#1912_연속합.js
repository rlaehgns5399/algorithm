let input = require('fs').readFileSync('dev/stdin').toString().split('\n');
let n = Number(input[0]);
let array = input[1].split(' ').map(Number);
let dp = [];
dp.push(array[0]);

let max = dp[0];
for(let i = 1; i < n; i++) {
    dp[i] = Math.max(array[i], dp[i-1]+array[i]);
    max = Math.max(dp[i], max);
}

console.log(max);
