package lab4;
import java.math.BigDecimal;
import java.math.RoundingMode;

public class lab4_5 {

    public static void main(String[] args){
        System.out.println(policz(1000, 4, 1));
    }

    public static String policz(double kapitalPoczatkowy, double stopaProcentowa, int dlugoscOkresuOszczedzania)
    {
        BigDecimal kapital = new BigDecimal(String.valueOf(kapitalPoczatkowy));
        BigDecimal stopa = new BigDecimal(String.valueOf(stopaProcentowa));
        BigDecimal dlugosc = new BigDecimal(String.valueOf(dlugoscOkresuOszczedzania));
        BigDecimal wynik = new BigDecimal(String.valueOf(kapitalPoczatkowy));

        wynik = wynik.add(kapital.multiply(dlugosc.multiply(stopa.divide(new BigDecimal("100")))));
        wynik = wynik.setScale(2, RoundingMode.HALF_UP);
        return wynik.toString();
    }
}
