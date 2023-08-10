from sys import stdin, stdout
[n, k] = [int(x) for x in stdin.readline().split()]

ans = k * ((k - 1) ** (n - 1))

stdout.write(f'{ans}\n')

#AC