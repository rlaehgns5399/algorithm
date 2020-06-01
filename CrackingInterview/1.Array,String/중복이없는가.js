var solution = (str) => {
    let charArray = [];
    for (var i = 0; i < str.length; i++) {
        if (charArray[str[i]] === undefined) {
            charArray[str[i]] = true;
        } else {
            return true;
        }
    }
    return false;
}