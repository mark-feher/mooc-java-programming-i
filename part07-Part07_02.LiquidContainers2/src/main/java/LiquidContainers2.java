
import java.util.Scanner;

public class LiquidContainers2 {

    public static void main(String[] args) {
        Container firstContainer = new Container();
        Container secondContainer = new Container();
        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.println("First: " + firstContainer);
            System.out.println("Second: " + secondContainer);

            String command = scanner.nextLine();

            if (command.equals("quit")) {
                break;
            }

            String[] splitCommand = command.split(" ");

            String commandToExecute = splitCommand[0];
            int valueOfCommandToExecute = Integer.valueOf(splitCommand[1]);

            switch (commandToExecute) {
                case "add":
                    firstContainer.add(valueOfCommandToExecute);
                    break;
                case "move":
                    if (valueOfCommandToExecute <= 0 || firstContainer.contains() == 0) {
                        return;
                    }

                    if (firstContainer.contains() - valueOfCommandToExecute < 0) {
                        valueOfCommandToExecute = firstContainer.contains();
                    }
                    firstContainer.remove(valueOfCommandToExecute);
                    secondContainer.add(valueOfCommandToExecute);
                    break;
                case "remove":
                    secondContainer.remove(valueOfCommandToExecute);
                    break;
            }
        }
    }

}
