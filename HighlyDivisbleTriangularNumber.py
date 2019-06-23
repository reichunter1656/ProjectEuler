from collections import defaultdict
import math

def get_prime_factors(number):
	prime_factors = defaultdict(int)

	while number % 2 == 0:
		prime_factors[2] += 1
		number = number / 2

	for i in range(3, int(math.sqrt(number) + 1), 2):
		while number % i == 0:
			prime_factors[i] += 1
			number = number / i

	if number > 2:
		prime_factors[number] += 1

	return prime_factors


def get_divisors(number):
	i = 1
	count = 0
	while i <= math.sqrt(number):
		if number % i == 0:
			if number / i == i:
				count += 1
			else:
				count += 2
		i += 1
	return count


def sum_of_numbers(n):
	return int((n * (n + 1)) / 2)


first_triangular_number = 1
while True:
	triangular_number = sum_of_numbers(first_triangular_number)
	if get_divisors(triangular_number) >= 500:
		print (triangular_number)
		break
	first_triangular_number += 1

print (get_divisors(528))