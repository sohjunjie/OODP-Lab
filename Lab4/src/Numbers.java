import java.util.Scanner;
public class Numbers
{

	// --------------------------------------------
	// Reads in an array of integers, sorts them,
	// then prints them in sorted order.
	// --------------------------------------------
	public static void main (String[] args)
	{
		Comparable[] intList;
		int size;
		Scanner scan = new Scanner(System.in);
		System.out.print ("\nHow many integers do you want to sort? ");
		size = scan.nextInt();

		intList = new Comparable[size];
		System.out.println ("\nEnter the numbers...");
		for (int i = 0; i < size; i++)
			intList[i] = scan.nextInt();


		Sorting.selectionSort(intList);
		System.out.println ("\nYour numbers in sorted order...");

		for (int i = 0; i < size; i++)
			System.out.print(intList[i] + " ");
		System.out.println ();


		Sorting.insertionSort(intList);
		System.out.println ("\nYour numbers in descending order with insertion sort...");

		for (int i = 0; i < size; i++)
			System.out.print(intList[i] + " ");
		System.out.println ();
		
	}
	
	/**
	 * Reason why the initial code fail to compile
	 * 
	 * ==Datatype of input parameter==
	 * The Sorting class selectionSort method expects a Comparable type array input
	 * however an int array was given
	 * 
	 * ==solution==
	 * Change the array type of intList to Comparable. Java will automatically
	 * employ autoboxing to convert primitive int variable to Comparable when
	 * trying to assign int to Comparable array intList[]
	 */

	

}
