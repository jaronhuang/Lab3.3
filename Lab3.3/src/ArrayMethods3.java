/**
 * Lab 3.3
 * @author Jaron Huang 
 * 11/28/17
 */
public class ArrayMethods3 
{

	public static void main(String[] args)
	{
		int[] list = {5, 1, 6, 2, 4, 3};
		insertionSort(list);
		printArray(list);
		
		double[] list1 = {1.1, 1.3, 1.5, 0.7, -1.1};
		selectionSort(list1);
		printArray(list1);
		
		String[] list2 = {"banana", "donkey", "apple", "corn", "sand", "rainbow"};
		bubbleSort(list2);
		printArray(list2);
		
	}
	
	/**
	 * Sorts an array of integers by taking each element from the array, and adding it to the front of the
     * array in the correct order.
	 * @param list1 Array of integers
	 */
	public static void insertionSort(int[] list1)
	{
		int index = 0;
		for (int i = 0; i < list1.length - 1; i++)
		{
			if (list1[i] > list1[i + 1])
			{
				index = i + 1;
				for (int j = i; j > -1; j--)
				{
					if (list1[index] < list1[j])
					{
						swap(list1, index, j);
						index = j;
						
					}
				}
			}
		}
	}
	
	/**
	 * Sorts an array of numbers by finding the lowest element and moves it to the front of the array.
	 * It repeats that until there are no swaps needed anymore.
	 * @param list1 Array of numbers 
	 */
	public static void selectionSort(double [] list1)
	{
		for(int i = 0; i < list1.length; i++)
		{
			swap(list1, i, findMin(i, list1));
		}
	}
	
	/**
	 * Sorts an array of strings by iterating through the list, and swapping any out of order elements.
	 * @param list1 Array of strings
	 */
	public static void bubbleSort(String [] list1)
	{
		boolean isSorted = false;
		while(!isSorted)
		{
			isSorted = true;
			for (int i = 0; i < list1.length - 1; i++)
			{
				if (list1[i].compareTo(list1[i + 1]) > 0)
				{
					swap(list1, i, i+1);
					isSorted = false;
				}
			}
		}
	}
	
	/**
	 * Swaps the position of two integers
	 * @param arr Array of integers
	 * @param i Index of the first integer you want to swap
	 * @param j Index of the second integer you want to swap
	 */
	public static void swap(int[] arr, int i, int j)
	{
		int temp = arr[i];
		arr[i] = arr[j];
		arr[j] = temp;
	}
	
	/**
	 * Swaps the position of two numbers
	 * @param arr Array of numbers
	 * @param i Index of the first number you want to swap
	 * @param j Index of the second number you want to swap
	 */
	public static void swap(double[] arr, int i, int j)
	{
		double temp = arr[i];
		arr[i] = arr[j];
		arr[j] = temp;
	}
	
	/**
	 * Swaps the position of two strings
	 * @param arr Array of string
	 * @param i Index of the first string you want to swap
	 * @param j Index of the second string you want to swap
	 */
	public static void swap(String[] arr, int i, int j)
	{
		String temp = arr[i];
		arr[i] = arr[j];
		arr[j] = temp;
	}
	
	/**
	 * Finds the index of the lowest number in the array
	 * @param fIndex Index of the number you want to start the search from
	 * @param list1 array of numbers
	 * @return Index of the lowest number in the array
	 */
	public static int findMin(int fIndex, double[] list1)
	{
		double temp = list1[fIndex];
		int index = fIndex;
		for(int i = fIndex; i < list1.length; i++)
		{
			if(temp > list1[i]) 
			{
				temp = list1[i];
				index = i;
			}
		}
		return index;
	}
	
	/**
	 * Prints out each element of the array
	 * @param arr Array of strings
	 */
	public static void printArray(String[] arr)
	{
		for(int i = 0; i < arr.length; i++)
		{
			System.out.print(arr[i] + " ");
		}
		System.out.println();
	}
	
	/**
	 * Prints out each element of the array
	 * @param arr Array of integers
	 */
	public static void printArray(int[] arr)
	{
		for(int i = 0; i < arr.length; i++)
		{
			System.out.print(arr[i] + " ");
		}
		System.out.println();
	}
	
	/**
	 * Prints out each element of the array
	 * @param arr Array of numbers
	 */
	public static void printArray(double[] arr)
	{
		for(int i = 0; i < arr.length; i++)
		{
			System.out.print(arr[i] + " ");
		}
		System.out.println();
	}
}
