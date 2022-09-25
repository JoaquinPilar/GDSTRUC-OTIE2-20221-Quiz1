
// Selection Sort File

/* Instructions: Modify the Selection Sort to sort arrays in descending order

Modify the Selection Sort to look for the smallest value first and put it
at the end instead of looking for the largest and putting it in the beginning.   */

import java.util.Arrays;

public class DescendingSelectionSort
{

    public static void main(String[] args)
    {

        // Selection Sort Array
        int[] ar = {9, 90, 63, 45, 72, 18, 81, 27, 36, 54};
        int size = ar.length;

        // Function to print array before sorting
        System.out.print("\n");
        System.out.print("Array Before Sorting:\n");
        System.out.println(Arrays.toString(ar));
        System.out.print("\n");

        for (int i = 0 ;i< size-1; i++)
        {

            int min = i;

            for (int j = i+1; j< size; j++)
            {
                if (ar[j] > ar[min]){
                    min = j;
                }
            }

            int temp = ar[min];
            ar[min] = ar[i];
            ar[i] = temp;

        }

        // Function to print array after sorting
        System.out.print("Array After Sorting:\n");
        System.out.print("[");

        // Function for incrementing and outputting sorted elements of the array
        for (int j : ar)
        {
            System.out.print(" " + j + ",");
        }
        System.out.print("]\n");

    }
}