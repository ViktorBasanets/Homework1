/*
    Array Rotation

    Given an integer array. Move first k elements to the array end.

    Input
    {array length} {k}
    {array values}

    Output
    {rotated array}

    Example
    Input
    5 2
    5 6 1 2 6

    Output
    1 2 6 5 6
*/
public class ArrayRotation {
    public static void main(String[] args) {

        // Input data
        int k = 2;
        int [] array = {5, 6, 1, 2, 6};

        System.out.println("Input array:");
        show(array);
        //System.out.println(Arrays.toString(array));

        rotate(array, k);

        System.out.println("\nOutput array:");
        show(array);
    }

    static void rotate(int [] array, int k) {

        while (k-- != 0) {
            int temp = array[0];
            for(int i = 0; i < array.length - 1; i++) {
                array[i] = array[i + 1];
            }
            array[array.length - 1] = temp;
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
