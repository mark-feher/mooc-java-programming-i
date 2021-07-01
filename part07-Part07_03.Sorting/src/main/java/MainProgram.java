import java.util.Arrays;

public class MainProgram {

    public static void main(String[] args) {
        // write your test code here
        int[] array = {8, 3, 7, 9, 1, 2, 4};

        System.out.println(smallest(array));
        System.out.println("Index of the smallest number: " + indexOfSmallest(array));
        System.out.println("Index of the smallest number from the start number: " + indexOfSmallestFrom(array, 5));

        swap(array, 0, array.length - 1);
        System.out.println(Arrays.toString(array));
        swap(array, 1, 3);
        System.out.println(Arrays.toString(array));

        System.out.println("sorting");

        sort(array);
    }

    public static int smallest(int[] array) {
        int smallest = array[0];

        for (int i = 0; i < array.length; i++) {
            if (smallest > array[i]) {
                smallest = array[i];
            }
        }

        return smallest;
    }

    public static int indexOfSmallest(int[] array) {
        int index = 0;

        for (int i = 0; i < array.length; i++) {
            if (array[i] == smallest(array)) {
                index = i;
            }
        }

        return index;
    }

    public static int indexOfSmallestFrom(int[] array, int startIndex) {
        int index = 0;
        int smallest = array[startIndex];

        for (int i = startIndex; i < array.length; i++) {
            if (smallest >= array[i]) {
                smallest = array[i];
                index = i;
            }
        }

        return index;
    }

    public static void swap(int[] array, int indice1, int indice2) {
        int helper = array[indice1];
        array[indice1] = array[indice2];
        array[indice2] = helper;
    }

    public static void sort(int[] array) {
        System.out.println(Arrays.toString(array));

        for (int i = 0; i < array.length; i++) {
            swap(array, i, indexOfSmallestFrom(array, i));

            System.out.println(Arrays.toString(array));
        }
    }
}
