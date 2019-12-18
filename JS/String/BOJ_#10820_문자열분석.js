var input = require('fs').readFileSync('dev/stdin').toString().split('\n');

var result = '';
for(let i = 0; i < input.length-1; i++) {
    const array = [0, 0, 0, 0];
    for(let j = 0; j < input[i].length; j++) {
        const nowChar = input[i].charCodeAt(j);
        if (nowChar >= 'a'.charCodeAt(0) && nowChar <= 'z'.charCodeAt(0)) {
            array[0]++;
        } else if (nowChar >= 'A'.charCodeAt(0) && nowChar <= 'Z'.charCodeAt(0)) {
            array[1]++;
        } else if (nowChar >= '0'.charCodeAt(0) && nowChar <= '9'.charCodeAt(0)) {
            array[2]++;
        } else if (nowChar === ' '.charCodeAt(0)) {
            array[3]++;
        }
    }
    result += array[0] + ' ' + array[1] + ' ' + array[2] + ' ' + array[3] + '\n';
}
console.log(result);
