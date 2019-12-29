var input = require('fs').readFileSync('dev/stdin').toString().split('\n');
var testCase = Number(input[0]);
var inputIndex = 1;

var V, E;
var graph, check;

for(var i = 0; i < testCase; i++) {
    graph = [];
    check = [];
    var command = input[inputIndex++].split(' ').map(Number);
    V = command[0];
    E = command[1];
    for(var j = 0; j <= V; j++) {
        graph[j] = [];
        check[j] = 0;
    }
    for(var j = 0; j < E; j++) {
        var p = input[inputIndex++].split(' ').map(Number);
        graph[p[0]].push(p[1]);
        graph[p[1]].push(p[0]);
    }
    for(var j = 1; j <= V; j++) {
        if (check[j] === 0) {
            var q = [];
            q.push(j);
            check[j] = 1;
            while(q.length !== 0) {
                var item = q.shift();
                for(var k = 0; k < graph[item].length; k++) {
                    var next = graph[item][k];
                    if (check[next] === 0) {
                        check[next] = 3 - check[item];
                        q.push(next);
                    }
                }
            }
        }
    }
    var result = true;
    for(var j = 1; j <= V; j++) {
        for(var k = 0; k < graph[j].length; k++) {
            var next = graph[j][k];
            if (check[j] === check[next]) {
                result = false;
            }
        }
    }
    console.log(result ? 'YES' : 'NO');
}
