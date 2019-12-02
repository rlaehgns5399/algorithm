/**
 * @param {number} n
 * @return {number}
 */
var climbStairs = function(n) {
    const solution = [];
    solution.push(0);
    solution.push(1);
    solution.push(2);
    solution.push(3);
    for(let i = 4; i <= n; i++) {
        solution[i] = solution[i-1] + solution[i-2];
    }
    return solution[n];
};
