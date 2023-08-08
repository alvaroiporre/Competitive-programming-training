from sys import stdin, stdout
print(50**4)

[n, a] = [int(x) for x in stdin.readline().split() ] 
x = [int(x) for x in stdin.readline().split() ] 
dp = [[[0 for _ in range(2700)] for _ in range(51)] for _ in range(51)]

dp[0][0][0] = 1

for i in range(n):
    for j in range(n):
        for k in range(2700):
            if dp[i][j][k]:
                dp[i + 1][j][k] += dp[i][j][k]
                dp[i + 1][j + 1][k + x[i]] +=  dp[i][j][k]
res = 0
for i in range(1, n + 1):
    res += dp[n][i][a * i];

stdout.write(str(res) + '\n')

#AC

