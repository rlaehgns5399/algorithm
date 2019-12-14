let input = require('fs').readFileSync('dev/stdin').toString().split('\n');
let n = Number(input[0]);
let array = input[1].split(' ').map(Number);
array.unshift(0);
let dp = [0];
let Rdp = [0];

for(let i = 1; i <= n; i++) {
    let min = 0;
    for(let j = 0; j < i; j++) {
        if (array[i] > array[j]) {
            if (min < dp[j]) min = dp[j];
        }
    }
    dp[i] = min + 1;
}

for(let i = n; i >= 1; i--) {
    let min = 0;
    for(let j = n; j > i; j--) {
        if (array[i] > array[j]) {
            if (min < Rdp[j]) min = Rdp[j];
        }
    }
    Rdp[i] = min + 1;
}

const combinedDP = dp.map((item, index) => Rdp[index] + item - 1);
let max = 0;
for(let i = 0; i < combinedDP.length; i++) {
    max = Math.max(max, combinedDP[i]);
}
console.log(max);
