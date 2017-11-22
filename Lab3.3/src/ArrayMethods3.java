
public class ArrayMethods3 
{

	public static void main(String[] args)
	{
		int[] list = {4, 1, 7, 3, 0};
		insertionSort(list);
		for (int i = 0; i < list.length; i++)
		{
			System.out.println(list[i]);
		}
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
						swap(list1, index, j);
						System.out.println("Swapping: " + list1[index] + " " + list1[j]);
						index = j;
					}
				}
			}
		}
	}
	
	public static void selectionSort(double [] list1)
	{
		
	}
	
	public static void bubbleSort(String [] list1)
	{
		
	}
	
	public static void swap(int[] arr, int i, int j)
	{
		int temp = arr[i];
		arr[i] = arr[j];
		arr[j] = temp;
	}
}
