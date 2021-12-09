package lab8.pl.imiajd.adamski;

import java.time.LocalDate;

public abstract class Instrument {
    private String producent;
    private LocalDate rokProdukcji;

    public Instrument(String producent, String rokProdukcji) {
        this.producent = producent;
        this.rokProdukcji = LocalDate.parse(rokProdukcji);
    }

    public String getProducent() {
        return this.producent;
    }

    public int getRokProdukcji() {
        return this.rokProdukcji.getYear();
    }

    public abstract String dzwiek();

    @Override
    public String toString() {
        return this.getClass().getSimpleName() + ", producent: " + this.getProducent() +
                ", rok produkcji: " + this.getRokProdukcji();
    }
}
