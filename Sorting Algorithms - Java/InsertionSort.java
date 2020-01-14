public class InsertionSort
{
    public static void insertionSort(int[] arr)
    {
	int i;
	int n = arr.length;
	for (i=1; i <n; ++i)			   //Pass
	{
	    int j = i - 1;		           //Last Sorted Position
	    int insertor = arr[i];

	    while (j > -1 && insertor > arr[j])
	    {
		arr[j + 1] = arr[j];
		--j;
	    }
	    arr[j + 1] = insertor;
	}
	
    }
    
    public static void main(String[] args)
    {
	int []arr = {9,-5,0,33,98,983,-9};
	insertionSort(arr);
	
	for(int i:arr)
	{
	    System.out.print(i+" ");
	}
    }
}
