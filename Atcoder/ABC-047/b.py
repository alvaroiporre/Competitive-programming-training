from sys import stdin, stdout
[w, h, n] = [int(x) for x in stdin.readline().split()]

xmin = 0
xmax = w
ymin = 0
ymax = h
for _ in range(n):
    [x, y, a] = [int(x) for x in stdin.readline().split()]
    if a == 1:
        xmin = max(xmin, x)
    elif a == 2:
        xmax = min(xmax, x)
    elif a == 3:
        ymin = max(ymin, y)
    else:
        ymax = min(ymax, y)

if xmin >= xmax or ymin >= ymax:
    stdout.write('0\n')
else:
    stdout.write(f'{(xmax - xmin) * (ymax - ymin)}\n')

#AC