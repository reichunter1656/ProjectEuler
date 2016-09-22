import java.util.*;

public class SmallestMultiple
{

	public static ArrayList<Long> temp = new ArrayList<Long>();
	private static int numbers[] = new int[21];

	private static long findLCM(ArrayList<Integer> listOfNumbers)
	{

		long product = 1;
		for (int number : listOfNumbers)
		{

			LargestPrimeFactor.findLargestFactorPublic(number, temp);
			for (long n : temp)
			{
				if (Collections.frequency(temp, n) > numbers[(int)n])
					numbers[(int)n] = Collections.frequency(temp, n);

			}
			temp.clear();
		}

		for(int i = 1; i < 21; i++)
		{

			if (numbers[i] != 0)
			{

				product *= Math.pow(i, numbers[i]);
			}
		}

		return product;
	}

	public static void main(String args[])
	{

		ArrayList<Integer> listOfNumbers = new ArrayList<Integer>();
		for(int i=1; i < 21; i++)
		{

			listOfNumbers.add(i);
			numbers[i] = 0;
		}

		System.out.println(findLCM(listOfNumbers));
	}
}