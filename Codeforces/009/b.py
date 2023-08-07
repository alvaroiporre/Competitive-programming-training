import math
[n, vb, vs] = [int(x) for x in input().split()]
st =  [int(x) for x in input().split()]
[x, y] = [int(x) for x in input().split()]

t = float('inf')
xo = 0
for i in range(1, n):
    nt = (st[i] / vb) + (math.sqrt((x - st[i])**2 + y ** 2) / vs)
    print(f"--{nt} -- {i}")
    if nt <= t:
        t = nt
        xo = i + 1

print(str(xo))

#v = d/t => t = d/v 
#AC
