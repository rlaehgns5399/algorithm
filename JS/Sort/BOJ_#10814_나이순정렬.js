const input = require('fs').readFileSync('dev/stdin').toString().split('\n');
const n = Number(input[0]);
const array = [];

for(var i = 1; i <= n; i++) {
    var item = input[i].split(' ');
    array.push([Number(item[0]), item[1], i]);
}

let result = '';
array.sort((a, b) => {
    if (a[0] !== b[0]) {
        return a[0] - b[0];
    } else {
        return a[2] - b[2];
    }
}).forEach((item) => {
    result += `${item[0]} ${item[1]}\n`;
});
console.log(result);
