/**
 * @param {number[]} nums
 * @return {number[][]}
 */


var threeSum = function(nums) {
    const mid = [];
    let hash = [];
    for(let a = 0; a < nums.length; a++) {
        for(let b = a; b < nums.length; b++) {
            if ( a === b ) continue;
            if (!hash[nums[a]+nums[b]]) {
                hash[nums[a]+nums[b]] = [[a, b]];
            } else {
                hash[nums[a]+nums[b]].push([a, b]);
            }
        }
    }
    
    for(let c = 0; c < nums.length; c++) {
        if (hash[-nums[c]]){
            for(let i = 0; i < hash[-nums[c]].length; i++) {
                if(!hash[-nums[c]][i].includes(c)){
                    mid.push([...hash[-nums[c]][i], c]);
                }
            }
        }
    }
    const sorted = mid.map((x) => (x.map((e) => nums[e])).sort((a, b) => a - b));
    return [...new Set(sorted.map(JSON.stringify))].map(JSON.parse);
};
