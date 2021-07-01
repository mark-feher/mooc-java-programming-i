import java.util.ArrayList;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        
        // implement here the program that allows the user to enter 
        // book information and to examine them
        Scanner scanner = new Scanner(System.in);

        ArrayList<Book> bookList = new ArrayList<>();

        while (true) {
            // Loading in data
            System.out.print("Title: ");
            String bookTitle = scanner.nextLine();

            if (bookTitle.isEmpty()) {
                break;
            }

            System.out.print("Pages: ");
            int numberOfPages = Integer.parseInt(scanner.nextLine());
            System.out.print("Publication year: ");
            int publicationYear = Integer.parseInt(scanner.nextLine());

            // Storing data
            bookList.add(new Book(bookTitle, numberOfPages, publicationYear));

        }
        System.out.println("What information will be printed? ");
        String input = scanner.nextLine();

        for (Book book: bookList) {
            if (input.equals("everything")) {
                System.out.println(book);
            } else if (input.equals("name")) {
                System.out.println(book.getBookTitle());
            }
        }
    }
}
