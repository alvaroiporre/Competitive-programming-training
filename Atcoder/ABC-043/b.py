s = input()
r = []
for i in range(len(s)):
    if s[i] == 'B':
        if len(r) > 0:
            r.pop()
    else :
        r.append(s[i])

print(''.join(map(str, r)) + "\n")

#AC