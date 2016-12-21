'use strict';

let s = 'Hello World, here we are!';

let words = (s
  .toLowerCase()
  .replace(/\W+/g, ' ')
  .trim()
  .split(/\s/)
);

console.dir(words);
