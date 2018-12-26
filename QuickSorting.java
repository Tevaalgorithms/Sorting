package quicksorting;

/**
 *
 * @author teva
 */
public class QuickSorting 
{
    public static void QuickSorting(int[] arr, int startIndex, int endIndex)
    {
        // Step 1: Base condition
        if(startIndex > endIndex) return;
        
        int partionIndex = partition(arr, startIndex, endIndex);
        
        QuickSorting(arr, startIndex , partionIndex -1);
        
        QuickSorting(arr, partionIndex + 1, endIndex);
       
    }
    
    static int partition(int[] arr, int startIndex, int endIndex)
    {
        int pivot = arr[endIndex];
        int partionIndex = startIndex;
        
        for(int i = startIndex; i < endIndex; i++)
        {
            if(arr[i] < pivot)
            {
                swap(arr, partionIndex, i);
                partionIndex++;
            }
        }
        int temp = arr[partionIndex];
        arr[partionIndex] = pivot;
        arr[endIndex] = temp;
        return partionIndex;
    }
    
    static void swap(int[] arr, int i, int j)
    {
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }
    
    public static void printArray(int[] a)
    {
        for(int i=0; i < a.length; i++)
        {
            System.out.println(a[i] + " ");
        }
    }
    

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int[] arr1 = new int[]{23, 12, 10, 45, 56, 67};
        printArray(arr1);
        QuickSorting(arr1, 0, arr1.length -1);
        System.out.println("After sorting");
        printArray(arr1);
    }
    
}
