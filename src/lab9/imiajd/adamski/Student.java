package lab9.imiajd.adamski;

public class Student extends Osoba {

    private double sredniaOcen;

    public Student(String nazwisko, String dataUrodzenia, double sredniaOcen) {
        super(nazwisko, dataUrodzenia);
        this.sredniaOcen = sredniaOcen;
    }

//    @Override
    public int compareTo(Student o){
        if (super.compareTo(o) == 0) {
            if (this.sredniaOcen < o.sredniaOcen) return -1;
            if (this.sredniaOcen > o.sredniaOcen) return 1;
            return 0;
        }
        return super.compareTo(o);
    }
}
