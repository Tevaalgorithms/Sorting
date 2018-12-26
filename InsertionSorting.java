package insertionsorting;

/**
 *
 * @author teva
 */
public class InsertionSorting {
    
    public static void insertionSorting(int[] arr)
    {
        for(int i = 0; i < arr.length - 1; i++)
        {
            int value = arr[i];
            int hole = i;
            
            while(hole > 0 && arr[hole - 1] > value)
            {
                arr[hole] = arr[hole-1];
                hole --;
            }
            arr[hole] = value;            
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
    public static void main(String[] args) 
    {
        int[] arr1 = new int[]{23, 12, 10, 45, 56, 67};
        printArray(arr1);
        insertionSorting(arr1);
        System.out.println("After sorting");
        printArray(arr1);
    }
    
}
