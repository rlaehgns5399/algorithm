var input = require('fs').readFileSync('dev/stdin').toString().split('\n').map(Number);
input.pop();
input.pop();

var maximumRange = 1000000;
var prime = [];

var result = '';
for(var i = 0; i <= maximumRange; i++) prime[i] = true;
prime[0] = false; prime[1] = false;

for(var i = 2; i <= maximumRange; i++) {
    if (prime[i]) {
        for(var j = i*2; j <= maximumRange; j += i) {
            prime[j] = false;
        }
    }
}

for(var i = 0; i < input.length; i++) {
    var targetNumber = input[i];
    var flag = false;
    for (var x = 2; x < targetNumber; x++) {
        if (prime[x] && prime[targetNumber - x]) {
            result += `${targetNumber} = ${x} + ${targetNumber - x}\n`;
            flag = true;
            break;
        }
    }
    if (!flag) result += "Goldbach's conjecture is wrong.\n";
}

console.log(result);
