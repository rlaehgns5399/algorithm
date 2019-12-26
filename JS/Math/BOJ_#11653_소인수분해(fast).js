var input = Number(require('fs').readFileSync('dev/stdin').toString().split('\n')[0]);
var result = '';
for(var i = 2; i*i <= input; i++) {
    while(input % i === 0) {
        console.log(i);
        input /= i;
    }
}
if (input > 1) {
    console.log(input);
}
