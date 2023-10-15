import java.util.Scanner;
public class Main {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);

		boolean loop = true;

		// Input Array Size
		System.out.print("Enter Array Size : ");
		int arraySize = input.nextInt();

		// Declaration Array
		int[] numArray = new int[arraySize];

		DynamicArray array = new DynamicArray(numArray, arraySize);

		array.EnterArrayValues();
		array.DisplayArrayValues(array.numArray);

		while (loop) {
			// Index to enter the new element
			System.out.print("\nWhat index you wish to insert : ");
			int indexInsert = input.nextInt();

			// Index is in between 0 and last index
			if (indexInsert < array.arraySize && indexInsert >= 0) {

				// New value that will be inserted to new array
				System.out.print("\nWhat value you wish to insert : ");
				int valueInsert = input.nextInt();

				array.InsertElements(indexInsert, valueInsert);
				array.DisplayArrayValues(array.numArray);

			} else {
				System.out.println("\nInvalid Index! Current occupied indices are from 0 to " + (array.arraySize - 1));
			}

			// User will be asked to end the program or continue
			System.out.print("\nPress y to try again and n to end the program:");
			String choice = input.next();

			switch (choice) {

			case "y", "Y":
				loop = true;
				break;

			case "n", "N":
				System.out.println("\nEnd Program...");
				loop = false;
				break;

			default:
				System.out.println("\nInvalid Input");
				loop = false;

			}
		}
	}

}
