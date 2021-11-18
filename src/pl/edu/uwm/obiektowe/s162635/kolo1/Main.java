package pl.edu.uwm.obiektowe.s162635.kolo1;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args){
        Osoba osoba1 = new Osoba("Test", "Jeden", "2000-01-01");
        Osoba osoba2 = new Osoba("Test", "Dwa", "1000-12-31");
        ArrayList<Osoba> listaOsob = new ArrayList<Osoba>();
        listaOsob.add(osoba1);
        listaOsob.add(osoba2);

        Pracownik pracownik1 = new Pracownik(osoba1, "jakies", 1000.01);
        Pracownik pracownik2 = new Pracownik(osoba2, "jakies inne", 2000.12);
        ArrayList<Pracownik> listaPracownikow = new ArrayList<Pracownik>();
        listaPracownikow.add(pracownik1);
        listaPracownikow.add(pracownik2);

        for (Osoba x: listaOsob) System.out.println(x);
        System.out.println();
        for (Pracownik x: listaPracownikow) System.out.println(x);

        double suma = 0;
        for (Pracownik x: listaPracownikow) suma += x.pensja;
        System.out.printf("%.2f", suma);

    }
}
