package lab9.imiajd.adamski;

import java.time.LocalDate;


public class Osoba implements Cloneable, Comparable<Osoba> {
    private String nazwisko;
    private LocalDate dataUrodzenia;

    public Osoba(String nazwisko, String dataUrodzenia){
        this.nazwisko = nazwisko;
        this.dataUrodzenia = LocalDate.parse(dataUrodzenia);
    }

    @Override
    public String toString(){
        return Osoba.class.getSimpleName() + " [" + nazwisko + ", " + dataUrodzenia.toString() + "]";
    }

    public boolean equals(Osoba o){
        return this.nazwisko.equals(o.nazwisko) && this.dataUrodzenia.equals(o.dataUrodzenia);
    }

    @Override
    public int compareTo(Osoba o){
        if (this.nazwisko.equals(o.nazwisko))
            return this.dataUrodzenia.compareTo(o.dataUrodzenia);
        return this.nazwisko.compareTo(o.nazwisko);
    }

}
