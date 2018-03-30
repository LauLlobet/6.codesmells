package messagechains;

public class Country {
    private final boolean inEurope;

    Country(boolean inEurope) {
        this.inEurope = inEurope;
    }

    public boolean isInEurope() {
        return inEurope;
    }
}
