package lab8.pl.imiajd.adamski;

public class Skrzypce extends Instrument {

    public Skrzypce(String producent, String rokProdukcji) {
        super(producent,rokProdukcji);
    }
    public String dzwiek() {
        return "skrzyp";
    }

}
