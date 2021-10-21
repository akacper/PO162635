import java.util.Scanner;

public class lab2_2_3 {
    public static void main(String[] args){
        Scanner Obj = new Scanner(System.in);
        System.out.print("n = ");
        int n = Obj.nextInt();
        int sumadod = 0, sumauj = 0, sumazer = 0;
        for (int i = 0; i < n; i++){
            System.out.print("Podaj element " + (i+1) + ": ");
            double next = Obj.nextDouble();
            if (next > 0) sumadod += 1;
            else if (next < 0) sumauj += 1;
            else sumazer += 1;
        }
            System.out.println("Dodatnich: " + sumadod + " Ujemnych: " + sumauj + " Zera: " + sumazer);
    }
}
