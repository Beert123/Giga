import java.util.ArrayList;

public class Parkeringshus {
    private String addresse;
    private ArrayList<Parkeringsplads> parkeringspladser;
    public Parkeringshus(String addresse) {
        this.addresse = addresse;
        this.parkeringspladser = new ArrayList<Parkeringsplads>();
    }
    public Parkeringsplads createParkeringsplads(int nummer) {
        Parkeringsplads parkeringsplads = new Parkeringsplads(nummer, null);
        parkeringspladser.add(parkeringsplads);
        return parkeringsplads;
    }

}