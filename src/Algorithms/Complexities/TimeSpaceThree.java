// import java.util.*;
public class TimeSpaceThree {
    static int addMeUp() {
        int a = 26;
        int b = 43;
        int itsAboutTime = 0;
        int[] lentos = new int[30];
        for (int k : lentos) {
            if (k % 2 == 0) {
                itsAboutTime = a + b * k;
            }
            System.out.println(itsAboutTime);
        }
        return itsAboutTime;
    }

    static void victony() {
        System.out.println("");
    }

    public static void main(String[] args) {
        System.out.println("Hello world !");
        System.out.println("Hello Universe ! -.>" + (9 + 89));
        int ans = addMeUp();
        System.out.println("The answer -> " + ans);
    }
}
