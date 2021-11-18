package pl.edu.uwm.obiektowe.s162635.kolo1;

import java.time.LocalDate;
import java.time.Period;

public class Osoba {
    private String imie;
    private String nazwisko;
    private LocalDate dataUrodzenia;
    private int wiek;

    public Osoba(String imie, String nazwisko, String dataUrodzenia){
        this.imie = imie;
        this.nazwisko = nazwisko;
        setDataUrodzenia(dataUrodzenia);
//        LocalDate tempData = LocalDate.parse(dataUrodzenia);
//        if (tempData.isAfter(LocalDate.now()))
//            throw new IllegalArgumentException("Osoba nie moze byc z przyszlosci.");
//        this.dataUrodzenia = tempData;
        this.wiek = obliczWiek(this.dataUrodzenia);

    }
    public String getImie(){
        return imie;
    }
    public String getNazwisko() {
        return nazwisko;
    }

    public LocalDate getDataUrodzenia() {
        return dataUrodzenia;
    }

    public int obliczWiek(LocalDate dataUr){
        return Period.between(dataUr, LocalDate.now()).getYears();
    }

    public void setDataUrodzenia(String dataUr){
        LocalDate tempData = LocalDate.parse(dataUr);
        if (tempData.isAfter(LocalDate.now()))
            throw new IllegalArgumentException("Osoba nie moze byc z przyszlosci.");
        this.dataUrodzenia = tempData;
        this.wiek = obliczWiek(dataUrodzenia);
    }

    public int getWiek(){
        this.wiek = obliczWiek(dataUrodzenia);
        return wiek;
    }

    public String toString(){
        return "Osoba: "+imie +" " + nazwisko+" data urodzenia: "+dataUrodzenia+" wiek: "+wiek;
    }

}
