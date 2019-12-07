let input = require('fs').readFileSync('dev/stdin').toString().trim();
let n = Number(input);

const result = new Array(n+1);
result[1] = [0, 1];
result[2] = [1, 0];
result[3] = [1, 1];

for(let i = 4; i <= n; i++) {
    result[i] = new Array(2);
    for (let j = 0; j < 2; j++) {
        if (j === 0) {
            result[i][j] = BigInt(result[i-1][0]) + BigInt(result[i-1][1]);
        } else {
            result[i][j] = BigInt(result[i-1][0]);
        }
    }
}
console.log(result[n].reduce((acc, val) => BigInt(acc) + BigInt(val), 0).toString());
