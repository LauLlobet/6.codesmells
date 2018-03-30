package switchstatements;

import java.time.LocalDate;

public class Age {

    private LocalDate dateOfBirth;

    Age(LocalDate birthDate) {
        dateOfBirth = birthDate;
    }

    public int getAgeFromNow() {
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
