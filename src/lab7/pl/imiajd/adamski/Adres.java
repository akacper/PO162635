package lab7.pl.imiajd.adamski;

public class Adres {
    private String ulica;
    private String numer_domu;
    private String numer_mieszkania;
    private String miasto;
    private String kod_pocztowy;

    public Adres(String ulica, String numer_domu, String miasto, String kod_pocztowy){
        this.ulica = ulica;
        this.numer_domu = numer_domu;
        this.miasto = miasto;
        this.kod_pocztowy = kod_pocztowy;
        this.numer_mieszkania = "";
    }

    public Adres(String ulica, String numer_domu, String numer_mieszkania, String miasto, String kod_pocztowy){
        this.ulica = ulica;
        this.numer_domu = numer_domu;
        this.numer_mieszkania = numer_mieszkania;
        this.miasto = miasto;
        this.kod_pocztowy = kod_pocztowy;
    }

    public String pokaz(){
//        if (this.numer_mieszkania.isEmpty())
//            return this.kod_pocztowy + " " + this.miasto + "\n" + this.ulica + " " + this.numer_domu;
        return this.kod_pocztowy + " " + this.miasto + "\n" + this.ulica + " " + this.numer_domu + " " + this.numer_mieszkania;
    }

    public boolean isPrzed(Adres a){
        return (Integer.valueOf(this.kod_pocztowy.replace("-", ""))
                < Integer.valueOf(a.kod_pocztowy.replace("-", "")));
    }
}

class TestAdres {
    public static void main(String[] args){
        Adres adres1 = new Adres("Ulica", "1A", "Olsztyn", "12-123");
        Adres adres2 = new Adres("Ulica", "2A", "Olsztyn", "12-124");
        System.out.println(adres1.pokaz());
        System.out.println(adres1.isPrzed(adres2));
    }
}
