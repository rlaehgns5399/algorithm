var input = require('fs').readFileSync('dev/stdin').toString().split('\n');
var n = Number(input[0]);

var result = '';
for(var i = 1; i <= n; i++) {
    var stack = 0;
    var text = input[i];
    for(var j = 0; j < text.length; j++) {
        if (text[j] === '(') {
            stack++;
        } else {
            if (stack <= 0) {
                stack--;
                break;
            } else {
                stack--;
            }
        }
    }
    if (stack === 0) {
        result += 'YES\n';
    } else {
        result += 'NO\n';
    }
}
console.log(result);
