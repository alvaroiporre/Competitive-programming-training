d = [0]*10
n, l = map(int, input().split())
digits = list(map(int, input().split()))
for i in range(l):
    d[digits[i]] = 1
for i in range(n, 1000009):
    number = str(i)
    for j in range(len(number)):
        if d[int(number[j])]:
            break
    else:
        print(number)
        break

#AC