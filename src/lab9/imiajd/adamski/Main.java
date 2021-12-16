package lab9.imiajd.adamski;

import java.util.ArrayList;

class Main {
    public static void main(String[] args) {
        ArrayList<Osoba> grupa = new ArrayList<>();

        Osoba o1 = new Osoba("Kowal", "2011-01-01");
        Osoba o2 = new Osoba("Kowal", "2009-01-01");
        Osoba o3 = new Osoba("Kowal", "2012-01-01");
        Osoba o4 = new Osoba("Kowalski", "2012-01-01");
        Osoba o5 = new Osoba("Adamski", "2001-01-01");
        grupa.add(o1);
        grupa.add(o2);
        grupa.add(o3);
        grupa.add(o4);
        grupa.add(o5);

        for (Osoba i : grupa) System.out.println(i);
        System.out.println(o1.equals(o2));
        System.out.println(o1.compareTo(o2));
        System.out.println(o3.compareTo(o4));

        Student s1 = new Student("Kowal", "2000-01-01", 2.0);
        Student s2 = new Student("Kowal", "2000-01-01", 3.0);
        System.out.println(s1.compareTo(s2));
    }
}
