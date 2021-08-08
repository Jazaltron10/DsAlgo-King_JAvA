package DA_UNIT.Week_5;

public class Doctor extends Person {
    private String medicalField;
    private String employer;
    private String qualification;
    private Boolean residency;
    // private int YearsOfExperience;

    // The 1st Constructor
    public Doctor(String name) {
        super(name);
        System.out.println("\nMy name is "+ name +" and I am a Medical Doctor");
    }
    // The 2nd Constructor
    public Doctor(){
        // this is me using the this keyword in a constructor
        //This constructor just uses the this keyword to call the 3rd constructor
        // and if an object is created with this constructor it will have the default data below
        this("female","Mary Doe", 25, "Neurology", "Clinic", "GRE, MCAT, and DC", true, 5);
    }
    
    // The 3rd Constructor
    public Doctor(String gender, String name, int age, String medicalField, String employer, String qualification,
            Boolean residency, int YearsOfExperience) {
        super(name, age);
        super.gender = gender;// protected variable from superclass
        super.YearsOfExperience = YearsOfExperience;
        this.medicalField = medicalField;
        this.employer = employer;
        this.qualification = qualification;
        this.residency = residency;
        // calling a method that prints out a brief bio for any doctor object created
        // with this constructor
        this.Bio();
    }
    // The Bio Method
    public void Bio() {
        this.gender = this.gender.toUpperCase();
        if (this.gender.equals("FEMALE")) {
            System.out.println("\nDr " + name + " is one of the top medical doctors in the country, specializing in the field of " + medicalField+ "\nDr " + name + " has over " + YearsOfExperience + " years of experience in this field and has won several awards as well as met and exceeded several qualifications including "+ qualification + "\nDr " + name + " is " + age + " years old with no plans on retiring anytime soon. The " + employer + " She works for are eager to extend Dr " + name + "'s contract for the for seeable future" + "\nShe has participated and contributed to a lot of groundbreaking research in the field of "
            + medicalField + "\nHer medical Journals have literally formed the foundation for a lot of amazing discoveries in the last "+ (YearsOfExperience - 3) + " years");
        } else {
            System.out.println("\nDr " + name + " is one of the top medical doctors in the country, specializing in the field of " + medicalField + 
            "\nDr " + name + " has over " + YearsOfExperience + " years of experience in this field and has won several awards as well as met and exceeded several qualifications including " + qualification + "\nDr " + name + " is " + age + " years old with no plans on retiring anytime soon. The " + employer + " he works for are eager to extend Dr " + name + "'s contract for the for seeable future" + 
            "\nHe has participated and contributed to a lot of groundbreaking research in the field of " + medicalField);
        }
    }
    //A getter method that displays the general infor of a Doctor 
    public void getinfo() {
        System.out.println("\nThis is the Company Info For Doctor "+ name + "\nName:-> " + name + "\nAge:-> " + age+ "\nMedical Field:-> " + medicalField + "\nEmployer:-> " + employer + "\nQualification:->"+ qualification + "\nResidency :-> " + residency + "\nYears Of Experience:-> " + YearsOfExperience + "\n");
    }

    public void giveDiagnosis() {
        System.out.println("\nBased on all the test carried out i am glad to tell you that you are 100% healed");
    }

    // This is a Setter Method for changing the variables of any of the objects since they are private
    public void setFeatures(String newGender, String newname, int newage, String newmedicalField, String newemployer, String newqualification, Boolean newresidency, int newYearsOfExperience) {
        super.setFeatures(name, age);
        super.gender = newGender;
        super.YearsOfExperience = newYearsOfExperience;
        this.medicalField = newmedicalField;
        this.employer = newemployer;
        this.qualification = newqualification;
        this.residency = newresidency;
    }
    // public static void main(String[] args) {}
}
