/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package insertion_sorting;

/**
 *
 * @author teva
 */
public class Insertion_sorting {

   // Complete the insertionSort1 function below.
    static void insertionSort1(int n, int[] arr) 
    {
        if(n > arr.length) return;
        if(arr.length < 1)return;
        int temp = arr[n-1];
        boolean check = false;
        for(int i = arr.length - 2; i >= 0; i-- )
        {
            if(temp < arr[i])
            {
                arr[i + 1] = arr[i];
                print(arr);
            }
            else
            {
                arr[i + 1] = temp;               
                print(arr);
                check =true;
                break;
            }
        }
        if(!check)
        {
            arr[0] = temp;
            print(arr);
        }
        
    }
    static void print(int[] arr)
    {
        for(int i = 0 ; i < arr.length; i++)
        {
            System.out.print(arr[i] + " ");
        }
        System.out.print("\n");
    }
    
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) 
    {
        int n = 10;
        int[] arr = new int[]{2 ,3 ,4 ,5, 6, 7, 8, 9, 10, 1};
        insertionSort1(n, arr);
    }
    
}
