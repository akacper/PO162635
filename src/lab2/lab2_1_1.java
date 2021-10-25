package lab2;

import java.util.Scanner;

public class lab2_1_1 {
    public static void main(String[] args){
        Scanner Obj = new Scanner(System.in);
        System.out.print("n = ");
        int n = Obj.nextInt();
        double suma = 0, suma2 = 0, suma3 = 0, suma4 = 0, pkth = 0, pkti = 0;
        double iloczyn = 1, iloczyn2 = 1;
        for (int i = 0; i < n; i++){
            System.out.print("Podaj element " + (i+1) + ": ");
            double next = Obj.nextDouble();
            suma += next; //a
            iloczyn *= next; //b
            suma2 += Math.abs(next); //c
            suma3 += Math.sqrt(Math.abs(next)); //d
            iloczyn2 *= Math.abs(next); //e
            suma4 += Math.pow(next, 2); //f

            pkth += Math.pow(-1, i) * next; //h

            int fact = 1;
            for (int j = 1; j <= (i+1); j++){
                fact *= j;
            }
            pkti += Math.pow(-1, (i+1)) * next / fact;

        }
        System.out.println("A) " + suma);
        System.out.println("B) " + iloczyn);
        System.out.println("C) " + suma2);
        System.out.println("D) " + suma3);
        System.out.println("E) " + iloczyn2);
        System.out.println("F) " + suma4);
        System.out.println("G) " + suma + " oraz " + iloczyn);
        System.out.println("H) " + pkth);
        System.out.println("I) " + pkti);
    }
}
