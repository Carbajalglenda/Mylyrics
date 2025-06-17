import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Mylyrics {
    public static void main(String[] args) {
        List<String> lyrics = new ArrayList<>();
        lyrics.add("Nikes on my feet make my cypher complete");
        lyrics.add("Yeah okay you gotta jump in to swim");
        lyrics.add("I switched the time zone but what do i know");
        lyrics.add("The sun dont shine when i'm alone");

        Scanner scanner = new Scanner(System.in);
        System.out.print(" Enter your Mac Miller lyric here: ");
        String query = scanner.nextLine().toLowerCase();

        System.out.println("Matching lyric lines:");
        boolean found = false;
        for (String line : lyrics) {
            if (line.toLowerCase().contains(query)) {
                System.out.println("- " + line);
                found = true;
            }
        }
        if (!found) {
            System.out.println("No Mac Miller lyrics found.");
        }
        scanner.close();
    }
}

