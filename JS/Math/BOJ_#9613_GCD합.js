var input = require('fs').readFileSync('dev/stdin').toString().split('\n');
var t = Number(input[0]);

const GCD = (a, b) => {
    while (b !== 0) {
        var r = a % b;
        a = b;
        b = r;
    }
    return a;
}

var result = '';
for(var i = 1; i <= t; i++) {
    var sum = 0;
    var line = input[i].split(' ').map(Number);
    var n = line.shift();
    for(var j = 0; j < line.length; j++) {
        for(var k = j + 1; k < line.length; k++) {
            sum += GCD(line[j], line[k]);
        }
    }
    result += sum + '\n';
}
console.log(result);
