var suffix = require('fs').readFileSync('dev/stdin').toString().split('\n')[0];

var suffixArray = [];
for(var i = 0; i < suffix.length; i++) {
    suffixArray.push(suffix.slice(i, suffix.length));
}

var result = '';
suffixArray.sort().forEach((item) => result += item + '\n');
console.log(result);
