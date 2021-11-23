import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class Main {

    public static void main (String[] args) throws ParseException {
        Zivotinja.Pas bison = new Zivotinja.Pas();
        bison.setImeZivotinje("Masa");
        bison.eat();
        bison.bark();

        String datumRodjenja = "10/10/2020";
        DateFormat ff = new SimpleDateFormat("mm/dd/yyyy");
        Date datum = ff.parse(datumRodjenja);

        Macka crna = new Macka("macka", "crna", 10, datum, false);
        crna.eat();
        crna.daLiMackaImaSaru(crna.getSara());
    }


}
