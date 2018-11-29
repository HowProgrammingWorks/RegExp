'use strict';

const rx = /[abc]/gi;

console.dir({
  rx,
  flags: rx.flags,
  global: rx.global,
  ignoreCase: rx.ignoreCase,
  multiline: rx.multiline,
  source: rx.source,
  sticky: rx.sticky,
  unicode: rx.unicode,
  lastIndex: rx.lastIndex,
});

console.dir({
  xyz: rx.test('xyz'),
  abc: rx.test('abc')
});

const s = 'abcdefgabc';

let res;
do {
  res = rx.exec(s);
  console.log({ lastIndex: rx.lastIndex, res });
} while (res);
