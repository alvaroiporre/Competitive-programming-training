from sys import stdin, stdout

[n, x] = [int(x) for x in stdin.readline().split()]
race = [0]*1001
for _ in range(n):
    [a, b] = [int(x) for x in stdin.readline().split()]
    A = min(a, b)
    B = max(a, b)
    for i in range(A, B + 1):
        race[i] += 1

if race[x] == n:
    stdout.write('0\n')
else:
    l, r, ans = x - 1, x + 1, 1
    while l >= 0 or r <= 1000:
        if (l >=0 and race[l] == n) or (r <= 1000 and race[r] == n):
            stdout.write(str(ans) + '\n')
            break
        l -= 1
        r += 1
        ans += 1
    else:
        stdout.write('-1\n')
#AC