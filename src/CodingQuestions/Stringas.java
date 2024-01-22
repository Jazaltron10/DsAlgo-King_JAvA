import java.util.*;

public class Stringas {
    // Java implementation of the approach

    static int commonChild(String s1, String s2) {
        return LCSM4(s1.toCharArray(), s2.toCharArray(), s1.length(), s2.length());
    }

    public static int LCSM4(char[] X, char[] Y, int m, int n) {
        int memo[] = new int[n + 1];

        for (int i = 1; i <= m; i++) {
            int prev = 0;
            for (int j = 1; j <= n; j++) {
                int temp = memo[j];
                if (X[i - 1] == Y[j - 1]) {
                    System.out.println(X[i - 1] + " " + Y[j - 1]);
                    memo[j] = prev + 1;
                } else {
                    memo[j] = Math.max(memo[j], memo[j - 1]);
                }
                prev = temp;
            }
        }
        System.out.println(Arrays.toString(memo));
        return memo[n];
    }

    // Driver code
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Please input the first string here -->-:");
        String s1 = sc.next();
        System.out.println("Please input the second string here -->-:");
        String s2 = sc.next();
        int result = commonChild(s1, s2);
        System.out.println(result);
        sc.close();

        String s3 = "SHINCHAN";
        char[] cal = s3.toCharArray();
        System.out.println(cal[0]);
        System.out.println(0 + 'a');
        String bigletters = "";
        String small_letters = "";

        for (char c = 65; c <= 90; c++) {
            bigletters += c + " ";
        }
        for (char d = 97; d <= 'z'; d++) {
            small_letters += d + " ";
        }

        System.out.println(bigletters + "\n");
        System.out.println(small_letters);
        System.out.println(Math.max(20, 3));
        System.out.println(Math.min(20, 3));
        System.out.println((int) Math.floor(Math.random() * 3));
    }
}
