
public class Ranges {
    public static void main(String[] args) {

        int[] array = {1, 2, 3, 5, 8, 9, 10, 13, 14, 15, 16};

        System.out.println("Input array:");
        show(array);

        System.out.println("Output ranges:");
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
        System.out.println("]\n");
    }
}

