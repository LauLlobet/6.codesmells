package switchstatements;

public class Motorist {
    private final Age age;
    private final int pointsOnLicense;

    public Motorist(Age dateOfBirth, int pointsOnLicense) {
        this.age = dateOfBirth;
        this.pointsOnLicense = pointsOnLicense;
    }

    public int pointsOnLicense() {
        return pointsOnLicense;
    }


    public double calculateInsurancePremium(double insuranceValue) throws Exception {
        throw new NotSpecificMotoristException();
    }
}
