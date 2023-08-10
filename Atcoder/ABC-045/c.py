from sys import stdin, stdout
n = stdin.readline().strip()

l = len(n)

s = 0
for i in range(1 << (l - 1)):
    pos = l
    for j in range(l):
        if i & (1<<j):
            x = l - j - 1
            s += int(n[x:pos])
            pos = x
    if pos > 0:
        s += int(n[0:pos])
stdout.write(str(s) + '\n')

#AC
