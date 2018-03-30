package inappropriateintimacy;


public class Motorist {
    private final License license;
    private final String surname;
    private final String firstName;
    private final String title;

    public Motorist(License license, String surname, String firstName, String title) {
        this.license = license;
        this.surname = surname;
        this.firstName = firstName;
        this.title = title;
    }


    public String summary() {
        return title() + " " + firstName() + " " + surname() + ", " + license.points()+ " points";
    }

    private String title() {
        return title;
    }

    private String firstName() {
        return firstName;
    }

    private String surname() {
        return surname;
    }
}
