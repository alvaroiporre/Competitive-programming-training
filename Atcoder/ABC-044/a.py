from sys import stdin, stdout

n = int(stdin.readline().strip())
k = int(stdin.readline().strip())
x = int(stdin.readline().strip())
y = int(stdin.readline().strip())
r = min(n, k) * x + ((n - k) if n > k else 0) * y

stdout.write(str(r) + '\n')