/* http://www.geeksforgeeks.org/print-all-prime-factors-of-a-given-number/ */

import java.lang.Math;
import java.util.*;

public class LargestPrimeFactor
{

	public static void main(String args[])
	{

		long number = 16;
		System.out.println(findLargestFactor(number, new ArrayList<Long>()));
	}

	private static long findLargestFactor(long n, ArrayList<Long> list)
	{

		long largest = 0L;

		while (n%2 == 0)
		{
			largest = 2;
			list.add(2L);
			n = n/2;
		}

		for (int i=3;i<=Math.sqrt(n);i=i+2)
		{
			while(n%i==0)
			{
				largest = i;
				list.add((long)i);
				n = n / i;
			}
		}

		if (n > 2)
		{
			largest = n;
			list.add(n);
		}

		return largest;
	}

	public static long findLargestFactorPublic(long n, ArrayList<Long> temp)
	{

		return findLargestFactor(n, temp);
	}
}