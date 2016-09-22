import itertools
from functools import reduce
import operator

numbers = range(1, 101)
sum = 0
for comb in itertools.combinations(numbers, 2):
	sum = sum + reduce(operator.mul, comb, 1)

print (2 * sum)