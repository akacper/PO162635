package Lab6;

import java.util.Arrays;

public class IntegerSet {
    public static void main(String[] args) {
        IntegerSet zbior1 = new IntegerSet();
        IntegerSet zbior2 = new IntegerSet();
        zbior1.insertElement(1);
        zbior2.insertElement(2);
        zbior2.insertElement(3);
        zbior2.deleteElement(3);

        System.out.println(zbior1);
        System.out.println(zbior2);

        System.out.println(union(zbior1, zbior2));
        System.out.println(intersection(zbior1, zbior2));

        zbior1.insertElement(4);
        zbior1.insertElement(5);
        IntegerSet zbior3 = new IntegerSet();
        zbior3.insertElement(1);
        zbior3.insertElement(4);
        System.out.println(intersection(zbior1, zbior3));

        System.out.println(zbior1.equals(zbior2));
        IntegerSet zbior4 = new IntegerSet();
        zbior4.insertElement(1);
        System.out.println(zbior1.equals(zbior4));
    }
    private boolean[] zbiorLiczb;

    public IntegerSet(){
        this.zbiorLiczb = new boolean[100];
    }

    public static IntegerSet union(IntegerSet a, IntegerSet b) {
        IntegerSet nowyZbior = new IntegerSet();
        for (int i=0; i<100; i++)
            if (a.zbiorLiczb[i] || b.zbiorLiczb[i])
                nowyZbior.zbiorLiczb[i] = true;
        return nowyZbior;
    }

    public static IntegerSet intersection(IntegerSet a, IntegerSet b) {
        IntegerSet nowyZbior = new IntegerSet();
        for (int i=0; i<100; i++)
            if (a.zbiorLiczb[i] && b.zbiorLiczb[i])
                nowyZbior.zbiorLiczb[i] = true;
        return nowyZbior;
    }

    public void insertElement(int a) {
        if (a < 1 || a > 100)
            throw new IllegalArgumentException();
        this.zbiorLiczb[a-1] = true;
    }

    public void deleteElement(int a) {
        if (a < 1 || a > 100)
            throw new IllegalArgumentException();
        this.zbiorLiczb[a-1] = false;
    }

    @Override
    public String toString() {
        StringBuilder temp = new StringBuilder();
        for (int i=0; i<100; i++)
            if (this.zbiorLiczb[i])
                temp.append(i+1).append(" ");

        if (temp.toString().isEmpty()) return "Lista jest pusta";
        return temp.toString();
    }

    public boolean equals(IntegerSet zbior) {
        return Arrays.equals(this.zbiorLiczb, zbior.zbiorLiczb);
    }

}
