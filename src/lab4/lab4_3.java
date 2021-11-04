package lab4;
import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class lab4_3 {

    public static void main(String[] args){
        System.out.println(policz("src\\lab4\\plik.txt", "ab"));
    }

    public static int policz(String nazwaPliku, String subString){
        int licz = 0;
        try {
        File plik = new File(nazwaPliku);
        Scanner readFile = new Scanner(plik);
            while (readFile.hasNextLine()) {
                String tekst = readFile.nextLine();
                licz += lab4_1.countSubStr(tekst, subString);
            }
            readFile.close();
        }
        catch (FileNotFoundException ex){
            System.out.println("Nie znaleziono pliku");
        }
        return licz;
    }
}
