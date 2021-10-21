import java.util.Scanner;

public class lab2_2_5 {
    public static void main(String[] args) {
        Scanner Obj = new Scanner(System.in);
        System.out.print("n = ");
        int n = Obj.nextInt();
        double[] liczby = new double[n];
        int suma = 0;
        for (int i = 0; i < n; i++) {
            System.out.print("Podaj element " + (i + 1) + ": ");
            double next = Obj.nextDouble();
            liczby[i] = next;
            if (i != 0 && liczby[i - 1] > 0 && next > 0) suma++;
            }
            System.out.println("Suma sasiadujacych par: " + suma);
        }
    }
