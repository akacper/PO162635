package lab4;
import java.math.BigInteger;

public class lab4_4 {

    public static void main(String[] args){
        System.out.println(policz(2));
    }

    public static String policz(int n){
        BigInteger razem = new BigInteger("0");
        BigInteger plus = new BigInteger("1");
        BigInteger pomnoz = new BigInteger("2");
        for (int i = 0; i < n*n; i++){
            razem = razem.add(plus);
            plus = plus.multiply(pomnoz);
        }
        return razem.toString();
    }
}
