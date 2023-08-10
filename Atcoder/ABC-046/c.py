from sys import stdin, stdout

n = int(stdin.readline())
t0, a0 = 1, 1
for _ in range(n):
    [t, a] = [int(x) for x in stdin.readline().split()]
    percent = max( t0 // t, a0 // a)
    while True:
        if percent * t >= t0 and percent * a >= a0:
            break
        percent += 1
    t0 = percent * t
    a0 = percent * a

stdout.write(f'{t0 + a0}\n')

#AC