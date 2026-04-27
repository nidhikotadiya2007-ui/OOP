import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Pr26 {
    public static void main(String[] args) {
        int characters = 0, words = 0, lines = 0;

        if (args.length != 1) {
            System.out.println("Usage: java FileCount <filename>");
            return;
        }

        try {
            File file = new File(args[0]);
            Scanner sc = new Scanner(file);

            while (sc.hasNextLine()) {
                String line = sc.nextLine();
                lines++;
                characters += line.length();

                String[] wordList = line.trim().split("\\s+");
                if (!line.trim().isEmpty()) {
                    words += wordList.length;
                }
            }

            sc.close();

            System.out.println("Characters: " + characters);
            System.out.println("Words: " + words);
            System.out.println("Lines: " + lines);

        } catch (FileNotFoundException e) {
            System.out.println("File not found: " + args[0]);
        }
    }
}
