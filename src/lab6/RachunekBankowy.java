package lab6;

public class RachunekBankowy {

    public static void main(String[] args) {
        RachunekBankowy saver1 = new RachunekBankowy(2000);
        RachunekBankowy saver2 = new RachunekBankowy(3000);

        System.out.println("saldo nr1=" + saver1.getSaldo());
        RachunekBankowy.setRocznaStopaProcentowa(0.04);
        saver1.obliczMiesieczneOdsetki();
        saver2.obliczMiesieczneOdsetki();
        System.out.println("Saldo saver1 po dodaniu odsetek = " + saver1.getSaldo());
        System.out.println("Saldo saver2 po dodaniu odsetek = " + saver2.getSaldo());

        RachunekBankowy.setRocznaStopaProcentowa(0.05);
        saver1.obliczMiesieczneOdsetki();
        saver2.obliczMiesieczneOdsetki();
        System.out.println("Saldo saver1 po dodaniu odsetek = " + saver1.getSaldo());
        System.out.println("Saldo saver2 po dodaniu odsetek = " + saver2.getSaldo());
    }

    private static double rocznaStopaProcentowa;
    private double saldo;

    public RachunekBankowy(double saldo) {
        this.saldo = saldo;
    }

    public double getSaldo() {
        return saldo;
    }

    public double getRocznaStopaProcentowa() {
        return rocznaStopaProcentowa;
    }

    public static void setRocznaStopaProcentowa(double stopa) {
        RachunekBankowy.rocznaStopaProcentowa = stopa;
    }

    public void obliczMiesieczneOdsetki() {
        this.saldo += (this.saldo*rocznaStopaProcentowa)/12;
    }
}
