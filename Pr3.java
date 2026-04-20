import java.util.*;

public class Pr3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a single letter: ");
        char ch = sc.next().charAt(0);

        
        ch = Character.toLowerCase(ch);
 
        if (Character.isLetter(ch)) {
            if (ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u') {
                System.out.println("The character is a Vowel.");
            } else {
                System.out.println("The character is a Consonant.");
            }
        } else {
            System.out.println("Invalid input. Please enter an alphabet.");
        }
    }
}
/*output:
Enter a single letter: E
The character is a Vowel.
*/
