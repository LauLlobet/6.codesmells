package switchstatements;

import java.time.LocalDate;

public class Motorist {
    private final LocalDate dateOfBirth;
    private final int pointsOnLicense;

    public Motorist(LocalDate dateOfBirth, int pointsOnLicense) {
        this.dateOfBirth = dateOfBirth;
        this.pointsOnLicense = pointsOnLicense;
    }

    public int pointsOnLicense() {
        return pointsOnLicense;
    }

    public int age() {
        LocalDate now = LocalDate.now();
        int ageYr = now.getYear() - dateOfBirth.getYear();
        int ageMo = now.getMonthValue() - dateOfBirth.getMonthValue();

        return adjustYearsDownIfNegativeMonthDifference(ageYr, ageMo);
    }

    private int adjustYearsDownIfNegativeMonthDifference(int ageYr, int ageMo)
    {
        if (ageMo < 0) {
            ageYr--;
        }

        return ageYr;
    }
}
