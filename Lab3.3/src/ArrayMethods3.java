
public class ArrayMethods3 
{

	public static void main(String[] args)
	{
		int[] list = {5, 1, 6, 2, 4, 3};
		insertionSort(list);
		printArray(list);
		
		/*double[] list1 = {1.1, 1.3, 1.5, 0.7, -1.1};
		selectionSort(list1);
		printArray(list1);
		
		String[] list2 = {"banana", "donkey", "apple", "corn", "sand", "rainbow"};
		bubbleSort(list2);
		printArray(list2);*/
		
	}
	
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
						System.out.println("Swapping: " + list1[i] + " " + list1[i + 1]);
						swap(list1, index, j);
						printArray(list1);
						index = j;
						
					}
				}
			}
		}
	}
	
	public static void selectionSort(double [] list1)
	{
		for(int i = 0; i < list1.length; i++)
		{
			swap(list1, i, findMin(i, list1));
		}
	}
	
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
	
	public static void swap(int[] arr, int i, int j)
	{
		int temp = arr[i];
		arr[i] = arr[j];
		arr[j] = temp;
	}
	
	public static void swap(double[] arr, int i, int j)
	{
		double temp = arr[i];
		arr[i] = arr[j];
		arr[j] = temp;
	}
	
	public static void swap(String[] arr, int i, int j)
	{
		String temp = arr[i];
		arr[i] = arr[j];
		arr[j] = temp;
	}
	
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
	
	public static void printArray(String[] arr)
	{
		for(int i = 0; i < arr.length; i++)
		{
			System.out.print(arr[i] + " ");
		}
		System.out.println();
	}
	
	public static void printArray(int[] arr)
	{
		for(int i = 0; i < arr.length; i++)
		{
			System.out.print(arr[i] + " ");
		}
		System.out.println();
	}
	
	public static void printArray(double[] arr)
	{
		for(int i = 0; i < arr.length; i++)
		{
			System.out.print(arr[i] + " ");
		}
		System.out.println();
	}
}
