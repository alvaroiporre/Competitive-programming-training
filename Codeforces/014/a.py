from sys import stdin, stdout

[n, m] = [int(x) for x in stdin.readline().split()]
f = []
minx, miny, maxx, maxy = n - 1, m - 1, 0, 0

for i in range(n):
    f.append(stdin.readline().strip())

for i in range(n):
    for j in range(m):
        if f[i][j] == '*':
            minx = min(minx, i)
            miny = min(miny, j)
            maxx = max(maxx, i)
            maxy = max(maxy, j)
for i in range(minx, maxx + 1):
    stdout.write(f[i][miny : maxy + 1] + '\n')

#AC