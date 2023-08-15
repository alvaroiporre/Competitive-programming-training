from sys import stdin, stdout

[a, b, x] = [int(x) for x in stdin.readline().split()]

stdout.write(f'{(b // x) - ((a - 1) // x)}\n')

#AC