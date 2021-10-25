package lab2;

import java.util.Scanner;

public class lab2_1_2 {
    public static void main(String[] args){
        Scanner Obj = new Scanner(System.in);
        System.out.print("n = ");
        int n = Obj.nextInt();
        double[] lista = new double[n];
        for (int i = 0; i < n; i++){
            System.out.print("Podaj element " + (i+1) + ": ");
            double next = Obj.nextDouble();
            lista[i] = next;
        }
        for (int j = 0; j < (n-1); j++){
            System.out.print(lista[j+1] + ", ");
        }
        System.out.print(lista[0]);

        // drugi sposob
        System.out.println();

        double temp = lista[0];
        for (int j = 0; j < (n-1); j++){
            lista[j] = lista[j+1];
        }
        lista[n-1] = temp;
        for (int j = 0; j < n; j++){
            if (j != (n-1)){
                System.out.print(lista[j] + ", ");
            }
            else {
                System.out.print(lista[j]);
            }
        }
    }
}
