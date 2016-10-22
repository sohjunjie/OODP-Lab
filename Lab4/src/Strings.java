import java.util.Scanner;

public class Strings {

	public static void main (String[] args)
	{
		Comparable[] stringList;
		int size;
		Scanner scan = new Scanner(System.in);
		System.out.print ("\nHow many strings do you want to sort? ");
		size = scan.nextInt();
		scan.nextLine();	//consume leftover newline
		
		stringList = new Comparable[size];
		System.out.println ("\nEnter the strings...");
		for (int i = 0; i < size; i++)
			stringList[i] = scan.nextLine();

		
		Sorting.selectionSort(stringList);
		System.out.println ("\nYour strings in sorted order...");

		for (int i = 0; i < size; i++)
			System.out.print(stringList[i] + " ");
		System.out.println ();
		
		
		Sorting.insertionSort(stringList);
		System.out.println ("\nYour strings in descending order with insertion sort...");

		for (int i = 0; i < size; i++)
			System.out.print(stringList[i] + " ");
		System.out.println ();
		
	}

}
