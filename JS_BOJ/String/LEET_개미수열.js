/**
 * @param {number} n
 * @return {string}
 */
var countAndSay = function(n) {
    const arr = ['', '1', '11', '21', '1211', '111221'];
    if (n <= 5) return arr[n];
    for(let i = 5; i <= n; i++) {
        let text = arr[i];
        let nowNumber = arr[i][0];
        let counter = 1;
        let result = '';
        for(let j = 1; j < text.length; j++) {
            if (text[j] !== nowNumber) {
                result += counter + '' + nowNumber;
                nowNumber = text[j];
                counter = 1;
            } else {
                counter++;
            }
        }
        arr.push(result + counter + '' + nowNumber);
    }
    return arr[n];
};
