
from sys import stdin, stdout
from itertools import combinations

def is_triangle(x, y, z):
    if x + y > z and x + z > y and y + z > x :
        return "TRIANGLE"
    elif  x + y == z or x + z == y or y + z == x :
        return "SEGMENT"
    else :
        return "IMPOSIBLE"
        
nums = [int(x) for x in stdin.readline().split()]
t = False
s = False

for i in list(combinations(nums, 3)):
    if is_triangle(i[0], i[1], i[2]) == 'TRIANGLE':
        t = True
    elif is_triangle(i[0], i[1], i[2]) == 'SEGMENT':
        s = True

if t:
    stdout.write('TRIANGLE')
elif s:
    stdout.write('SEGMENT')
else:
    stdout.write('IMPOSSIBLE')
  
#AC