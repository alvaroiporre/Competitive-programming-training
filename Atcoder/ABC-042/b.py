numbers = input()

n, l = map(int, numbers.split())
strings = []
for i in range(n):
    string = input()
    strings.append(string)
strings.sort()

res = ''.join(strings)
print(res)

#AC