[a, b] = [int(x) for x in input().split()]

res = 6 - max(a, b) + 1
den = 6
for i in range(1,7):
    if res % i == 0 and den % i == 0:
        res, den = res / i, den / i

if res == 0:
    den = 0

print(f"{int(res)}/{int(den)}")

#AC