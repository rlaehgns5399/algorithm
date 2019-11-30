/**
 * @param {number[]} nums
 * @param {number} target
 * @return {number}
 */
var searchInsert = function(nums, target) {
    nums.push(target);
    nums.sort((a, b) => a - b);
    for(let i = 0; i < nums.length; i++) {
        if (nums[i] === target) {
            return i;
        }
    }
};

/**
 * @param {number[]} nums
 * @param {number} target
 * @return {number}
 */
var searchInsert = function(nums, target) {
    let low = 0;
    let high = nums.length - 1;
    let mid;
    while (low <= high) {
        mid =  Math.floor((low + high) / 2);
        if (target === nums[mid]) {
            return mid;
        } else if (target > nums[mid]) {
            low = mid + 1;
        } else if (target < nums[mid]) {
            high = mid - 1;
        }
    }
    return low;
};
