from sys import stdin, stdout
[a, b, c] = [int(x) for x in stdin.readline().split()]

if a + b == c or a + c == b or b + c == a:
    stdout.write('Yes\n')
else:
    stdout.write('No\n')

#AC