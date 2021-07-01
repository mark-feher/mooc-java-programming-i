
import java.util.Scanner;

public class LiquidContainers {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int firstCont = 0;
        int secondCont = 0;

        while (true) {

            String first = "First: " + firstCont + "/100";
            String second = "Second: " + secondCont + "/100";
            System.out.println(first);
            System.out.println(second);

            String input = scan.nextLine();

            if (input.equals("quit")) {
                break;
            }

            String[] splitInput = input.split(" ");
            String command = splitInput[0];
            int amount = Integer.valueOf(splitInput[1]);

            switch (command) {
                case "add":
                    if (amount <= 0) {
                        amount = 0;
                    }

                    if (firstCont + amount <= 100) {
                        firstCont += amount;
                    } else if (firstCont + amount > 100) {
                        firstCont = 100;
                    }

                    break;
                case "move":
                    if (amount <= 0 || firstCont == 0) {
                        return;
                    }
                    if (firstCont - amount < 0) {
                        amount = firstCont;
                    }
                    if (amount >= 100) {
                        firstCont = 0;
                        secondCont = 100;
                    } else if (secondCont + amount <= 100) {
                        firstCont -= amount;
                        secondCont += amount;
                    } else if (amount + secondCont > 100 && amount + firstCont > 100) {
                        secondCont = 100;
                        firstCont = 0;
                    }

                    break;
                case "remove":
                    if (amount <= 0) {
                        return;
                    }
                    if (amount > secondCont) {
                        amount = 0;
                    } else {
                        secondCont -= amount;
                    }

                    break;
                default:
                    System.out.println("Unknown command");
            }
        }
    }

}
