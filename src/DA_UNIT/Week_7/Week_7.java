package DA_UNIT.Week_7;
import java.util.ArrayList;


public class Week_7 {
    static String nline = "\n";
    static void Autoboxing(){
        ArrayList<Double> numList = new ArrayList<Double>();
        for (int i = 0; i < 10.0; i++){
            numList.add(i*10.0);
        }
        System.out.println(nline + numList);
    
    }

    static void Unboxing(){

    }
    static void AreaOfSphere(){

    }
    public static void main(String[] args) {
        System.out.println(nline + "Is This Java For Real");

        Autoboxing();
        Unboxing();
        AreaOfSphere();
    }
}
