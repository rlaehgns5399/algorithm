let input = require('fs').readFileSync('dev/stdin').toString().trim().split('\n').map(x => Number(x));

let result = [0, 1, 2, 4];
for(let i = 4; i <= 10; i++) {
    result[i] = result[i-3] + result[i-2] + result[i-1];
}

for(let i = 0; i < input[0]; i++) {
    console.log(result[input[i+1]]);
}
