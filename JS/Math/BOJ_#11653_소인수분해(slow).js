var input = Number(require('fs').readFileSync('dev/stdin').toString().split('\n')[0]);

var maximumRange = input;
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

while(input !== 1) {
    for(var i = 2; i <= maximumRange; i++) {
        if (prime[i] && input % i === 0) {
            result += i + '\n';
            input = input / i;
            break;
        }
    }
}

console.log(result);
