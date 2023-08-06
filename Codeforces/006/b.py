from sys import stdin, stdout

n, m, c = stdin.readline().split()
n = int(n)
m = int(m)

office = []
d = set()

for _ in range(n):
    office.append(str(stdin.readline()))

for i in range(n):
    for j in range(m):
        if office[i][j] == c:
            if i - 1 >= 0:
                d.add(office[i-1][j])
            if j - 1 >= 0:
                d.add(office[i][j - 1])
            if i + 1 < n:
                d.add(office[i + 1][j])
            if j + 1 < m:
                d.add(office[i][j + 1])
res = len(d)
if c in d:
    res -= 1
if '.' in d:
    res -= 1
stdout.write(str(res))

#AC
