'use strict';

const s = 'Hello user1@domain.com and user2@domain.com';

const rx = /\S+@[\S.]+/g;

const m = s.match(rx);

console.dir(m);
