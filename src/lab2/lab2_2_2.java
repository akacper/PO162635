package lab2;

import java.util.Scanner;

public class lab2_2_2 {
    public static void main(String[] args){
        Scanner Obj = new Scanner(System.in);
        System.out.print("n = ");
        int n = Obj.nextInt();
        double suma = 0;
        for (int i = 0; i < n; i++){
            System.out.print("Podaj element " + (i+1) + ": ");
            double next = Obj.nextDouble();
            if (next > 0){
                suma += next;
            }
        }
            System.out.print(2*suma);
    }
}
