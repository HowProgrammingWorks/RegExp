'use strict';

const rx1 = /abc/g;
const s11 = 'abcdefg';
const s12 = s11.replace(rx1, '123');
console.log(s12);

const rx2 = new RegExp('abc', 'gi');
const s21 = 'abcdefgABCDEFG';
const s22 = s21.replace(rx2, '789');
console.log(s22);
