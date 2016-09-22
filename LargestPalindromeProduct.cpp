// ProjectEuler.cpp : Defines the entry point for the console application.
//

#include "stdafx.h"
#include <iostream>
#include <stack>

using namespace std;

bool is_palindrome(int number)
{

	int originalNumber = number;
	int remainder = 0;
	int temp = 0;

	while (number != 0)
	{

		remainder = number % 10;
		temp = temp * 10 + remainder;
		number = number / 10;
	}

	if (originalNumber == temp)
	{
		return true;
	}  
	else
	{
		return false;
	}
}
int main()
{
	bool is_palin = false;
	int number = 1002;
	int max = 0;

	for (int i = 1; i <= 999; i++)
	{
		for (int j = i; j <= 999; j++)
		{

			if (is_palindrome(i * j))
			{
				if (max > (i * j))
				{
					max = i * j;
				}
			}
			cout << "Product " << i * j << endl;
		}
	}
	
	getchar();
}

