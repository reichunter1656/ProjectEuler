/* http://www.geeksforgeeks.org/print-all-prime-factors-of-a-given-number/ */

import java.lang.Math;

public class LargestPrimeFactor
{

	public static void main(String args[])
	{

		long number = 999999;
		System.out.println(findLargestFactor(number));
	}

	private static long findLargestFactor(long n)
	{

		long largest = 0L;

		while (n%2 == 0)
		{
			largest = 2;
		}

		for (int i=3;i<=Math.sqrt(n);i=i+2)
		{
			while(n%i==0)
			{
				largest = i;
				n = n / i;
			}
		}

		if (n > 2)
		{
			largest = n;
		}

		return largest;
	}
}