for a in range(1, 1000/3):
	for b in range(1, 500):
		c = 1000 - a - b
		if (a*a) + (b*b) == (c*c):
			print (a*b*c)
			break

