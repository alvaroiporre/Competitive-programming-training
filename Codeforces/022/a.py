from sys import stdin, stdout

n = int(stdin.readline())
s = [int(x) for x in stdin.readline().split()]
s.sort()

min_val = s[0]
second = 'NO'
for i in range(1, n):
    if s[i] > min_val:
        second = s[i]
        break
stdout.write(f'{second}\n')

#AC