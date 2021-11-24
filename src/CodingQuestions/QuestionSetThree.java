import java.util.*;

public class QuestionSetThree {

    public static String findSubstring(String s, int k) {
        String notfound = "Not found!";
        int res = 0;
        int count = 0;
        int newcnt = 0;
        for (int i = 0; i < s.length(); i++) {
            newcnt += 1;
            if (s.charAt(i) == 'a' || s.charAt(i) == 'e' || s.charAt(i) == 'i' || s.charAt(i) == 'o'
                    || s.charAt(i) == 'u') {
                count++;
            }
            if (newcnt == k) {
                if (res < count) {
                    res = count;
                    notfound = s.substring(i - k + 1, i);
                } if (i-k>=0){
                    if ((s.charAt(i - k) == 'a' || s.charAt(i - k) == 'e' || s.charAt(i - k) == 'i' || s.charAt(i - k) == 'o'
                            || s.charAt(i - k) == 'u' )) {
                        count--;
                    }
                }else{
                    if ((s.charAt(0) == 'a' || s.charAt(0) == 'e' || s.charAt(0) == 'i' || s.charAt(0) == 'o'
                            || s.charAt(0) == 'u' )) {
                        count--;
                    // System.out.println("");
                }
                newcnt -= 1;
            }
        } // end of for loop
    }
    return notfound;
}

public static int findtheRank(int[][] glist, int rank ){
    int [] totalScore = new int[glist.length];
    for (int i = 0; i < glist.length; i++) {
        for (int j = 0; j < glist[i].length; j++) {
            totalScore[i] += glist[i][j];
        }
    }
    Integer[] temparr;
    // temparr = Arrays.copyOf(totalScore, totalScore.length);
    temparr = new Integer[totalScore.length];
    for(int l = 0; l < totalScore.length; l++){
        temparr[l] = totalScore[l];
    }

    System.out.println(Arrays.toString(totalScore));
    Arrays.sort(totalScore);
    System.out.println(Arrays.toString(totalScore));
    
    System.out.println(Arrays.toString(temparr));
    int result = totalScore[rank-1];
    int S = Arrays.asList(temparr).indexOf(result);

    return S;
}
public static void main(String[] args) {
    // String res = findSubstring("azerdii", 3);
    // System.out.println(res);

    // Math.floor(Math.random()*(10-1+1)+1);
    Random rand = new Random();
    int k = 5;//rand.nextInt(10);
    int n = 5;//rand.nextInt(10);
    int[][]gradeList = new int[n][k];
    // System.out.println(gradeList.length);
    // System.out.println(Arrays.deepToString(gradeList));
    
    for (int i = 0; i < gradeList.length; i++){
        for (int j = 0; j < gradeList.length; j++){
            gradeList[i][j] = rand.nextInt(100);
        }
    }
    System.out.println(Arrays.deepToString(gradeList));
    
    int resu = findtheRank(gradeList, 2);
    System.out.println("The index of the given rank is " + resu);
    }
}

















    //Brute force
    // int i = 0;
    // while(i<glist.length){
    //     totalScore[0] += glist[0][i];
    //     i++;
    // }
    // int j = 0;
    // while(j<glist.length){
    //     totalScore[1] += glist[1][j];
    //     j++;
    // }
    // int k = 0;
    // while(k<glist.length){
    //     totalScore[2] += glist[2][k];
    //     k++;
    // }



















































































// public static String findSubstring(String s, int k) {
// String notfound = "Not found!";
// int fad = 0;
// for(int i = 0 ; i < s.length() - k+1; i++){
// int count = 0;
// String name = s.substring(i, i+k);
// for(int j = 0; j < k; j++ ){
// if (name.charAt(j) == 'a' || name.charAt(j) == 'e' ||name.charAt(j) == 'i' ||
// name.charAt(j) == 'o' ||name.charAt(j) =='u'){
// count++;
// }
// }
// if(fad < count){
// fad = count;
// notfound = name;
// }

// }
// return notfound;
// }
