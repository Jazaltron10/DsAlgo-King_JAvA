package DA_UNIT.Week_5;

public class Doctor extends Human {
    private String medicalField;
    private String employer;
    private String qualification;
    private Boolean residency;
    private int YearsOfExperience;

    Doctor() {
        System.out.println("I am a Doctor");
    }

    Doctor(String name, int age, String medicalField, String employer, String qualification, Boolean residency,
            int YearsOfExperience) {
        super(name, age);
        this.medicalField = medicalField;
        this.employer = employer;
        this.qualification = qualification;
        this.residency = residency;
        this.YearsOfExperience = YearsOfExperience;
    }

    void getInfo() {
        System.out.println("\nName:-> " + name + "\nAge:-> " + age + "\nMedical Field:-> " + medicalField
                + "\nEmployer:-> " + employer + "\nQualification:->" + qualification + "\nResidency :-> " + residency
                + "\n Years Of Experience:-> " + YearsOfExperience + "\n");
    }

    void setFeatures(String name, int age, double height, int weight, 
    
    String medicalField, String employer,
            String qualification, Boolean residency, int YearsOfExperience) {
        super.setFeatures(name, age, height, weight);
        this.medicalField = medicalField;
        this.employer = employer;
        this.qualification = qualification;
        this.residency = residency;
        this.YearsOfExperience = YearsOfExperience;
    }
}
