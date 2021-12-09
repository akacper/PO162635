package lab8.pl.imiajd.adamski;

import java.util.ArrayList;

public class TestInstrumenty {
    public static void main(String[] args) {

        ArrayList<Instrument> orkiestra = new ArrayList<>();

        orkiestra.add(new Flet("Fleciernia","2011-01-01"));
        orkiestra.add(new Skrzypce("Skrzypy","1999-01-01"));
        orkiestra.add(new Skrzypce("Skrzypy","1800-01-01"));
        orkiestra.add(new Skrzypce("Skrzypy2","2000-01-01"));
        orkiestra.add(new Fortepian("Klawisze","1000-01-01"));

        for(Instrument i: orkiestra) {
                System.out.println(i.dzwiek());
                System.out.println(i);
        }
    }
}
