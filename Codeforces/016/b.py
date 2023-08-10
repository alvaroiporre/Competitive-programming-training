from sys import stdin, stdout

def myFun(a):
    return a[1]

[n, m] = [int(x) for x in stdin.readline().split()]

matches = []

for i in range(m):
    [a, b] = [int(x) for x in stdin.readline().split()]
    matches.append([a, b])
matches.sort(key=myFun, reverse=True)
res = 0
c = 0
i = 0
while c < n and i < m:
    aux = min(n-c, matches[i][0])
    res += matches[i][1] * aux
    c += aux
    i += 1
stdout.write(str(res) + '\n')

#AC