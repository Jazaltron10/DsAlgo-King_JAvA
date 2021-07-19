package DA_UNIT.Week_5;

public class SoftwareEngineer extends Human {
    private String specialization;
    private String role;
    private String company;
    private String salary;
    private String level;

    // The 1st Constructor
    public SoftwareEngineer(String name) {
        super(name);
        System.out.println("\nMy name is "+ name +" and I am a SoftwareEngineer");
    }

    // The 2nd Constructor
    public SoftwareEngineer(){
        // this is me using the this keyword in a constructor
        //This constructor just uses the this keyword to call the 3rd constructor
        // and if an object is created with this constructor it will have the default data below
        this("John Doe", 25, "Web", "Front-End Engineer", "IBM", "$100,000", "L5");
    }

    // The 3rd Constructor
    public SoftwareEngineer(String name, int age, String specialization, String role, String company, String salary, String level) {
        // Using the Super keyword in the constructor of the subclass to call the
        // constructor of the superclass
        super(name, age);
        this.specialization = specialization;
        this.role = role;
        this.company = company;
        this.salary = salary;
        this.level = level;
    }

    // A Setter method used to set the state of a newly created object
    public void setFeatures(String newName, int newAge, String newSpecialization,
            String newRole, String newCompany, String newSalary, String newLevel) {
        // calling the setFeatures method of the superclass
        super.setFeatures(newName, newAge);
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
    public void getinfos(){
        super.getinfo();
}

}
