var input = require('fs').readFileSync('dev/stdin').toString().split('\n')[0].split(' ').map(Number);
var min = input[0];
var max = input[1];
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

for(var i = min; i <= max; i++) {
    if(prime[i]) result += i + '\n';
}

console.log(result);
