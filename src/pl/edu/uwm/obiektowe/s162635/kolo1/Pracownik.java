package pl.edu.uwm.obiektowe.s162635.kolo1;

public class Pracownik extends Osoba {
    String stanowisko;
    double pensja;

    public Pracownik(Osoba osoba, String stanowisko, double pensja){
        super(osoba.getImie(), osoba.getNazwisko(), osoba.getDataUrodzenia().toString());
        this.stanowisko = stanowisko;
        this.pensja = pensja;
    }

    public String toString(){
        return super.toString() + " jest pracownikiem na stanowisku "
                + stanowisko + " z pensja " + String.format("%.2f", pensja);
    }
}
