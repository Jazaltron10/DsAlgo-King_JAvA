package DA_UNIT.Week_5;

public class SoftwareEngineer extends Human {
    private String specialization;
    private String role;
    private String company;
    private String salary;
    private String level;

    // The 1st Constructor
    public SoftwareEngineer() {
        System.out.println("I am a SoftwareEngineer");
    }

    // The 2nd Constructor
    public SoftwareEngineer(String level) {
        // this is me using the this keyword in a constructor
        this("John Doe", 25, "Web", "Front-end Engineer");
        this.level = level;
    }

    // The 3rd Constructor
    public SoftwareEngineer(String name, int age, String specialization, String role) {
        // Using the Super keyword in the constructor of the subclass to call the
        // constructor of the superclass
        super(name, age);
        this.specialization = specialization;
        this.role = role;
    }

    // A Setter method used to set the state of a newly created object
    public void setFeatures(String newName, int newAge, double newHeight, int newWeight, String newSpecialization,
            String newRole, String newCompany, String newSalary, String newLevel) {
        // calling the setFeatures method of the superclass
        super.setFeatures(newName, newAge, newHeight, newWeight);
        // changing the properties of the subclass with the this keyword
        this.specialization = newSpecialization;
        this.role = newRole;
        this.company = newCompany;
        this.salary = newSalary;
        this.level = newLevel;
    }

    public void getinfo() {
        System.out.println(
                "\nName:-> " + name + "\nAge:-> " + age + "\nSpecialization:-> " + specialization + "\nRole:-> " + role
                        + "\nCompany:-> " + company + "\nSalary:-> " + salary + "\nLevel:-> " + level + "\n");
    }

    public static void main(String[] args) {
        SoftwareEngineer engineer = new SoftwareEngineer();
        engineer.introduction();
        // newName, newAge, newHeight, newWeight, newSpecialization, newRole,
        // newCompany, newSalary, newLevel
        engineer.setFeatures("jamie", 21, 1.9, 70, "web", "Front-end", "Microsoft", "$100,000", "5");
        engineer.introduction();
        engineer.getinfo();

        Human engineer_2 = new SoftwareEngineer();
        ((SoftwareEngineer) engineer_2).setFeatures("Karen", 29, 1.5, 70, "Mobile", "IOS", "Netflix", "$258,962", "K7");
        ((SoftwareEngineer) engineer_2).getinfo();
        engineer_2.introduction();

        SoftwareEngineer engineer_3 = new SoftwareEngineer("Jonathan", 72, "DevOps", "SRE");
        engineer_3.introduction();
        engineer_3.role = "kasak";
        System.out.println(engineer_3.role);
        engineer_3.getinfo();

    }
}
