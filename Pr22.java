import java.util.Scanner;

class BookNotAvailableException extends Exception {
    public BookNotAvailableException(String message) {
        super(message);
    }
}

class Library {
    int availableBooks;

    Library(int availableBooks) {
        this.availableBooks = availableBooks;
    }

    void issueBook(int count) throws BookNotAvailableException {
        if (count <= availableBooks) {
            availableBooks -= count;
            System.out.println("Book issued successfully");
        } else {
            throw new BookNotAvailableException("Requested books not available");
        }
    }
}

public class Pr22 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Library lib = new Library(3);

        try {
            int first = sc.nextInt();
            lib.issueBook(first);

            int second = sc.nextInt();
            lib.issueBook(second);

        } catch (BookNotAvailableException e) {
            System.out.println(e.getMessage());
        } finally {
            System.out.println("Transaction completed");
        }

        sc.close();
    }
}
/* output:
Enter number of books to issue (1st time): 2
Book issued successfully
Enter number of books to issue (2nd time): 2
Exception: Requested books not available
Transaction completed
  */
