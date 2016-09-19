def isPalindrome(number):

	temp_num = final_num = number
	count = 0

	while temp_num > 0:

		temp_num = temp_num / 10
		count = count + 1

	sum = 0

	while number > 0:

		sum = sum + (number % 10) * (pow(10, count - 1))
		number = number / 10
		count = count - 1

	if sum == final_num:
		return 1
	else:
		return 0

larger = 0
for i in range(100, 1000):
	for j in range(100, 1000):
		if isPalindrome(i * j):
			if i * j > larger:
				larger = i * j

print (larger)