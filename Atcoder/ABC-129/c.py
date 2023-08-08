from sys import stdin, stdout

MOD = 1000000007

[n, m] = [int(x) for x in stdin.readline().split() ] 
b = [True] * (n + 1)
dp = [0 for _ in range(n + 1)]
for i in range(m):
    x = int(stdin.readline())
    b[x] = False
dp[0] = 1
for i in range(1,n + 1):
   if b[i]:
       dp[i] = (dp[i] + dp[i - 1]) % MOD
       if i - 2 >= 0:
           dp[i] = (dp[i] + dp[i - 2]) % MOD
stdout.write(str(dp[n]) + '\n')

#AC