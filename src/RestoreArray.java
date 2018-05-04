
public class RestoreArray {
    public static void main(String[] args) {

        int [] array = {1, 2, -1, 4, 7, 6, -2, 4};

        System.out.println("Input array:");
        show(array);

        System.out.println("Restore array:");
        restoreArray(array);
        show(array);
    }

    static void restoreArray(int [] array) {

        for(int i = 0; i < array.length; i++) {

            if(array[i] < 0 ) {
                array[i] = array[i - 1] - array[i + 1] < 0
                        ? array[i - 1] + 1 : array[i - 1] - 1;
            }
        }
    }

    static void show(int [] array) {
        System.out.print("[");
        for (int value : array) {
            System.out.print(value + " ");
        }
        System.out.println("]\n");
    }
}
