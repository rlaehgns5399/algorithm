/**
 * @param {number} x
 * @return {boolean}
 */
var isPalindrome = function(x) {
  let y = ('' + x).split('').reverse().join('');
  if (x == y) return true;
    return false;
};
