import java.util.*;

public class Pr31{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        LinkedList<String> playlist = new LinkedList<>();

        System.out.print("Enter number of songs to add: ");
        int n = sc.nextInt();
        sc.nextLine();

        for (int i = 0; i < n; i++) {
            System.out.print("Enter song " + (i + 1) + ": ");
            String song = sc.nextLine();
            playlist.add(song);
        }

        System.out.println("\nFull Playlist:");
        display(playlist);

        if (!playlist.isEmpty()) {
            String firstSong = playlist.removeFirst();
            System.out.println("\nPlaying (removed from front): " + firstSong);
            System.out.println("Playlist after playing first song:");
            display(playlist);
        }

        if (!playlist.isEmpty()) {
            String lastSong = playlist.removeLast();
            System.out.println("\nSkipped (removed from end): " + lastSong);
            System.out.println("Playlist after skipping last song:");
            display(playlist);
        }

        sc.close();
    }

    public static void display(LinkedList<String> playlist) {
        if (playlist.isEmpty()) {
            System.out.println("Playlist is empty");
        } else {
            for (String song : playlist) {
                System.out.println(song);
            }
        }
    }
}
