/**
 * @param {number[][]} obstacleGrid
 * @return {number}
 */
var uniquePathsWithObstacles = function(obstacleGrid) {
    if(obstacleGrid[0][0] === 1) return 0;
    let findOne = false;
    for(let i = 0; i < obstacleGrid[0].length; i++) {
        if (obstacleGrid[0][i] === 1) findOne = true;
        if (findOne) obstacleGrid[0][i] = 1;
    }
    
    findOne = false;
    for(let i = 0; i < obstacleGrid.length; i++) {
        if (obstacleGrid[i][0] === 1) findOne = true;
        if (findOne) obstacleGrid[i][0] = 1;
    }
    
    const result = JSON.parse(JSON.stringify(obstacleGrid));
    
    for(let i = 0; i < result.length; i++) {
        for(let j = 0; j < result[0].length; j++) {
            if(i === 0 || j === 0) {
                result[i][j] = obstacleGrid[i][j] ^ 1;
            } else {
                result[i][j] = 0;
            }
        }
    }
    
    for (let i = 1; i < result.length; i++) {
        for (let j = 1; j < result[0].length; j++) {
            if(obstacleGrid[i][j] === 0) result[i][j] = result[i-1][j] + result[i][j-1];
        }
    }
    
    return result[result.length-1][result[0].length-1];
};
