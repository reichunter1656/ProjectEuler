m = 0
n = 1

a = 0
b = 0
c = 0
req = 1

while (1):

	m = m + 1
	n = n + 1

	a = pow(n, 2) - pow(m, 2)
	b = 2 * n * m
	c = pow(n, 2) + pow(m, 2)
	
	print a, b, c
	req = a + b + c

	if req == 1000:
		break