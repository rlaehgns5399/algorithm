var solution = (str) => {
	return str.split('').map((char) => char === ' ' ? '%20' : char).join('');
};