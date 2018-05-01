import java.util.ArrayList;
import java.util.List;

/*
        Restore array
    Given an unsorted array of positive integers.
    The array divided into monotone parts in which some elements replaced by negative values.
    Find missing positive integers in the array. Negative elements can be placed only inside a monotone part.
    Negative elements cannot be in neighboring cells.

    * monotone part - a sequence where each next number greater(less)
    * than previous. e.g. 4 5 6 7 8 is the monotone part, but 5 3 1 6 7 is not monotone.

    Input
    {array_length}
    {array_values}

    Output
    {restored array}

    Example
    Input
    8
    1 2 -1 4 7 6 -2 4

    Output
    1 2 3 4 7 6 5 4
*/
public class RestoreArray {
    public static void main(String[] args) {

        int [] array = {1, 2, -1, 4, -1, 6, 8, 7, -9, 5, -11, 3}; // - also works!
        // int [] array = {1, 2, -1, 4, 7, 6, -2, 4};
        show(array);
        //System.out.println(Arrays.toString(array));

        restoreArray(array);
        show(array);
    }

    static void restoreArray(int [] array) {

        for(int i = 0; i < array.length; i++) {
            if (array[i] < 0) {
                array[i] = (array[i - 1] + array[i + 1]) / 2;
            }
        }
    }

    static void show(int [] array) {
        System.out.print("[");
        for (int value : array) {
            System.out.print(value + " ");
        }
        System.out.print("]\n");
    }
}
