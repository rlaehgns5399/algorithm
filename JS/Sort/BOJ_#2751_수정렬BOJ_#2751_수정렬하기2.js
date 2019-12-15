const input = require('fs').readFileSync('dev/stdin').toString().split('\n').map(Number);
const n = input[0];
const array = [];

for(let i = 1; i <= n; i++) {
    array.push(input[i]);
}
array.sort((a, b) => a - b);
let result = '';
array.forEach((item) => {
    result += item + '\n';
});
console.log(result);
