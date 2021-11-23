import java.text.DateFormat;
import java.util.Date;

public class Zivotinja {
    protected String imeZivotinje;
   protected String boja;
    protected double tezina;
    protected Date datumRodjenja;

    public Zivotinja() {

    }

    public Zivotinja(String imeZivotinje, String boja, double tezina, Date datumRodjenja) {
        this.imeZivotinje = imeZivotinje;
        this.boja = boja;
        this.tezina = tezina;
        this.datumRodjenja = datumRodjenja;

    }

    public String getImeZivotinje() {
        return this.imeZivotinje;
    }

    public double getTezina() {
        return this.tezina;
    }

    public void setImeZivotinje(String imeZivotinje) {
        this.imeZivotinje = imeZivotinje;
    }

    public void eat() {
        System.out.println("Zivotinja jede!");
    }

    public static class Pas extends Zivotinja {

        private String rasa;

        public Pas() {

        }

        public void bark() {
            //pas laje
        }
    }
}
