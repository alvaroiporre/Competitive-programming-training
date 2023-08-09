from sys import stdin, stdout

a = list(stdin.readline().strip())
b = list(stdin.readline().strip())
c = list(stdin.readline().strip())

winner = ''
selected = 'a'
while winner == '':
    if selected == 'a':
        if len(a) == 0:
            winner = 'A'
        else:
            selected = a[0]
            a = a[1:]
    elif selected == 'b':
        if len(b) == 0:
            winner = 'B'
        else:
            selected = b[0]
            b = b[1:]
    else:
        if len(c) == 0:
            winner = 'C'
        else:
            selected = c[0]
            c = c[1:]
stdout.write(winner + '\n')


#AC