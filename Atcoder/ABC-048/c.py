from sys import stdin, stdout

n, x = map(int, stdin.readline().split())

a = [int(x) for x in stdin.readline().split()]

total = 0
for i in range(n - 1):
    if a[i] + a[i + 1] > x:
        s = min(a[i + 1] + a[i] - x, a[i + 1])
        total += s
        a[i + 1] -= s
    if a[i] + a[i + 1] > x:
        s = min(a[i] + a[i + 1] - x, a[i])
        total += s
        a[i] -= s
    

stdout.write(f'{total}\n')

#AC