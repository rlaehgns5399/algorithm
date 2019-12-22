let code = require('fs').readFileSync('dev/stdin').toString().split('\n')[0];
const dp = [];
const mod = 1000000;

for(let i = 0; i <= 5000; i++) dp[i] = 0;
dp[0] = 1;
dp[1] = 1;

if(code[0] === '0') {
    console.log(0); 
} else {

for(let i = 2; i <= code.length; i++) {
    let now = i - 1;
    if (Number(code[now]) > 0) {
        dp[i] = dp[i-1] % mod;
    }
    const twoDigit = Number(code[now-1] + code[now]);
    if (twoDigit >= 10 && twoDigit <= 26) {
        dp[i] = (dp[i] + dp[i-2]) % mod;
    }
}

console.log(dp[code.length]);
}
