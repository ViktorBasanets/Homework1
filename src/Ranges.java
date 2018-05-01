/*
    Ranges

    Given a sorted integer array. Print all ranges in which each next element is increased by one.
    The range is defined its minimal and maximal values. If the range contains one element print only its value.

    Input
    {array_length}
    {array_values}

    Output
    [{min_range1} {max_range1}]...[{min_rangeN} {max_rangeN}]

    Example
    Input
    11
    1 2 3 5 8 9 10 13 14 15 16

    Output
    [1 3][5][8 10][13 16]
*/

import java.util.Arrays;

public class Ranges {
    public static void main(String[] args) {

        int[] array = {1, 2, 3, 5, 8, 9, 10, 13, 14, 15, 16};

        System.out.println("Input array:");
        show(array);
        //System.out.println(Arrays.toString(array));
        rank(array);
    }

    static void rank(int [] array) {
        System.out.print("[" + array[0]);
        int i;
        for(i = 1; i < array.length - 1; i++) {
            if ((array[i] - array[i - 1] != 1) && (array[i + 1] - array[i] != 1)) {
                System.out.print("[" + array[i] + "]");
            } else if (array[i] - array[i - 1] != 1) {
                System.out.print("[" + array[i]);
            } else if (array[i + 1] - array[i] != 1) {
                System.out.print(" " + array[i] + "]");
            }
        }
        System.out.print(" " + array[i] + "]");
    }

    static void show(int [] array) {
        System.out.print("[");
        for (int value : array) {
            System.out.print(value + " ");
        }
        System.out.print("]\n");
    }
}

