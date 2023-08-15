from sys import stdin, stdout
[h, k, v, s] = [int(x) for x in stdin.readline().split()]

travel = 0
while h > 0 :
    v += s
    v -= max(v // 10, 1)
    if v >= k:
        h += 1
    elif v > 0:
        h -= 1
        if h == 0:
            v = 0
    travel += v
    if v <= 0:
        h, v = 0, 0
    if s > 0 :
        s -= 1

stdout.write(f'{travel}\n')

