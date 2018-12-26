public class Selection_Sorting 
{
    
    public static int[] selectSorting(int[] arr)
    {
        for(int i = 0; i < arr.length - 2; i++)
        {
            int min_Index = i;
            
            for(int j = i + 1; j < arr.length-1; j++)
            {
                if(arr[min_Index] > arr[j])
                {
                    min_Index = j;
                }
            }
            
            int temp = arr[min_Index];
            arr[min_Index] = arr[i];
            arr[i] = temp;
        }
        
        return arr;
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
        selectSorting(arr1);
        System.out.println("After sorting");
        printArray(arr1);
        // TODO code application logic here
    }
    
}
