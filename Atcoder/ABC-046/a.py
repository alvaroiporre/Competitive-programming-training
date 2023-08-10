from sys import stdin, stdout
[a, b, c] = [int(x) for x in stdin.readline().split()]

if a == b and b == c:
    stdout.write('1\n')
elif a == b or b == c or a == c:
    stdout.write('2\n')
else:
    stdout.write('3\n')

#AC