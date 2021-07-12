package DA_UNIT;

public class Cars {
    String name; //Name of the car
    int hp;     // Horse power of car
    int speed; //Speed of car

    //First constructor
    public Cars(String n){
        name = n;
        arrival();
    }
    // Second constructor
    public Cars(String n, int h , int s){
        name = n;
        hp = h;
        speed = s;
    }

    public void arrival(){
        hp = 1200;
        speed = 268;
        System.out.println("\nThe " + name + " is a pretty awesome car with at least " + hp + "hp and a topspeed of " + speed + "mph");
    }
    public void stats(){
        System.out.println("\nThe " + name + " is a beautiful car with a total of " + hp + "hp and a top speed of " + speed + "mph");
    }
    public static void main(String[] args) {
        Cars Toyota;
        Toyota = new Cars ("Camry",230 , 125);
        Toyota.stats();

        Cars Sports = new Cars("Bugatti");
        Sports.hp = 1500;
        Sports.speed = 250;
        System.out.println("\n" + Sports.hp); 
        System.out.println("\n" + Sports.speed); 
        Sports.stats();

        Cars Lamborghini = new Cars("Aventador", 950, 213);
        Lamborghini.stats();


    }
}




