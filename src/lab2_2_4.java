import java.util.Scanner;

public class lab2_2_4 {
    public static void main(String[] args){
        Scanner Obj = new Scanner(System.in);
        System.out.print("n = ");
        int n = Obj.nextInt();
        double najmn = 0;
        double najw = 0;
        for (int i = 0; i < n; i++){
            System.out.print("Podaj element " + (i+1) + ": ");
            double next = Obj.nextDouble();
            if (i == 0) {
                najmn = next;
                najw = next;
            }
            else if (next > najw) najw = next;
            else if (next < najmn) najmn = next;
        }
            System.out.println("Najwieksza: " + najw + " Najmniejsza: " + najmn);
    }
}
