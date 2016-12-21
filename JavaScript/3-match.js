'use strict';

let s = 'My email is ';

let rx = /\W@\W/g;

let  = (s
  .toLowerCase()
  .replace(/\W+/g, ' ')
  .trim()
  .split(/\s/)
);

console.dir(words);
