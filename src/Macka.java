import java.util.Date;

public class Macka extends Zivotinja {

    private boolean sara;

    public Macka(String imeZivotinje, String boja, double tezina, Date datumRodjenja, boolean sara) {
        super.imeZivotinje = imeZivotinje;
        super.boja = boja;
        super.datumRodjenja = datumRodjenja;
        super.tezina = tezina;
        this.sara = sara;

    }
    public boolean getSara (){
        return this.sara;
    }

    public void daLiMackaImaSaru(boolean sara) {
        if (!sara) {
            System.out.println("Macka je jednobojna!");
        } else {
            System.out.println("Macka je sarena!");
        }
    }
}
