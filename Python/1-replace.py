import re

rx1 = 'abc'
s11 = 'abcdefg'
s12 = re.sub(rx1, '123', s11)
print(s12)

rx2 = re.compile('abc', re.IGNORECASE)
s21 = 'abcdefgABCDEFG'
s22 = rx2.sub('789', s21)
print(s22)
