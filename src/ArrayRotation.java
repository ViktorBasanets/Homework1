
public class ArrayRotation {
    public static void main(String[] args) {

        int [] array = {5, 6, 1, 2, 6};

        System.out.println("Input array:");
        show(array);

        rotate(array, 2);

        System.out.println("Output array:");
        show(array);
    }

    private static void rotate(int [] array, int k) {

        if(k >= array.length) {
            System.err.println("'k' bigger then length the main array!!!");
            System.exit(0);
        }

        int [] temp = new int[k];

        for(int i = 0; i < temp.length; i++) {
            temp[i] = array[i];
        }

        for(int i = 0; i < array.length - k; i++) {
            array[i] = array[i + k];
        }

        for(int i = 0; i < temp.length; i++) {
            array[array.length - k + i] = temp[i];
        }
    }

    private static void show(int [] array) {

        System.out.print("[");
        for (int value : array) {
            System.out.print(value + " ");
        }
        System.out.println("]\n");
    }
}
