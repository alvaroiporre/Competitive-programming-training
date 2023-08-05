numbers = input()

number_list = list(map(int, numbers.split()))
number_list.sort()
if [5, 5, 7] == number_list:
    print('YES')
else:
    print('NO')
