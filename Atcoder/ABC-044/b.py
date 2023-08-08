from sys import stdin, stdout
s = stdin.readline().strip()
v = {}
for i in range(len(s)):
    v[s[i]] = (v[s[i]] + 1 if s[i] in v else 1)


for x in v:
    if v[x] % 2 != 0:
        stdout.write('No\n')
        break
else:
    stdout.write('Yes\n')

#AC