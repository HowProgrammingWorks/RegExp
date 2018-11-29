'use strict';

const s = 'Hello <User1@domain.com> and user2@domain.com';

const rx = /[a-z0-9\.]+@[a-z0-9\.]+/gi;

const m = s.match(rx);

console.dir(m);
