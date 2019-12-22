var input = require('fs').readFileSync('dev/stdin').toString().split('\n');

var result = '';
for(var i = 0; i < input[0].length; i++) {
    var c = input[0][i].charCodeAt(0);
    if ((c >= 65 && c <= 65 + 12) || (c >= 97 && c <= 97 + 12)) {
        result += String.fromCharCode(c+13);
    } else if ((c >= 65+13 && c <= 90) || (c >= 97 + 13 && c <= 122)) {
        result += String.fromCharCode(c-13);
    } else {
        result += input[0][i];
    }
}

console.log(result);
