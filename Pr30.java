import java.util.*;

public class Pr30{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.println("Enter a sentence:");
        String input = sc.nextLine();
        
        String[] words = input.split("\\s+");
        
        HashMap<String, Integer> map = new HashMap<>();
        
        for (String word : words) {
            if (map.containsKey(word)) {
                map.put(word, map.get(word) + 1);
            } else {
                map.put(word, 1);
            }
        }
        
        System.out.println("Output:");
        for (Map.Entry<String, Integer> entry : map.entrySet()) {
            System.out.println(entry.getKey() + " -> " + entry.getValue());
        }
        
        sc.close();
    }
}
