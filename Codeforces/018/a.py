from sys import stdin, stdout
def is_right(x1, y1, x2, y2, x3, y3):
    if (x1 == x2 and y1 == y2) or (x1 == x3 and y1 == y3) or (x2 == x3 and y2 == y3):
        return False
    return (x1 - x2) * (x1 - x3) + (y1 - y2) * (y1 - y3) == 0 or (x2 - x1) * (x2 - x3) + (y2 - y1) * (y2 - y3) == 0 or (x3 - x2) * (x3 - x1) + (y3 - y2) * (y3 - y1) == 0

d = [int(x) for x in stdin.readline().split()]

if is_right(d[0], d[1], d[2], d[3], d[4], d[5]):
    stdout.write('RIGHT\n')
else:
    flag = False
    for i in range(6):
        d[i] -= 1
        flag = flag or is_right(d[0], d[1], d[2], d[3], d[4], d[5])
        d[i] += 2
        flag = flag or is_right(d[0], d[1], d[2], d[3], d[4], d[5])
        d[i] -= 1
    if flag:
        stdout.write('ALMOST\n')
    else:
        stdout.write('NEITHER\n')
#AC
