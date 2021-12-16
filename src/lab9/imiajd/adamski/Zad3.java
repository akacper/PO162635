package lab9.imiajd.adamski;
import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class Zad3 {
    public static void main(String[] args) {
        ArrayList<String> zad3 = new ArrayList<>();
        try {
            // argument args[0] w konfiguracji to ścieżka do pliku test3.txt
            File plik = new File(args[0]);
            Scanner skan = new Scanner(plik);
            while (skan.hasNextLine())
                zad3.add(skan.nextLine());
            skan.close();
        } catch (FileNotFoundException e) {
            System.out.println("nie znaleziono pliku");
            e.printStackTrace();
        }
        System.out.println(zad3);
        Collections.sort(zad3);
        System.out.println(zad3);
    }
}

