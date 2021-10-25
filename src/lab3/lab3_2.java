package lab3;

import java.util.Scanner;

public class lab3_2 {
    public static void main(String[] args) {
        Scanner Obj = new Scanner(System.in);
        System.out.print("n = ");
        int n = Obj.nextInt();
        if (n > 100 || n < 1) {
            System.out.println("1 <= n <= 100");
            return;
        }
        int[] lista = new int[n];

        generuj(lista, n, -999, 999);
        wypisz(lista);
        // a
        System.out.println("Parzystych: " + ileParzystych(lista));
        System.out.println("Nieparzystych: " + ileNieparzystych(lista));
        // b
        System.out.println("Dodatnich: " + ileDodatnich(lista));
        System.out.println("Ujemnych: " + ileUjemnych(lista));
        System.out.println("Zerowych: " + ileZerowych(lista));
        // c
        System.out.println("Maksymalnych: " + ileMaksymalnych(lista));
        // d
        System.out.println("Suma dodatnich: " + sumaDodatnich(lista));
        System.out.println("Suma ujemnych: " + sumaUjemnych(lista));
        // e
        System.out.println("Dlugosc maksymalnego ciagu dodatnich: " + dlugoscMaksymalnegoCiaguDodatnich(lista));
        // f
        signum(lista);
        // g (aby dzialalo z podanymi argumentami nalezy wygenerowac tablice co najmniej 6-elementowa)
        odwrocFragment(lista, 2, 5);
        odwrocFragment2(lista, 2, 5);
    }

    public static void generuj(int[] tab, int n, int min, int max){
        for (int i = 0; i < n; i++){
            tab[i] = (int)(Math.random() * (max - min) + min);
        }
    }

    public static void wypisz(int[] tab){
        for (int i = 0; i < tab.length; i++){
            System.out.print(tab[i] + " ");
        }
        System.out.println();
    }

    public static int ileParzystych(int[] tab) {
        int suma = 0;
        for (int i = 0; i < tab.length; i++){
            if (tab[i] % 2 == 0) suma++;
        }
        return suma;
    }

    public static int ileNieparzystych(int[] tab) {
        int suma = 0;
        for (int i = 0; i < tab.length; i++){
            if (tab[i] % 2 != 0) suma++;
        }
        return suma;
    }

    public static int ileDodatnich(int[] tab) {
        int suma = 0;
        for (int i = 0; i < tab.length; i++){
            if (tab[i] > 0) suma++;
        }
        return suma;
    }

    public static int ileUjemnych(int[] tab) {
        int suma = 0;
        for (int i = 0; i < tab.length; i++){
            if (tab[i] < 0) suma++;
        }
        return suma;
    }

    public static int ileZerowych(int[] tab) {
        int suma = 0;
        for (int i = 0; i < tab.length; i++){
            if (tab[i] == 0) suma++;
        }
        return suma;
    }

    public static int ileMaksymalnych(int[] tab) {
        int suma = 1;
        int max = tab[0];
        for (int i = 1; i < tab.length; i++){
            if (tab[i] > max) {
                max = tab[i];
                suma = 1;
            }
            else if (max == tab[i]) suma++;
        }
        return suma;
    }

    public static int sumaDodatnich(int[] tab) {
        int suma = 0;
        for (int i = 0; i < tab.length; i++){
            if (tab[i] > 0) suma += tab[i];
        }
        return suma;
    }

    public static int sumaUjemnych(int[] tab) {
        int suma = 0;
        for (int i = 0; i < tab.length; i++){
            if (tab[i] < 0) suma += tab[i];
        }
        return suma;
    }

    public static int dlugoscMaksymalnegoCiaguDodatnich(int[] tab) {
        int dlugosc = 0;
        int najdluzsza = 0;
        for (int i = 0; i < tab.length; i++){
            if (tab[i] > 0) {
                dlugosc++;
                if (dlugosc > najdluzsza) najdluzsza = dlugosc;
            }
            else if (tab[i] <= 0) dlugosc = 0;
        }
        return najdluzsza;
    }

    public static void signum(int[] tab) {
        int[] newtab = new int[tab.length];
        for (int i = 0; i < tab.length; i++){
            if (tab[i] > 0) newtab[i] = 1;
            else if (tab[i] < 0) newtab[i] = -1;
            else newtab[i] = 0;
        }
        wypisz(newtab);
    }

    public static void odwrocFragment(int[] tab, int lewy, int prawy) {
        if (lewy >= tab.length || lewy < 1 || prawy >= tab.length || prawy < 1) return;
        int[] newtab = new int [tab.length];
        int odw = 0;
        for (int i = 0; i < tab.length; i++){
            if (i >= lewy && i <= prawy){
                int temp = tab[prawy - odw];
                newtab[i] = tab[prawy - odw];
                newtab[lewy + odw] = temp;
                odw++;
                }
            else newtab[i] = tab[i];

        }
        wypisz(newtab);
    }

    // drugie rozwiazanie uzywajac tab.clone()
    public static void odwrocFragment2(int[] tab, int lewy, int prawy) {
        if (lewy >= tab.length || lewy < 1 || prawy >= tab.length || prawy < 1) return;
        int[] newtab = tab.clone();
        int iter = 0;
        for (int i = lewy; i < prawy; i++){
            if (iter >= prawy/2) break;
            int temp = newtab[lewy+iter];
            newtab[lewy+iter] = newtab[prawy-iter];
            newtab[prawy-iter] = temp;
            iter++;
        }
        wypisz(newtab);
    }
}
