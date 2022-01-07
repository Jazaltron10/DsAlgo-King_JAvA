import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Sort_2 {
    public static int commonChild(String s1, String s2){
        int[][] dp = new int[s1.length()+1][s2.length()+1];
        for(int i=1;i<=s1.length();i++){
            for(int j=1;j<=s2.length();j++){
                if(s1.charAt(i-1)==s2.charAt(j-1)){
                    dp[i][j] = dp[i-1][j-1]+1;
                }else{
                    dp[i][j] = Math.max(dp[i-1][j],dp[i][j-1]);
                }
            }
        }
        return dp[s1.length()][s2.length()];
    }
        
    public static void main(String[] args) {
        String[] k = new String[] { "1,44","3,4","5,63","5,6","3,2","4,3"};
        System.out.println(Arrays.toString(k));
        String[] o1 = new String[k.length*2];
        List<Integer> Container = new ArrayList<Integer>();
        for (int i = 0; i < k.length; i++) {
            o1 = k[i].split(",");
            Container.add(Integer.parseInt(o1[0]));
            Container.add(Integer.parseInt(o1[1]));
            // System.out.println(o1[0]);
            // System.out.println(o1[1]);
        }
        System.out.println(Arrays.toString(o1));
        System.out.println(Container);
        for (int i = 0, j = i+1 ; i < Container.size(); i++, j++) {
            if(j==Container.size()){
                break;
            }else{
                System.out.println(Container.get(i));
                System.out.println(Container.get(j));
            }
        }



        // Scanner sc = new Scanner(System.in);
        String s1 = "banana";
        String s2 = "bangoan";
        int result = commonChild(s1, s2);
        System.out.println(result);
        // sc.close();
    }
}
