const input = require('fs').readFileSync('dev/stdin').toString().split('\n');
const n = Number(input[0]);
const array = [];

for(var i = 1; i <= n; i++) {
    var item = input[i].split(' ').map(Number);
    array.push([item[0], item[1]]);
}

let result = '';
array.sort((a, b) => {
    if (a[1] !== b[1]) {
        return a[1] - b[1];
    } else {
        return a[0] - b[0];
    }
}).forEach((item) => {
    result += `${item[0]} ${item[1]}\n`;
});
console.log(result);
