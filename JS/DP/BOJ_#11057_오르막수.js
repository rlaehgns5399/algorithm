let input = require('fs').readFileSync('dev/stdin').toString().trim();
let n = Number(input);

const result = new Array(n+1);
result[1] = [1,1,1,1,1,1,1,1,1,1];
for(let i = 2; i <= n; i++) {
    result[i] = new Array(10);
    result[i][0] = 1;
    for(let j = 1; j < 10; j++) {
        result[i][j] = (result[i-1][j] + result[i][j-1]) % 10007;
    }
}

console.log(result[n].reduce((acc, val) => acc + val, 0) % 10007);

// 해설: https://mizzo-dev.tistory.com/entry/baekjoon11057
