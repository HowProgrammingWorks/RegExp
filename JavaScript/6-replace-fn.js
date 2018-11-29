'use strict';

const rx = /abc/gi;
const s = 'abcdefgAbC';
const res = s.replace(rx, (sub, pos, str) => {
  console.dir({ sub, pos, str });
  return sub.toUpperCase();
});

console.log(res);
