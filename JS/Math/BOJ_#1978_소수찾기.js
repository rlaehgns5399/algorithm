var input = require('fs').readFileSync('dev/stdin').toString().split('\n');
var n = Number(input[0]);
var list = input[1].split(' ').map(Number);

var prime = [];
var result = 0;
for(var i = 0; i <= 1000; i++) prime[i] = true;
prime[0] = false; prime[1] = false;

for(var i = 2; i <= 1000; i++) {
    if (prime[i]) {
        for(var j = i*2; j <= 1000; j += i) {
            prime[j] = false;
        }
    }
}

for(var i = 0; i < list.length; i++) {
    if(prime[list[i]]) result++;
}

console.log(result);
