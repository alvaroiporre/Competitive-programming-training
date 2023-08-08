from sys import stdin, stdout
s = []
for i in range(3):
    s.append(stdin.readline())

if s[0][0] == s[2][2] and s[0][1] == s[2][1] and s[0][2] == s[2][0] and s[1][0] == s[1][2]:
    stdout.write('YES\n')
else:
    stdout.write('NO\n')
#AC
