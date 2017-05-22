'use strict';

const s = 'Hello World, here we are!';

const words = (s
  .toLowerCase()
  .replace(/\W+/g, ' ')
  .trim()
  .split(/\s/)
);

console.dir(words);
