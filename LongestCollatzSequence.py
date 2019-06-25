def count_collatz_sequence(number):
	if number in collatz_map:
		return collatz_map[number]

	orig_number = number
	count = 0
	while number != 1:
		if number % 2 == 0:
			number = number / 2
		else:
			number = (3 * number) + 1
		count += 1

	collatz_map[orig_number] = count
	return orig_number, count

collatz_map = {}
max_count = 1
for i in range(1, 1000000):
	c_tuple = count_collatz_sequence(i)
	if c_tuple[1] > max_count:
		max_count = c_tuple[1]
		number = c_tuple[0]
	
print (number)