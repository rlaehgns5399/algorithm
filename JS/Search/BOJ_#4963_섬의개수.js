var input = require('fs').readFileSync('dev/stdin').toString().split('\n');
var index = 0;

var dx = [-1, 0, 1, -1, 1, -1, 0, 1];
var dy = [1, 1, 1, 0, 0, -1, -1, -1];

var result = [];
while(true) {
    var rectInfo = input[index++].split(' ').map(Number);
    var w = rectInfo[0];
    var h = rectInfo[1];
    if (w === 0 && h === 0) break;
    
    var map = [];
    var num = 0;
    for(var i = 0; i < h; i++) {
        map[i] = input[index++].split(' ').map(Number);
    }
    for(var i = 0; i < h; i++) {
        for(var j = 0; j < w; j++) {
            if (map[i][j] === 1) {
                var queue = [];
                num++;
                queue.push([i, j]);
                while (queue.length !== 0) {
                    var item = queue.shift();
                    map[item[0]][item[1]] = 0;
                    
                    for(var l = 0; l < 8; l++) {
                        var x = item[1] + dx[l];
                        var y = item[0] + dy[l];
                        
                        if (x >= 0 && x < w && y >= 0 && y < h) {
                            if (map[y][x] === 1) {
                                map[y][x] = 0;
                                queue.push([y, x]);
                            } 
                        }
                    }
                }
            }
        }
    }
    result.push(num);
}

result.forEach((item) => console.log(item));
