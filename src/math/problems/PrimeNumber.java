package math.problems;

public class PrimeNumber {

	public static void main(String[] args) {

		int n =0;
		int num =0;
		String primeNumbers = "";
		for (n = 1; n <= 100000; n++)
		{
			int counter=0;
			for(num =n; num>=1; num--)
			{
				if(n%num==0)
				{
					counter = counter + 1;
				}
			}
			if (counter ==2)
			{
				primeNumbers = primeNumbers + n + " ";
			}
		}
		System.out.println("Prime numbers from 2 to 1000000 are :");
		System.out.println(primeNumbers);
	}





	/*
		 * Find list of Prime numbers from number 2 to 1 million.
		 * Try the best solution as possible.Which will take less CPU life cycle.
		 * Out put number of Prime numbers on the given range.
		 *
		 *
		 * Use any databases[MongoDB, Oracle, MySql] to store data and retrieve data.
		 *
		 */

	}


