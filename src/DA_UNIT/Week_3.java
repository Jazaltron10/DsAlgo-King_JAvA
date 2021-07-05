package DA_UNIT;

public class Week_3 {
    static void FormalParameters(int shake, String bake) {
        System.out.println(bake + " is " + shake + " years old");
    }

    static void ActualParameters(String name, String car, String day) {
        System.out.println(name + " loves to drive his " + car + " Only on a " + day);
    }

    public static void main(String[] args) {
        System.out.println("\nDA_Unit_3");
        FormalParameters(26, "john");
        String name = "Cristiano";
        String car = "Bugatti";
        String day = "Sunday";
        ActualParameters(name, car, day);
    }
}
