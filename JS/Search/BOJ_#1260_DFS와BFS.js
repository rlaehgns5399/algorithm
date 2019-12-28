var input = require('fs').readFileSync('dev/stdin').toString().split('\n');
var command = input[0].split(' ').map(Number);

var nV = command[0];
var nE = command[1];
var startPoint = command[2];

var graph = [];
var check = [];

for(var i = 0; i <= nV; i++) graph[i] = [];
for(var i = 0; i <= nV; i++) check[i] = false;

for(var i = 1; i <= nE; i++) {
    var l = input[i].split(' ').map(Number);
    graph[l[0]][l[1]] = graph[l[1]][l[0]] = 1;
}
var DFSresult = '';

var DFS = (index) => {
    check[index] = true;
    DFSresult += index + ' ';
    for(var i = 0; i <= nV; i++) {
        if(check[i] === false && graph[index][i] === 1) {
            DFS(i);
        }
    }
};

DFS(startPoint);
console.log(DFSresult.trim());

for(var i = 0; i <= nV; i++) check[i] = false;

var BFSresult = '';
var q = [];
q.push(startPoint);
check[startPoint] = true;
while(q.length !== 0) {
    var item = q.shift();
    BFSresult += item + ' ';
    for(var i = 0; i <= nV; i++) {
        if(check[i] === false && graph[item][i] === 1) {
            q.push(i);
            check[i] = true;
        }
    }
}

console.log(BFSresult.trim());
