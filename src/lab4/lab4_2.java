package lab4;
import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class lab4_2 {

    public static void main(String[] args){
        System.out.println(policz("src\\lab4\\plik.txt", 'a'));
    }

    public static int policz(String nazwaPliku, char znak){
        int licz = 0;
        try {
        File plik = new File(nazwaPliku);
        Scanner readFile = new Scanner(plik);
            while (readFile.hasNextLine()) {
                String tekst = readFile.nextLine();
                licz += lab4_1.countChar(tekst, znak);
            }
            readFile.close();
        }
        catch (FileNotFoundException ex){
            System.out.println("Nie znaleziono pliku");
        }
        return licz;
    }
}
