// package DA_UNIT;

public class Vehicle {
    String Name;
    String Model;
    String Color;
    String Type;
    String Year;
    String Hp;
    String Speed;
    String Torque;
    String Price;

    // First constructor Using some of the instance state and an instance method
    public Vehicle(String n, String m, String h, String s, String q) {
        Name = n;
        Model = m;
        arrival(h, s, q);
    }

    // Second constructor Using the instance states
    public Vehicle(String n, String m, String c, String t, String y, String h, String s, String q, String p) {
        Name = n;
        Model = m;
        Color = c;
        Type = t;
        Year = y;
        Hp = h;
        Speed = s;
        Torque = q;
        Price = p;
    }

    //This is a class method that gives information on the new arrivals
    public void arrival(String h, String s, String q) {
        Hp = h;
        Speed = s;
        Torque = q;
        System.out.println("\nThis is the " + Name + " " + Model + " and it is a beast of a car with at least " + h
                + " and a topspeed of " + s + " it also has a torque of " + q);
    }

    //This method provides info on the specification of any car object produced from this class
    public void specs() {
        System.out.println("\nThis is the " + Name + " " + Model + " And the specs of this vehicle are\nName :-> "
                + Name + "\nModel :-> " + Model + "\nColor :-> " + Color + "\nType :-> " + Type + "\nYear :-> " + Year
                + "\nHorsePower :-> " + Hp + "\nSpeed :-> " + Speed + "\nTorque :-> " + Torque + "\nPrice :-> "
                + Price);
    }

    public void getprice() {
        System.out.println("\nThe price of this car is :-> " + Price + "\n");
    }

    public void getColorOptions() {
        System.out.println("\nThe " + Name + " " + Model + " is a beautiful car that comes in " + Color
                + " by default, but you can also get it in Aquagreen, Charcoal, Pink and any other color of your choosing\n");
    }

    public void getModelYear() {
        System.out.println("The " + Name + " " + Model + " is an extremely sought after " + Type
                + " vehicle that was made in the year " + Year + "\n");
    }

    public static void main(String[] args) {
        // This is an object being created from the Vehicle Class
        Vehicle Volkswagen;
        Volkswagen = new Vehicle("Volkswagen", "Tiguan", "Blue", "SUV", "2021", "184 hp @ 4400 rpm", "114 mph",
                "221 lb-ft @1600 rpm", "$40,485");
        // Calling the various instance methods for this object
        Volkswagen.specs();
        Volkswagen.getColorOptions();

        // This is an object being created from the Vehicle Class
        Vehicle Bugatti = new Vehicle("Bugatti", "Chiron", "1479 hp @ 6700 rpm", "261 mph", "1180 lb-ft @ 2000rpm");
        Bugatti.Color = "Dark Blue";
        Bugatti.Type = "Super Sports";
        Bugatti.Year = "2021";
        Bugatti.Price = "$3,710,850";
        // Calling the various instance methods for this object
        Bugatti.specs();
        Bugatti.getprice();

        // This is an object being created from the Vehicle Class
        Vehicle Lamborghini = new Vehicle("Lamborghini", "Aventador SVJ roadster", "Blue", "Super Sports", "2020",
                "759 hp @ 8500 rpm", "217 mph", "531 lb-ft @ 6750 rpm", "$584,061");
        // Calling the various instance methods for this object
        Lamborghini.specs();
        Lamborghini.getColorOptions();

        // This is an object being created from the Vehicle Class
        Vehicle Chevrolet;
        Chevrolet = new Vehicle("Chevrolet", "Corvette Stingray Z51", "495 hp @ 6450 rpm", "184 mph",
                "470 lb-ft @ 5150 rpm");
        Chevrolet.Color = "Yellow";
        Chevrolet.Type = "Sports";
        Chevrolet.Year = "2020";
        Chevrolet.Price = "$88,310";
        // Calling the various instance methods for this object
        Chevrolet.specs();
        Chevrolet.getModelYear();

        // This is an object being created from the Vehicle Class
        Vehicle RollsRoyce;
        RollsRoyce = new Vehicle("Rolls-Royce", "Cullinan", "Black", "High-End Luxury SUV", "2019", "563 hp @ 5000 rpm",
                "151 mph", "627 lb-ft @ 1600rpm", "$410,575");
        // Calling the various instance methods for this object
        RollsRoyce.specs();
        RollsRoyce.getprice();
        RollsRoyce.getColorOptions();
        RollsRoyce.getModelYear();
    }
}
