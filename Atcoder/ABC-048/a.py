from sys import stdin, stdout

[a, b, c] = [x for x in stdin.readline().strip().split()]

stdout.write(f'{a[0]}{b[0]}{c[0]}\n')

#AC