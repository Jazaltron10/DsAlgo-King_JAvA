package DA_UNIT.Week_5;

public class Person {
    protected String name;
    protected double height;
    protected int weight;
    protected int age;
    protected String gender;
    protected String country;
    protected int YearsOfExperience;

    // This is the 1st constructor.
    public Person(String name){
        System.out.println("\nMy name is "+ name +" and I am a human being");
    }
    // This is the 2nd constructor.
    public Person(String name, int age){
        this.name = name;
        this.age = age;
    }
    // This is the 3rd constructor.
    public Person(String name, int age, double height, int weight, String gender, String country){
        this.name    = name;
        this.age     = age;
        this.height  = height; 
        this.weight  = weight;
        this.gender  = gender;
        this.country = country;
        this.introduction();
    }
    // A method to introduce the person
    public void introduction(){
        System.out.println("\nHello there friends, my name is " + this.name + " I am " + this.age + " years old");
    }
    // A Method to change the name and age features of a person object
    public void setFeatures(String newName, int newAge){
        this.name = newName;
        this.age = newAge;
    }
    // A Method to change all the features of a person object
    public void setFeatures(String newName, int newAge, double newHeight, int newWeight, String newGender, String newCountry) {
        this.name = newName;
        this.age = newAge;
        this.height = newHeight;
        this.weight = newWeight;
        this.gender  = newGender;
        this.country = newCountry;
    }
    // a getter method that Displays all of the personal information of a person object
    public void getinfo(){
        System.out.println("\nBelow is the basic info for "+ name  + "\nName:-> " + name + "\nAge:-> " + age + " years old\nHeight:-> " + height + " m\nWeight:-> " + weight + " kg\nGender :-> " + gender+  "\nCountry:-> " + country + "\n");
    }
    
    // public static void main(String[] args) {}
}

