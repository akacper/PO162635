package lab8.pl.imiajd.adamski;

import java.time.LocalDate;
import java.util.Arrays;

abstract class Osoba
{
    private String[] imiona;
    private String nazwisko;
    private LocalDate dataUrodzenia;
    private boolean plec;

    public Osoba(String imiona, String nazwisko, String dataUrodzenia, boolean plec) {
        this.imiona = imiona.split(" ");
        this.nazwisko = nazwisko;
        this.dataUrodzenia = LocalDate.parse(dataUrodzenia);
        this.plec = plec;
    }

    public abstract String getOpis();

    public String getNazwisko()
    {
        return nazwisko;
    }

    public String getImiona(){
        return Arrays.toString(imiona);
    }

    public String getDataUrodzenia(){
        return dataUrodzenia.toString();
    }

    public String getPlec(){
        if (plec) return "kobieta";
        return "mezczyzna";
    }

}
