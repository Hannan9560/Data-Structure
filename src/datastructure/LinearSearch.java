/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package datastructure;

/**
 *
 * @author root
 */
public class LinearSearch {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int arr[] = {2, 3, 4, 10, 40};
        
        int x = 10;
        
        int result = search(arr, x);
        if(result == -1)
        {
            System.out.println("Element is not present in array");
        }
        else
        {
            System.out.println("Elemnet is present at index "+ result);
        }
                
    }

    private static int search(int[] arr, int x) {
        int n = arr.length;
        for(int i = 0; i< n; i++)
        {
            if(arr[i] == x)
            {
                return i;
            }
        }
        return -1;
    }
    
}
