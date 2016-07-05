def fibonacci(sum = 0):

	a, b = 1, 1

	while(True):
		if (b>=4000000):
			break
		if(b%2 == 0):
			sum = sum + b
		a, b = b, a+b

	return sum, b

sum, b = fibonacci()
print sum, b