import java.io.*;
import java.util.*;

public class MultiplesOf3Or5
{
	public static void main(String args[])
	{

		int sumOfAll = 0;
		int limit = 1000;
		sumOfAll += findMultiplesOf3Or5(limit);

		System.out.println("The sum: " + sumOfAll);
	}

	private static int findMultiplesOf3Or5(int limit)
	{
		List<Integer> multiplesList = new ArrayList<Integer>();
		int sum = 0;

		for (int i = 1; i < limit; i++)
		{
			if ( i % 3 == 0 || i % 5 == 0)
			{

				multiplesList.add(i);
			}
		}

		return getSumOfList(multiplesList);
	}

	private static int getSumOfList(List<Integer> list)
	{

		int sum = 0;
		for (int number : list)
		{
			sum += number;
		}
		return sum;
	}
}