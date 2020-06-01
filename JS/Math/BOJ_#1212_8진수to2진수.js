var input = require('fs')
    .readFileSync('dev/stdin')
    .toString()
    .split('\n')[0];

var result = '';
for(let i = 0; i < input.length; i++) {
    switch (input[i]) {
        case '0':
            result += '000';
            break;
        case '1':
            result += '001';
            break;
        case '2':
            result += '010';
            break;
        case '3':
            result += '011';
            break;
        case '4':
            result += '100';
            break;
        case '5':
            result += '101';
            break;
        case '6':
            result += '110';
            break;
        case '7':
            result += '111';
            break;
    }
}
while(result[0] === '0') {
    result = result.substr(1, result.length);
}
if (result.length === 0) {
    console.log(0);
} else {
    console.log(result);
}
