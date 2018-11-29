'use strict';

const words = s => [...new Set(s
  .toLowerCase()
  .replace(/\W+/g, ' ')
  .trim()
  .split(/\s/)
)];

const s = 'Hello World, here we are!';

console.dir(words(s));
console.dir(words(s + s));
