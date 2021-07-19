package DA_UNIT.Week_5;

public class Human {
    protected String name;
    protected double height;
    protected int weight;
    protected int age;
    protected String gender;

    public Human(String name){
        System.out.println("\nMy name is "+ name +" and I am a human being");
    }
    public Human(String name, int age){
        this.name = name;
        this.age = age;
    }
    public void introduction(){
        System.out.println("\nHello there friends, my name is " + this.name + " I am " + this.age + " years old and " + this.height + " m tall " + "\n");
    }
    public void setFeatures(String newName, int newAge){
        this.name = newName;
        this.age = newAge;
    }
    public void setFeatures(double newHeight, int newWeight) {
        this.height = newHeight;
        this.weight = newWeight;
    }
    public void getinfo(){
        System.out.println("\nThe Info Of this Human is \n" + "\nName :->" + name + "\nAge :-> " + age + "\nHeight :-> " + height + "\nWeight :->" + weight + "\n");
    }
    
    public static void main(String[] args) {
        // name , age
        Human Banker = new Human("okon", 60);
        Banker.introduction();
        Banker.setFeatures(1.87, 86);
        Banker.introduction();
        Banker.getinfo();
    }
}

