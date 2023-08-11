from sys import stdin, stdout
s = stdin.readline().strip()
_ = ''
arr = []
for x in range(len(s)):
    if s[x] != _:
        arr.append(s[x])
        _ = s[x]
stdout.write(f'{len(arr) - 1}\n')

#AC