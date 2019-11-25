/**
 * @param {string} s
 * @return {number}
 */
var romanToInt = function(s) {
    return s.split('IV').join('!4')
    .split('IX').join('!9')
    .split('XL').join('!40')
    .split('XC').join('!90')
    .split('CD').join('!400')
    .split('CM').join('!900')
    .split('I').join('!1')
    .split('V').join('!5')
    .split('X').join('!10')
    .split('L').join('!50')
    .split('C').join('!100')
    .split('D').join('!500')
    .split('M').join('!1000')
    .split('!').map(Number).reduce((acc, val) => acc + val);
};
