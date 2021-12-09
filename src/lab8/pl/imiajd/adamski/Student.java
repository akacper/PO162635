package lab8.pl.imiajd.adamski;

class Student extends Osoba
{
    private String kierunek;
    private double sredniaOcen;

    public Student(String imiona, String nazwisko, String dataUrodzenia,
                   boolean plec, String kierunek, double sredniaOcen)
    {
        super(imiona, nazwisko, dataUrodzenia, plec);
        this.kierunek = kierunek;
        this.sredniaOcen = sredniaOcen;
    }

    public String getOpis()
    {
        return "kierunek studiów: " + kierunek + ", srednia: " + sredniaOcen;
    }

    public double getSredniaOcen(){
        return sredniaOcen;
    }

    public void setSredniaOcen(double newSredniaOcen){
        this.sredniaOcen = newSredniaOcen;
    }

}
