import java.util.*;

public class Grid {
    /*
     * Complete the 'countMax' function below.
     *
     * The function is expected to return a LONG_INTEGER.
     * The function accepts STRING_ARRAY upRight as parameter.
     */

    public static long countMax(List<String> upRight) {
        // Write your code here
        int length = upRight.size();
        int[][] twodgrid = new int[length][length];
        long count = 1;
        int max = 0;
        for (int i = 0; i < length; i++) {
            String[] temp = upRight.get(i).split(" ");
            int r = Integer.parseInt(temp[0]);
            int c = Integer.parseInt(temp[1]);
            for (int j = 0; j < r; j++) {
                for (int k = 0; k < c; k++) {
                    twodgrid[j][k] += 1;
                    if (!(j == 0 & k == 0) && twodgrid[j][k] > max) {
                        max = twodgrid[j][k];
                        count = 1;
                    } else if (twodgrid[j][k] == max) {
                        count++;
                    }
                }
            }
        }
        return count;
    }

    public static void main(String[] args) {
        List<String> upRight = new ArrayList<String>();
        upRight.add("2 3");
        upRight.add("3 7");
        upRight.add("4 1");

        long result = countMax(upRight);
        System.out.println(result);
    }
}

// * Complete the 'countMax' function below.
// *
// * The function is expected to return a LONG_INTEGER.
// * The function accepts STRING_ARRAY upRight as parameter.

// public static long countMax(List<String> upRight) {
// Write your code here
// int length = upRight.size();
// int[][] twodgrid = new int[length][length];
// long count = 1;
// int max = 0;
// for( int i = 0; i < length; i++){
// String []temp = upRight.get(i).split(" ");
// int r = Integer.parseInt(temp[0]);
// int c = Integer.parseInt(temp[1]);
// for(int j = 0; j < r; j++){
// for(int k = 0; k < c; k++){
// twodgrid[j][k]+=1;
// if(!(j==0 & k==0) && twodgrid[j][k]>max){
// max = twodgrid[j][k];
// count = 1;
// }else if (twodgrid[j][k] == max){
// count++;
// }
// }
// }
// }
// return count;
// }
// */
