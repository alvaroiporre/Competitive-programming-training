from sys import stdin, stdout
n = stdin.readline().strip()
m = stdin.readline().strip()
ceros = 0
numbers = []
for i in range(len(n)):
    if n[i] == '0':
        ceros += 1
    else:
        numbers.append(n[i])
if len(numbers) != 0:
    numbers.sort()
    res = numbers[0] + '0' * ceros + ''.join(numbers[1:] )
else:
    res = '0' * ceros

if res == m:
    stdout.write('OK\n')
else:
    stdout.write('WRONG_ANSWER\n')

#AC