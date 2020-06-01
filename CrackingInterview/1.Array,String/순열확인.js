var strSortAndJoin = (str) => {
    return str.split('').sort((a, b) => a.charCodeAt(0) - b.charCodeAt(0)).join('');
};

var solution = (str1, str2) => {
    return strSortAndJoin(str1) === strSortAndJoin(str2);
};