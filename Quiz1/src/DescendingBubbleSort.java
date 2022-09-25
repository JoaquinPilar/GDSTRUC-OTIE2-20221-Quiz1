
// Bubble Sort File

// Instructions: Modify the Bubble Sort to sort arrays in descending order

import java.util.Arrays;
import java.util.stream.IntStream;

public class DescendingBubbleSort {

    // Function for incrementing and outputting sorted elements of the array
   public static void bubble_Sort(int[] array)
    {
        int size = array.length;
        int i = 0;

        while (i < size - 1)
        {
            IntStream.range(0, size - i - 1).filter(j -> array[j] < array[j + 1]).forEach(j -> {
                int temp = array[j];
                array[j] = array[j + 1];
                array[j + 1] = temp;
            });
            i++;
        }
    }

    public static void main(String[] args) {

        // Bubble Sort Array
        int[] ar = {9, 90, 63, 45, 72, 18, 81, 27, 36, 54};
        bubble_Sort(ar);

        // Function to print array before sorting
        System.out.print("\n");
        System.out.print("Array Before Sorting:\n");
        System.out.println("{9, 90, 63, 45, 72, 18, 81, 27, 36, 54}");
        System.out.print("\n");

            // Function to print array after sorting
            System.out.println("Array After Sorting: ");
            System.out.println(Arrays.toString(ar));

        }
    }