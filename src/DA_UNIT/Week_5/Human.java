package DA_UNIT.Week_5;

public class Human {
    protected String name;
    protected double height;
    protected int weight;
    protected int age;

    public Human(){
        System.out.println("\nI am a human");
    }
    public Human(String name,  int age, double height, int weight){
        this.name = name;
        this.age = age;
        this.height = height;
        this.weight = weight;
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
    public void setFeatures(String newName, int newAge, double newHeight, int newWeight) {
        this.name = newName;
        this.age = newAge;
        this.height = newHeight;
        this.weight = newWeight;
    }
    public void getinfo(){
        System.out.println("\nThe Info Of this Human is \n" + "\nName :->" + name + "\nAge :-> " + age + "\nHeight :-> " + height + "\nWeight :->" + weight + "\n");
    }
    
    public static void main(String[] args) {
        // name , age, height , weight
        Human Banker = new Human("okon", 60, 1.7 , 82);
        Banker.introduction();
        Banker.setFeatures("John", 26, 1.87, 86);
        Banker.introduction();
        Banker.getinfo();
    }
}
