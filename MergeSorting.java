package mergesorting;

/**
 *
 * @author teva
 */
public class MergeSorting {

    /**
     * @param args the command line arguments
     */
    
    public static void MergeSorting(int[] arr)
    {
        int l = arr.length;
        if(l < 2) return;
        int mid = l / 2;
        int[] left = new int[l - mid];
        int[] right = new int[mid];
        int i = 0;
        
        for(i = 0; i < l - mid; i++)
        {
            left[i] = arr[i];
        }
        
        for(int j = 0; j < mid; j++, i++)
        {
            right[j] = arr[i];
        }
        
        MergeSorting(left);
        MergeSorting(right);
        Merge(arr, left, right); 
    }
    
    // this is for merging two sorted arrays in a single array
    public static void Merge(int[] arr, int[] left, int[] right)
    {
        int leftptr = 0;
        int rightptr = 0;
        int k = 0;
        
        while(leftptr < left.length && rightptr < right.length)
        {
            if(left[leftptr] < right[rightptr])
            {
                arr[k] = left[leftptr];
                leftptr++;
                k++;
            }
            else
            {
                arr[k] = right[rightptr];
                rightptr++;
                k++;
            }
        }
        
        while(leftptr < left.length)
        {
           arr[k] = left[leftptr];
           leftptr++;
           k++;  
        }
        
        while(rightptr < right.length)
        {
            arr[k] = right[rightptr];
            rightptr++;
            k++;
        }        
    }
    
    public static void printArray(int[] a)
    {
        for(int i=0; i < a.length; i++)
        {
            System.out.println(a[i] + " ");
        }
    }
        
    public static void main(String[] args) {
        int[] arr1 = new int[]{23, 12, 10, 45, 56, 67};
        printArray(arr1);
        MergeSorting(arr1);
        System.out.println("After sorting");
        printArray(arr1);
    }
}
