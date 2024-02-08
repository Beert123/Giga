import java.time.LocalTime;

public class Parkeringsplads {
    private int nummer;
    private LocalTime ankomst;

    public Parkeringsplads(int nummer, LocalTime ankomst) {
        this.nummer = nummer;
        this.ankomst = ankomst;
    }
}
