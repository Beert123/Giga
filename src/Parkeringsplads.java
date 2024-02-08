import java.time.LocalTime;

public class Parkeringsplads {
    private int nummer;
    private LocalTime ankomst;

    private Bil bil;

    public Parkeringsplads(int nummer, LocalTime ankomst) {
        this.nummer = nummer;
        this.ankomst = LocalTime.now();
    }
    public Bil getBil() {
        return bil;
    }
    public void setBil(Bil bil) {
        this.bil = bil;
    }
}
