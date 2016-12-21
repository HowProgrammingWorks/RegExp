'use strict';

let rx1 = /abc/g;
let s11 = 'abcdefg';
let s12 = s11.replace(rx1, '123');
console.log(s12);

let rx2 = new RegExp('abc', 'gi');
let s21 = 'abcdefgABCDEFG';
let s22 = s21.replace(rx2, '789');
console.log(s22);
