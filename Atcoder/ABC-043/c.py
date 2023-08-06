n  = int(input())

arr = [int(x) for x in input().split() ]

sum = 0
for i in arr:
    sum += i
mean = (sum / n)
mean = int(mean + ((-0.5)if mean < 0 else (0.5)))
cost = 0
for i in arr:
    cost += (i - mean) * (i - mean)

print(str(cost))

#AC