// Na podstawie książki Cay Horstmann, Gary Cornell.
// "Java (TM). Podstawy." Wydanie VIII

// Program wykorzystujący zbiór typu HashSet
// w celu pokazania wszystkich słów odczytanych z System.in

import java.io.File;
import java.io.FileNotFoundException;
import java.util.*;

public class WordsInHashSetDemo
{
    public static void main(String[] args) throws FileNotFoundException {
        // Klasa HashSet implementuje interfejs Set
        Set<String> words = new HashSet<>();
        long totalTime = 0;

        // Scanner in = new Scanner(System.in);
        File plik = new File(args[0]); // args[0] -> src\\WordsInHashSetDemo\\alice30.txt
        // File plik = new File("src\\WordsInHashSetDemo\\alice30.txt");
        Scanner in = new Scanner(plik);
        while (in.hasNext()) {
            String word = in.next();
            long callTime = System.currentTimeMillis();
            words.add(word);
            callTime = System.currentTimeMillis() - callTime;
            totalTime += callTime;
        }

        Iterator<String> iter = words.iterator();
        for (int j = 1; j <= 20; ++j) {
            System.out.println(iter.next());
        }

        System.out.println(". . .");
        System.out.println(words.size() + " unikalnych słów. " + totalTime + " milisekund.");
    }
}

