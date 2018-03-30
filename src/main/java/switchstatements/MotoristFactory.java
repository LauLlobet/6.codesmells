package switchstatements;


import java.time.LocalDate;

public class MotoristFactory {
    public static Motorist createMotorist(int pointsOnLicense, LocalDate birthDate){
        Age age = new Age(birthDate);
        if (pointsOnLicense > 3 || age.getAgeFromNow() < 25)
        {
            return new HighRiskMotorist(age,pointsOnLicense);
        }
        if (pointsOnLicense > 0)
        {
            return new ModerateRiskMotorist(age,pointsOnLicense);
        }
        return new LowRiskMotorist(age,pointsOnLicense);
    }
}
