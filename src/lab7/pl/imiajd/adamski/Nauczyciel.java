package lab7.pl.imiajd.adamski;

class Nauczyciel extends Osoba {
    double pensja;

    public Nauczyciel(Osoba osoba, double pensja){
        super(osoba.getNazwisko(), osoba.getRok_urodzenia());
        this.pensja = pensja;
    }

    public double getPensja(){
        return pensja;
    }

    @Override
    public String toString(){
        return getNazwisko() + " " + getRok_urodzenia() + " " + pensja;
    }
}
