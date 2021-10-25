package lab3;

import java.util.Scanner;

public class lab3_3 {
    public static void main(String[] args) {
        Scanner Obj = new Scanner(System.in);

        System.out.print("m = ");
        int m = Obj.nextInt();

        System.out.print("n = ");
        int n = Obj.nextInt();

        System.out.print("k = ");
        int k = Obj.nextInt();

        if (m > 10 || m < 1 || n > 10 || n < 1 || k > 10 || k < 1) {
            System.out.println("1 <= m, n, k <= 10");
            return;
        }

        int[][] a = new int[m][n];
        generujMacierz(a, m, n, -10, 10);
        wyswietlMacierz(a);

        int[][] b = new int[n][k];
        generujMacierz(b, n, k, -10, 10);
        wyswietlMacierz(b);

        int[][] c = new int[m][k]; // iloczyn ma wierszy tyle co A, a kolumn tyle co B
        iloczynMacierzy(a, b, c);
        wyswietlMacierz(c);

    }

    public static void generujMacierz(int[][] tab, int m, int n, int min, int max){
        for (int i = 0; i < m; i++){
            for (int j = 0; j < n; j++) {
                tab[i][j] = (int)(Math.random() * (max - min) + min);
            }
        }
    }

    public static void wyswietlMacierz(int[][] tab){
        int kol = tab[0].length;
        for (int i = 0; i < tab.length; i++){
            for (int j = 0; j < kol; j++) {
                System.out.print(tab[i][j] + " ");
                if (j == kol-1) System.out.println();
            }
        }
        System.out.println();
    }

    public static void iloczynMacierzy(int[][] ma, int[][] mb, int[][] mc) {
        int wierszeA = ma.length;
        int kolumnyA = ma[0].length;
        int kolumnyB = mb[0].length;

//  W tym konkretnym zadaniu ponizszy if jest zbedny, poniewaz ten warunek jest zawsze spelniony
//        if (kolumnyA != mb.length) {
//            System.out.println("Macierz A musi miec tyle samo kolumn co macierz B wierszy");
//            return;
//        }

        for (int i = 0; i < wierszeA; i++){
            for (int j = 0; j < kolumnyB; j++) {
                int temp = 0;
                for (int k = 0; k < kolumnyA; k++){
                    temp += ma[i][k] * mb[k][j];
                }
                mc[i][j] = temp;
            }
        }
    }
}
