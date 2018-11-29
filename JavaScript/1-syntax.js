'use strict';

// Docs: https://developer.mozilla.org/en-US/docs/Web
//       /JavaScript/Reference/Global_Objects/RegExp

/*
    .  - single char
    x? - optional or non-greedy
    x+ - 1 or more times
    x* - 0 or more times
    () - group $1...$9
    [] - chars
    \x - escape x
    ^x - line begin or negated expr
    x$ - line end
    x|y - either x or y
*/

const rx1 = /abc/;
console.log('Do you know abc?'.match(rx1));

const rx2 = new RegExp('abc');
console.log('Do you know abc?'.match(rx2));

const rx3 = /[a-z]+a[a-z]+/g;
const st3 = 'A man can die but once';
console.log(st3.match(rx3));

const rx4 = /\sg\w*/g;
const st4 = 'Some are born great, ' +
  'some achieve greatness, ' +
  'and some have greatness thrust upon them.';
console.log(st4.match(rx4));

const rx5 = /.u../g;
const st5 = '— Such much? — For whom how';
console.log(st5.match(rx5));

const rx6 = /\w{3,5}/g;
const st6 = '— MGIMO finished? — Ask?!';
console.log(st6.match(rx6));

const rx7 = /[^l] /g;
const st7 = 'Nothing will come of nothing';
console.log(st7.match(rx7));

const rx8 = /^\+?\d{12}$/;
const st8 = '+380661234567';
console.log(st8.match(rx8));

const rx9 = /[0-9]+ (hours|days)/g;
const st9 = '5 days';
console.log(st9.match(rx9));
