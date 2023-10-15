import java.util.Scanner;

public class DynamicArray {
	Scanner input = new Scanner(System.in);

	// Class Fields
	int[] numArray, newArray;
	int arraySize;

	// Parameterized Constructor
	DynamicArray(int[] numArray, int arraySize) {

		this.numArray = numArray;
		this.arraySize = arraySize;

	}

	// Method for entering array values
	public void EnterArrayValues() {

		for (int index = 0; index < numArray.length; index++) {
			System.out.print("Enter the value for index " + index + ": ");
			numArray[index] = input.nextInt();
		}

	}

	// Method for displaying array values
	public void DisplayArrayValues(int[] numArray) {

		System.out.print("\nThe elements are : ");
		for (int index = 0; index < numArray.length; index++) {
			System.out.print(numArray[index] + " ");
		}

		System.out.println();

	}

	// Method for copying elements from old array to new array
	public void CopyElements(int[] newArray, int[] oldArray) {

		for (int index = 0; index < oldArray.length; index++) {
			newArray[index] = oldArray[index];
		}

	}

	// Method for inserting new elements
	public void InsertElements(int indexInsert, int valueInsert) {

		// Incrementing the array size
		arraySize++;

		// Declaring new array
		newArray = new int[arraySize];

		// Copying elements of old array to new array
		CopyElements(newArray, numArray);

		// Adjusting the array to right
		// index = 3 > indexInsert = 1
		for (int index = newArray.length - 1; index > indexInsert; index--) {

			// [0] = 5, [1] = 2, [2] = 6, [3] = 0

			// newArray[3] = 0 will be newArray[3] = newArray[2] = 6
			// newArray[2] = 6 will be newArray[2] = newArray[1] = 2

			newArray[index] = newArray[index - 1];

		}

		newArray[indexInsert] = valueInsert;
		
	}
}