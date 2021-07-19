package DA_UNIT.Week_5;

public class SoftwareEngineer extends Human {
    private String specialization;
    private String role;
    private String company;
    private String salary;
    private String level;
    private int YearsOfExperience;

    // The 1st Constructor
    public SoftwareEngineer(String name) {
        super(name);
        System.out.println("\nMy name is " + name + " and I am a SoftwareEngineer");
    }

    // The 2nd Constructor
    public SoftwareEngineer() {
        // this is me using the this keyword in a constructor
        // This constructor just uses the this keyword to call the 3rd constructor
        // and if an object is created with this constructor it will have the default
        // data below
        this("male", "John Doe", 25, "Web", "Front-End Engineer", "IBM", "$100,000", "L5", 5);
    }

    // The 3rd Constructor
    public SoftwareEngineer(String gender, String name, int age, String specialization, String role, String company,
            String salary, String level, int YearsOfExperience) {
        // Using the Super keyword in the constructor of the subclass to call the
        // constructor of the superclass
        super(name, age);
        this.gender = gender; // protected variable from superclass
        this.specialization = specialization;
        this.role = role;
        this.company = company;
        this.salary = salary;
        this.level = level;
        this.YearsOfExperience = YearsOfExperience;
        // calling a bio method for any object created with this constructor
        this.Bio();
    }

    // The Bio Method
    public void Bio() {
            this.gender = this.gender.toUpperCase();
            if (this.gender.equals("MALE")) {
                System.out.println("\n"+ name +" is a "+ role + " at " +company+", he has over " + YearsOfExperience + " years of experience building and maintaining applications for the " + specialization + " platform \nIn all his years at "+ company + ", " + name + " has risen to the level of " + level + " within the company's ranks.\nHe is admired by his coworkers for his strong leadership and technical skills, and because of how valuable he is to " + company + " his total yearly compensation is about "+ salary + "." + "\nFor the past " + (YearsOfExperience - 3) + " years he has been focused on contributing to open source projects and mentoring young developers");
            } else {
                System.out.println("\n"+ name +" is a "+ role + " at " +company+", she has over " + YearsOfExperience + " years of experience building and maintaining applications for the " + specialization + " platform \nIn all her years at "+ company + ", " + name + " has risen to the level of " + level + " within the company's ranks.\nShe is admired by her coworkers for her strong leadership and technical skills, and because of how valuable she is to " + company + " her total yearly compensation is about "+ salary + "." + "\nFor the past " + (YearsOfExperience - 3) + " years she has been focused on helping young female developers navigate the industry");
            }
        }

    public void getinfo() {
        System.out.println("\nThis is the Company Info For "+ name + 
                "\nName:-> " + name + "\nAge:-> " + age +"\nGender:-> " + gender + "\nSpecialization:-> " + specialization + "\nRole:-> " + role
                        + "\nCompany:-> " + company + "\nSalary:-> " + salary + "\nLevel:-> " + level +"\nYears Of Experience:-> " + YearsOfExperience + "\n");
    }

    public void Value(){
        System.out.println("\nIn the field of Software Engineering a software engineer that specializes in " + specialization + ", in the role of "+ role + " \nHas the ability to create and maintain incredibly complex software applications, and that's why companies like "+ company + " value people like " + name + "\n");
    }
    // A Setter method used to set the state of a newly created object
    public void setFeatures(String newGender, String newName, int newAge, String newSpecialization, String newRole,
            String newCompany, String newSalary, String newLevel, int newYearsOfExperience) {
        // calling the setFeatures method of the superclass
        super.setFeatures(newName, newAge);
        // changing the properties of the subclass with the this keyword
        this.gender = newGender;
        this.specialization = newSpecialization;
        this.role = newRole;
        this.company = newCompany;
        this.salary = newSalary;
        this.level = newLevel;
        this.YearsOfExperience = newYearsOfExperience;
    }
    // public static void main(String[] args) {}
}
