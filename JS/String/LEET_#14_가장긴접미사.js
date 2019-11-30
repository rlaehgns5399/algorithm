/**
 * @param {string[]} strs
 * @return {string}
 */
var longestCommonPrefix = function(strs) {
    if (strs.length === 0) return '';
    let result = '';
    let getLongestItem = strs.map((val, index) => [val.length, index]).sort((a, b) => b[0] - a[0])[0];
    // [length, index]
    
    for(let i = 0; i < strs.length; i++) {
        if (strs[i] === '') return result;
    }
    
    for(let i = 0; i <= getLongestItem[0]; i++) {
        for(let j = 0; j < strs.length; j++) {
            if (result !== strs[j].slice(0, i)) return result.slice(0, result.length-1);
        }
        if (strs[getLongestItem[1]][i]) {
            result += strs[getLongestItem[1]][i];
        }
    }
    return result;
};
