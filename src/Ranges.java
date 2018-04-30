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

import java.util.*;

public class Ranges {
    public static void main(String[] args) {

        int[] array = {1, 2, 3, 5, 8, 9, 10, 13, 14, 15, 16};

        System.out.println("Input array:");
        show(array);

        rank(array);
    }

    static void rank(int [] array) {

        List temp = new ArrayList();
        int k;
        for(k = 0; k < array.length - 1; k++) {
            if(array[k + 1] - array[k] == 1) {
                temp.add(array[k]);
            } else {
                temp.add(array[k]);
                show(temp);
                temp.clear();
            }
        }
        temp.add(array[k]);
        show(temp);
    }

    private static void show(List temp) {

        if(temp.size() != 1) {
            System.out.print("["
                    + Collections.min(temp) + " "
                    + Collections.max(temp) + "]");
        } else {
            System.out.print(temp);
        }
    }

    static void show(int [] array) {

        for (int value : array) {
            System.out.print(value + " ");
        }
        System.out.println();
    }
}

