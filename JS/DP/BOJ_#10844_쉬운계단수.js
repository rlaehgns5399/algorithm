let input = require('fs').readFileSync('dev/stdin').toString().trim();

const result = new Array(Number(input)+1);
const MOD = 1000000000;
result[1] = [0, 1, 1, 1, 1, 1, 1, 1, 1, 1];
for(let i = 2; i <= Number(input); i++) {
    result[i] = new Array(10);
    for(let j = 0; j < 10; j++) {
        if ( j === 0 ) {
            result[i][0] = result[i-1][1] % MOD;
        } else if ( j === 9) {
            result[i][9] = result[i-1][8] % MOD;
        } else {
            result[i][j] = (result[i-1][j-1] + result[i-1][j+1]) % MOD;
        }
    }
}

console.log(result[Number(input)].reduce((acc, val) => acc + val , 0) % MOD);
