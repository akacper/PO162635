package lab8.pl.imiajd.adamski;

import java.time.LocalDate;

class Pracownik extends Osoba
{
    private double pobory;
    private LocalDate dataZatrudnienia;

    public Pracownik(String imiona, String nazwisko, String dataUrodzenia,
                     boolean plec, double pobory, String dataZatrudnienia)
    {
        super(imiona, nazwisko, dataUrodzenia, plec);
        this.pobory = pobory;
        this.dataZatrudnienia = LocalDate.parse(dataZatrudnienia);
    }

    public double getPobory()
    {
        return pobory;
    }

    public String getDataZatrudnienia(){
        return dataZatrudnienia.toString();
    }

    public String getOpis()
    {
        return String.format("pracownik z pensją %.2f zł", pobory) +
                " zatrudniono " + dataZatrudnienia.toString();
    }

}
