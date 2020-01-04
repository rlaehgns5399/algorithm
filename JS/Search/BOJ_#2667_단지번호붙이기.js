var input = require('fs').readFileSync('dev/stdin').toString().split('\n');
var n = Number(input[0]);

var graph = [];
var visited = [];

for(var i = 1; i <= n; i++) {
    graph[i-1] = input[i].split('').map(Number);
    visited[i-1] = input[i].split('').map(Number).map((n) => {
        return false;
    });
}

var result = [];
for(var i = 0; i < n; i++) {
    for(var j = 0; j < n; j++) {
        if (graph[i][j] === 1 && !visited[i][j]) {
            
            var q = [];
            var area = 0;
            q.push([i, j]);
            visited[i][j] = true;
            
            while(q.length !== 0) {
                var item = q.shift();
                area++;
                var dx = [-1, 0, 1, 0];
                var dy = [0, 1, 0, -1];
                
                for(var l = 0; l < 4; l++) {
                    var x = item[0]+dx[l];
                    var y = item[1]+dy[l];
                    if (x >= 0 && x < n && y >= 0 && y < n) {
                        if (graph[x][y] === 1 && visited[x][y] === false) {
                            visited[x][y] = true;
                            q.push([x, y]);
                        }
                    }
                }
            }
            
            result.push(area);
        }
    }
}

result.sort((a, b) => a - b);

var log = '';
log += result.length + '\n';
for(var i = 0; i < result.length; i++) log += result[i] + '\n';
console.log(log);
