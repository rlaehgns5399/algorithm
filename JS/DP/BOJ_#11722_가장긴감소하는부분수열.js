let input = require('fs').readFileSync('dev/stdin').toString().split('\n');
const n = Number(input[0]);
const array = input[1].split(' ').map(Number);
array.unshift(0);

const dp = new Array(array.length);
dp[0] = 0;

for(let i = 1; i <= n; i++) {
    let min = 0;
    for(let j = 0; j < i; j++) {
        if (array[i] < array[j]){
			if(min < dp[j]) min = dp[j];
        }
    }
    dp[i] = min + 1;
}
let max = 0;
for(let i = 0; i <= n; i++) {
    max = Math.max(max, dp[i]);
}

console.log(max);
