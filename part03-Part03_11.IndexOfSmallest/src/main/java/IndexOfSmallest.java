
import java.util.ArrayList;
import java.util.Scanner;

public class IndexOfSmallest {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // implement here a program that reads user input
        // until the user enters 9999
        ArrayList<Integer> list = new ArrayList<>();

        while (true) {
            int number = Integer.valueOf(scanner.nextLine());
            if (number == 9999) {
                break;
            } else {
                list.add(number);
            }
        }


        // after that, the program prints the smallest number
        // and its index -- the smallest number
        // might appear multiple times
        //System.out.println(list.size());

        int smallest = list.get(0);
        for (int i = 0; i < list.size(); i++) {
            int numberAt = list.get(i);
            if (smallest > numberAt) {
                smallest = numberAt;
            }
        }
        System.out.println("Smallest number: " + smallest);

        for (int i = 0; i < list.size(); i++) {
            if(smallest == list.get(i)) {
                System.out.println("Found at index: " + i);
            }
        }
    }
}