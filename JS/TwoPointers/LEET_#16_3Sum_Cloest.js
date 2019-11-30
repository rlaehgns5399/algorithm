/**
 * @param {number[]} nums
 * @param {number} target
 * @return {number}
 */
var threeSumClosest = function(nums, target) {
    nums.sort((a, b) => a - b);
    let result = nums[0] + nums[1] + nums[2];
    for(let i = 0; i < nums.length; i++) {
        let j = i+1;
        let k = nums.length - 1;
        while ( j < k ) {
            let sum = nums[i] + nums[j] + nums[k];
            if (Math.abs(sum - target) < Math.abs(result - target)) {
                result = sum;
            }
            
            if (sum - target < 0) {
                j++;
            } else if (sum - target > 0) {
                k--;
            } else {
                return result;
            }
        }
    }
    return result;
};