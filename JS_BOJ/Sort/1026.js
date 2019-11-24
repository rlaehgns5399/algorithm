var fs = require('fs');
var input = fs.readFileSync('/dev/stdin').toString().split('\n');

var A = input[1].split(' ').map(Number);
var B = input[2].split(' ').map(Number);

A.sort();
B.sort((a, b) => b - a);

var result = 0;
for(var i = 0; i < A.length; i++) {
  result += A[i] * B[i];
}
console.log(result);

/* 백준은 reduce를 쓸 수 없다. 다른 곳으로 옮기자
console.log(B.map((val, ind) => val * A[ind])
  .reduce((acc, val) => acc + val));
*/