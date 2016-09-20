public class t10001stPrime
{

	public static void main(String args[])
	{

		int count = 1;
		int range = 10001;
		int start = 3;

		while (true)
		{
			if (isPrime(start))
			{
				if (count == range)
					break;
				count ++;
				System.out.println(start);
			}
			start ++;
		}


	}

	private static boolean isPrime(long number)
	{

		for (int i = 2; i <= Math.sqrt(number); i++)
		{
			if (number % i == 0)
				return false;
		}

		return true;
	}
}