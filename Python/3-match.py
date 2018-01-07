import re

s = 'Hello user1@domain.com and user2@domain.com'
rx = r'\S+@[\S.]+'

match = re.match(rx, s)
search = re.search(rx, s)
findall = re.findall(rx, s)

print("match: ", match)
print("search: ", search.group())
print("findall: ", findall)
