package DA_UNIT.Week_5;

public class SoftwareEngineer extends Human {
    private String specialization;
    private String role;
    private String company;
    private String salary;
    private String level;
    
    SoftwareEngineer(){
        System.out.println("I am a SoftwareEngineer");
    }
    SoftwareEngineer(String level){
        // this is me using the this keyword in a constructor
        this("John Doe", 25, "Web", "Front-end Engineer");
        this.level = level;
    }

    SoftwareEngineer(String name, int age, String spex, String role) {
        // Using the Super keyword in the constructor
        super(name, age);
        this.specialization = spex;
        this.role = role;
    }

    void setFeatures(String newName, int newAge, double newHeight, int newWeight,String newSpecialization,String newRole,String newCompany,String newSalary,String newLevel){
        super.setFeatures(newName, newAge, newHeight, newWeight);
        this.specialization = newSpecialization;
        this.role = newRole;
        this.company = newCompany;
        this.salary = newSalary;
        this.level = newLevel;
    }

    void getEngineerStats() {
        System.out.println(
                "\nName:-> " + name + "\nAge:-> " + age + "\nSpecialization:-> " + specialization + "\nRole:-> " + role
                        + "\nCompany:-> " + company + "\nSalary:-> " + salary + "\nLevel:-> " + level + "\n");
    }

    public static void main(String[] args) {
        SoftwareEngineer engineer = new SoftwareEngineer();
        engineer.introduction();
        // newName, newAge,  newHeight,  newWeight, newSpecialization, newRole, newCompany, newSalary, newLevel
        engineer.setFeatures("jamie", 21, 1.9, 70, "web","Front-end","Microsoft", "$100,000", "5");
        engineer.introduction();
        engineer.getEngineerStats();
        
        Human engineer_2 = new SoftwareEngineer();
        ((SoftwareEngineer)engineer_2).setFeatures("Karen", 29, 1.5, 70, "Mobile","IOS","Netflix", "$258,962", "K7");
        ((SoftwareEngineer)engineer_2).getEngineerStats();
        engineer_2.introduction();
    }
}
