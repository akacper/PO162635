package lab7.pl.imiajd.adamski;

class Student extends Osoba {
    String kierunek;

    public Student(Osoba osoba, String kierunek){
        super(osoba.getNazwisko(), osoba.getRok_urodzenia());
        this.kierunek = kierunek;
    }

    public String getKierunek(){
        return kierunek;
    }

    @Override
    public String toString(){
        return getNazwisko() + " " + getRok_urodzenia() + " " + kierunek;
    }
}
