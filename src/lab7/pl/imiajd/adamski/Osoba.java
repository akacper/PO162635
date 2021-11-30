package lab7.pl.imiajd.adamski;

class TestOsoba{
    public static void main(String[] args){
        Osoba osoba1 = new Osoba("Test", "2000");
        System.out.println(osoba1);
        Student student1 = new Student(osoba1, "informatyka");
        System.out.println(student1);
        Osoba osoba2 = new Osoba("Test2", "1000");
        Nauczyciel nauczyciel1 = new Nauczyciel(osoba2, 1);
        System.out.println(nauczyciel1);
    }
}

class Osoba {
    private String nazwisko;
    private String rok_urodzenia;

    public Osoba(String nazwisko, String rok_urodzenia){
        this.nazwisko = nazwisko;
        this.rok_urodzenia = rok_urodzenia;
    }

    public String getNazwisko(){
        return nazwisko;
    }

    public String getRok_urodzenia(){
        return rok_urodzenia;
    }

    @Override
    public String toString(){
        return nazwisko + " " + rok_urodzenia;
    }
}
