import java.util.Scanner;

class TablePrinter {
    synchronized void printTable(int num) {
        for (int i = 1; i <= 10; i++) {
            System.out.println(num + " x " + i + " = " + (num * i));
            try {
                Thread.sleep(400);
            } catch (InterruptedException e) {
                System.out.println(e);
            }
        }
        System.out.println();
    }
}

class MyThread extends Thread {
    TablePrinter printer;
    int number;

    MyThread(TablePrinter printer, int number) {
        this.printer = printer;
        this.number = number;
    }

    public void run() {
        printer.printTable(number);
    }
}

public class Pr25
  {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter first number: ");
        int n1 = sc.nextInt();

        System.out.print("Enter second number: ");
        int n2 = sc.nextInt();

        TablePrinter printer = new TablePrinter();

        MyThread t1 = new MyThread(printer, n1);
        MyThread t2 = new MyThread(printer, n2);

        t1.start();
        t2.start();
    }
  }
/* output:
Enter first number: 5
Enter second number: 7

5 x 1 = 5
...
5 x 10 = 50

7 x 1 = 7
...
7 x 10 = 70
*/
