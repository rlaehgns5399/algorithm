var input = require('fs').readFileSync('dev/stdin').toString().split('\n')[0].split(' ').map(Number);
var A = input[0];
var P = input[1];

var visit = new Array(300000);
for(var i = 0; i < visit.length; i++) visit[i] = 0;

var DFS = (index) => {
  visit[index]++;
  if(visit[index] > 2) return;
  var number = '' + index;
  var nextNumber = 0;
  for(var i = 0; i < number.length; i++) {
      nextNumber += Math.pow(Number(number[i]), P); 
  }
  DFS(nextNumber);
};

DFS(A);

var result = 0;
for(var i = 0; i < visit.length; i++) {
    if(visit[i] === 1) result++;
}
console.log(result);
