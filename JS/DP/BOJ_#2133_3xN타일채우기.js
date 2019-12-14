const n = Number(require('fs').readFileSync('dev/stdin').toString());
const dp = [1, 0, 3, 0, 11];

for (let i = 5; i <= n; i++) {
    if (i % 2 === 1) {
        dp[i] = 0;
        continue;
    }
    dp[i] = 3 * dp[i-2];
    // 매 2xN 타일마다 2개의 유니크한 타일이 생김
    for(let j = 4; j <= i; j+=2) {
        dp[i] += 2 * dp[i-j];
    }
}
console.log(dp[n]);

// https://lmcoa15.tistory.com/42 (풀이참고)
