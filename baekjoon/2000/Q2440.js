let n = require('fs').readFileSync('dev/stdin').toString().trim();
for(let j = 0; j < n; j++) {
    let str = '';
    for(let i = n - j; i > 0; i--) {
         str += '*';   
    }
    if(str) console.log(str);
}
