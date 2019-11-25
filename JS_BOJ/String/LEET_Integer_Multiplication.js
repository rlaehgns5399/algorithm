/**
 * @param {number} x
 * @return {number}
 */
var reverse = function(x) {
    
    if ( x > Math.pow(2, 31) || x < -Math.pow(2,31)) return 0;
    let result;
    
    if (x > 0) {
        result = Number(('' + x).split('').reverse().join(''));
        if ( result > Math.pow(2, 31) || result < -Math.pow(2,31)) return 0;
        return result;
    } else if ( x < 0 ) {
        result = -x;
        result = -Number(('' + result).split('').reverse().join(''));
        if ( result > Math.pow(2, 31) || result < -Math.pow(2,31)) return 0;
        return result;
    } else {
        return 0;
    }
};
