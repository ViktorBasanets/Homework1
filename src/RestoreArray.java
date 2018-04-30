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

        // int [] array = {1, 2, -1, 4, -1, 6, 8, 7, -9, 5, -11, 3}; - also works!
        int [] array = {1, 2, -1, 4, 7, 6, -2, 4};
        show(array);

        restore(array);
        show(array);
    }

    static void restore(int [] array) {
        int i;
        for (i = 0; i < array.length/2 - 1; i++) {
            if(array[i + 1] - array[i] != 1) {
                array[i + 1] = array[i] + 1;
            }
        }
        for(i = array.length/2; i < array.length - 1; i++) {
            if(array[i] - array[i + 1] != 1) {
                array[i + 1] = array[i] - 1;
            }
        }
    }

    static void show(int [] array) {

        for (int value : array) {
            System.out.print(value + " ");
        }
        System.out.println();
    }
}
