/**
 * @param {number} m
 * @param {number} n
 * @return {number}
 */
var uniquePaths = function(m, n) {
    const result = [];
    for(let i = 0; i <= m-1; i++) {
        if (!result[i]) result[i] = [];
        for(let j = 0; j <= n-1; j++) {
            result[i][j] = 1;
        }
    }
    for(let i = 1; i <= m-1; i++) {
        for(let j = 1; j <= n-1; j++) {
            if(i === 0 || j === 0) {
                result[i][j] = 1;
                continue;
            }
            result[i][j] = result[i-1][j] + result[i][j-1];
        }
    }
    return result[m-1][n-1];
};
