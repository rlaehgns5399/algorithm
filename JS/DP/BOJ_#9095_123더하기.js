let input = require('fs').readFileSync('dev/stdin').toString().trim().split('\n').map(x => Number(x));

let result = [0, 1, 2, 4];
for(let i = 4; i <= 10; i++) {
    result[i] = result[i-3] + result[i-2] + result[i-1];
}

for(let i = 0; i < input[0]; i++) {
    console.log(result[input[i+1]]);
}

/**
  * 정리 : 4의 경우, 상수 1 + result[3], 상수 2 + result[2], 상수 3 + result[1]
  * 5의 경우, 상수 1 + result[4], 상수 2 + result[3] + 상수 3 + result[2]
  * 만약 1,2,3,4로 만든다면? f(n) = f(n+1) + f(n-2) + f(n-3) + f(n-4)
*/
