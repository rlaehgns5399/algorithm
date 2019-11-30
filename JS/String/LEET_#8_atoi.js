/**
 * @param {string} str
 * @return {number}
 */
var myAtoi = function(str) {
    // trim first
    let s = str.trim();
    
    // split
    s = s.split(' ').filter((x) => x !== '').map(parseInt);
    
    if(isNaN(Number(s[0]))) { return 0; }
    s = Number(s[0]);
    if (s < -Math.pow(2, 31)) return -Math.pow(2, 31);
    if (s > Math.pow(2, 31) - 1) return Math.pow(2, 31) - 1;
    return s;
};
