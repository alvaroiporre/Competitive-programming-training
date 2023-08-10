from sys import stdin, stdout

[n, m] = [int(x) for x in stdin.readline().split()]

f = []
flag = True
for i in range(n):
    s = stdin.readline().strip()
    flag = False if s != s[0] * m else flag
    f.append(s)
    if i > 0 and f[i] == f[i - 1]:
        flag = False
if flag:
    stdout.write('YES\n')
else:
    stdout.write('NO\n')

#AC