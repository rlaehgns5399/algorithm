var input = require('fs').readFileSync('dev/stdin').toString().split('\n');

var info = input[0].split(' ').map(Number);
var V = info[0];
var E = info[1];

var graph = [];
var check = [];
var result = 0;
for(var i = 0; i <= V; i++) {
    graph[i] = new Array(V+1);
    check[i] = false;
}
for(var i = 1; i <= E; i++) {
    var edgeInfo = input[i].split(' ').map(Number);
    graph[edgeInfo[0]][edgeInfo[1]] = graph[edgeInfo[1]][edgeInfo[0]] = 1;
}

var DFS = (index) => {
    check[index] = true;
    for(var i = 1; i <= V; i++) {
        if(check[i] === false && graph[index][i] === 1) {
            DFS(i);
        }
    }
}
for(var i = 1; i <= V; i++) {
    if (check[i] === false) {
        result++;
        DFS(i);
    }
}

console.log(result);
