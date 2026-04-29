import java.util.LinkedList;
import java.util.Scanner;

public class Pr32 {

    public static <T> boolean searchElement(LinkedList<T> list, T element) {
        return list.contains(element);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Integer LinkedList (Roll Numbers)
        LinkedList<Integer> rollNumbers = new LinkedList<>();
        System.out.println("Enter number of roll numbers:");
        int n = sc.nextInt();

        System.out.println("Enter roll numbers:");
        for (int i = 0; i < n; i++) {
            rollNumbers.add(sc.nextInt());
        }

        System.out.println("Enter roll number to search:");
        int rollSearch = sc.nextInt();

        if (searchElement(rollNumbers, rollSearch)) {
            System.out.println("Roll number found");
        } else {
            System.out.println("Roll number not found");
        }

        // String LinkedList (Names)
        LinkedList<String> names = new LinkedList<>();
        System.out.println("Enter number of names:");
        int m = sc.nextInt();
        sc.nextLine();

        System.out.println("Enter names:");
        for (int i = 0; i < m; i++) {
            names.add(sc.nextLine());
        }

        System.out.println("Enter name to search:");
        String nameSearch = sc.nextLine();

        if (searchElement(names, nameSearch)) {
            System.out.println("Name found");
        } else {
            System.out.println("Name not found");
        }

        sc.close();
    }            
}
