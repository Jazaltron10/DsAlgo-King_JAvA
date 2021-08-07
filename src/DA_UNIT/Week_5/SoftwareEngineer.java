package DA_UNIT.Week_5;
import java.util.*;
public class SoftwareEngineer extends Person {
    //private variables that can only be accessed within this class
    private String specialization;
    private String role;
    private String company;
    private String salary;
    private String level;

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
        // protected variable from superclass being accessed using the super keyword
        super.gender = gender;
        super.YearsOfExperience = YearsOfExperience;
        // private variable in the subclass being accessed using the this keyword
        this.specialization = specialization;
        this.role = role;
        this.company = company;
        this.salary = salary;
        this.level = level;
        // calling a bio method for any object created with this constructor
        //this.Bio();
    }

    // The Bio Method
    public void Bio() {
            // checking the gender of the objects before executing this method
            this.gender = this.gender.toUpperCase();
            if (this.gender.equals("MALE")) {
                System.out.println("\n"+ name +" is a "+ role + " at " +company+", he has over " + YearsOfExperience + " years of experience building and maintaining applications for the " + specialization + " ecosystem \nIn all his years at "+ company + ", " + name + " has risen to the level of " + level + " within the company's ranks.\nHe is admired by his coworkers for his strong leadership and technical skills, and because of how valuable he is to " + company + " his total yearly compensation is about "+ salary + "." + "\nFor the past " + (YearsOfExperience - 3) + " years he has been focused on contributing to open source projects and mentoring young developers");
            } else {
                System.out.println("\n"+ name +" is a "+ role + " at " +company+", she has over " + YearsOfExperience + " years of experience building and maintaining applications for the " + specialization + " ecosystem \nIn all her years at "+ company + ", " + name + " has risen to the level of " + level + " within the company's ranks.\nShe is admired by her coworkers for her strong leadership and technical skills, and because of how valuable she is to " + company + " her total yearly compensation is about "+ salary + "." + "\nFor the past " + (YearsOfExperience - 3) + " years she has been focused on helping young female developers navigate the industry");
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
        // changing the variables of the superclass with the super keyword
        super.gender = newGender;
        super.YearsOfExperience = newYearsOfExperience;
        // changing the properties of the subclass with the this keyword
        this.specialization = newSpecialization;
        this.role = newRole;
        this.company = newCompany;
        this.salary = newSalary;
        this.level = newLevel;
    }

    public void testingsuper() {
        // only possible because base class variables are protected and not private
        super.name = "James Cameron";
        super.height = 1.82;
        super.weight = 81;
        super.country = "Canada";
        super.getinfo();
        this.name = "Kylian Romario";
        this.getinfo();
        // this throws an error because the variable company does not exist in the superclass
        // super.company = "jaha";
    }
    public static void main(String[] args) {
                // Section for the SoftwareEngineer Class
                // String gender, String name, int age, String specialization, String role,
                // String company, String salary, String level
                SoftwareEngineer WebDeveloper = new SoftwareEngineer("female", "Maya Kricko", 27, "Web DevelopMent",
                                "Front-End Engineer", "Google", "$658,962", "L7", 10);
                //WebDeveloper.getinfo();
                //WebDeveloper.Value();

                Person MobileDeveloper = new SoftwareEngineer();
                ((SoftwareEngineer) MobileDeveloper).setFeatures("male", "Cristiano Ronaldo", 32, "Apple IOS",
                                "Mobile Developer", "Apple", "$258,962", "ICT 3", 5);
                //((SoftwareEngineer) MobileDeveloper).Bio();
                //((SoftwareEngineer) MobileDeveloper).getinfo();
                //((SoftwareEngineer) MobileDeveloper).Value();

                SoftwareEngineer CloudEngineer = new SoftwareEngineer("male", "Mike Ross", 45, "Azure Cloud",
                                "Cloud Architect", "Microsoft", "$872,650", "Partner", 15);
                //CloudEngineer.getinfo();

                SoftwareEngineer TestingEngineer = new SoftwareEngineer("female", "Jasmine Neutron", 37, "Software Testing",
                                "QA Engineer", "Facebook", "$396,802", "E5", 7);
                //TestingEngineer.getinfo();

                SoftwareEngineer AutomationEngineer = new SoftwareEngineer("male", "Jake Sully", 29, "AWS Cloud",
                                "DevOps Engineer", "Netflix", "$506,788", "Senior Software Engineer", 10);
                //AutomationEngineer.getinfo();
                //AutomationEngineer.testingsuper();
                
                // Using An ArrayList to Manipulate all created Objects
                ArrayList<Person> SWE = new ArrayList<Person>();
                SWE.add(WebDeveloper);
                SWE.add(MobileDeveloper);
                SWE.add(CloudEngineer);
                SWE.add(TestingEngineer);
                SWE.add(AutomationEngineer);
                int count = 0;
                String tab = "\t";
                for(Person item : SWE) {
                    count++;
                    System.out.printf("\n%s%s%s\n",tab.repeat(10),"Engineer ",count);
                    ((SoftwareEngineer)item).Bio();
                    item.getinfo();
                    if(count == 1 || count == 2) {
                        ((SoftwareEngineer)item).Value();
                    }
                    if(count == 5){
                        ((SoftwareEngineer)item).testingsuper();
                    }
                }
    }
}
