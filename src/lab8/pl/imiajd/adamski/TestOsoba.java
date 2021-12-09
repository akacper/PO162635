package lab8.pl.imiajd.adamski;

public class TestOsoba
{
    public static void main(String[] args)
    {
        Osoba[] ludzie = new Osoba[2];

        ludzie[0] = new Pracownik("Jan Janek", "Kowalski", "1980-01-01", false, 50000, "2010-01-01");
        ludzie[1] = new Student("Małgorzata Anna","Nowak", "2000-01-01", true, "informatyka", 4.0);
        // ludzie[2] = new Osoba("Dyl Sowizdrzał");
        for (Osoba p : ludzie) {
            System.out.println(p.getImiona() + " " + p.getNazwisko() + " " +
                    p.getDataUrodzenia()+" " + p.getPlec() + ": " + p.getOpis());
        }
    }
}


