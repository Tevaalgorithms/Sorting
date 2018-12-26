package bubble_sorting;


/**
 *
 * @author teva
 */
public class Bubble_Sorting {

    public static void bubbleSorting(int[] arr)
    {
        for(int j = 0; j < arr.length - 1; j++)
        {
           for(int i = 0; i < arr.length - 2; i++)
            {
                if(arr[i] > arr[i+1])
                {
                    int temp = arr[i];
                    arr[i] = arr[i + 1];
                    arr[i + 1] = temp;
                }
            }   
        }     
    }
    
   public static void bubbleSortingLittleOptimized(int[] arr)
    {
        for(int j = 0; j < arr.length - 1; j++)
        {
           for(int i = 0; i < arr.length - j - 1; i++)
            {
                if(arr[i] > arr[i+1])
                {
                    int temp = arr[i];
                    arr[i] = arr[i + 1];
                    arr[i + 1] = temp;
                }
            }   
        }     
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
        bubbleSorting(arr1);
        System.out.println("After sorting");
        printArray(arr1);
    }
    
}
