var input = require('fs').readFileSync('dev/stdin').toString().split('\n')[0].split(' ');
var n = Number(input[0]);
var k = Number(input[1]);

var q = [];
var result = [];
var index = 1;
for(var i = 1; i <= n; i++) q.push(i);

while(q.length !== 0) {
    if (index === k) {
        result.push(q.shift());
        index = 1;
    } else {
        q.push(q.shift());
        index++;
    }
}

var text = '';

if (result.length === 1) {
    text = `<${result[0]}>`;
} else {
    result.forEach((item, index) => {
        if (index === 0) {
            text += `<${item}, `;
        } else if (index === result.length - 1) {
            text += `${item}>`;
        } else {
            text += `${item}, `;
        }
    });
}

console.log(text);
