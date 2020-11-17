var input = require('fs').readFileSync('/dev/stdin', 'utf8');
var lines = input.split('\n');
const pi = 3.14159;
var A = parseFloat(lines.shift());
var B = (4 / 3) * pi * A * A * A ;
console.log("VOLUME = " + B.toFixed(3));
