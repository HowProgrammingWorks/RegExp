import re

s = 'Hello World, here we are!'
words = re.split(r'\W+', s.lower())

print(words)
