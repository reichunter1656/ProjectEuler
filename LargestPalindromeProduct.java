public class LargestPalindromeProduct
{

	public static void main(String args[])
	{

		System.out.println(isPalindrome(9009));
		System.out.println(isPalindrome(143));
		System.out.println(isPalindrome(0));
		System.out.println(isPalindrome(9));
		System.out.println(isPalindrome(333333333333333333L));

	}

	private static boolean isPalindrome(long number)
	{
		long temp_num = number;
		long final_num = number;

		long count = 0;
		while (temp_num > 0)
		{

			long temp = temp_num % 10;
			count ++;
			temp_num = temp_num / 10;
		}
		System.out.println(count);
		long sum = 0;
		while (number > 0)
		{

			long temp = number % 10;
			sum += temp * Math.pow(10, count-1);
			System.out.println(temp * Math.pow(10, count-1));
			number = number / 10;
			count --;
		}
		System.out.println(sum + " " + final_num);
		if (sum == final_num) return true;
	 	else return false;
	}
}