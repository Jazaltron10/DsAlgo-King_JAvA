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
public static boolean isValidSubsequence(List<Integer> array, List<Integer> sequence) {
    // Write your code here.
		int count = 0;
		for(int c = 0 ; c < array.size();c++){
				if (count == sequence.size()){
					break;
				}
				if ((array.get(c) == sequence.get(count))){
					count+=1;
				}	
		}
		if (count == sequence.size()){
			return true;
		}
    return false;
}

static Map<Character,Integer> histogram( String word){
    Map<Character,Integer> dictionary = new HashMap<>();
    word = word.toLowerCase();
    for (int i = 0; i < word.length(); i++) {
        // System.out.println("\n"+ c);
        char c = word.charAt(i);
        Integer value = dictionary.get(c); 
        if(dictionary.containsKey(c)){
            value += 1;
            dictionary.put(c, value);
        }else{
            value = 1;
            dictionary.put(c, value);
        }
    } 
    // System.out.println(dictionary);
    return dictionary;
}
public static int commonChild(String s1, String s2) {
    
    Map<Character, Integer> map1 = new HashMap<Character, Integer>();
    Map<Character, Integer> map2 = new HashMap<Character, Integer>();
    // Write your code here
    map1 = histogram(s1);
    map2 = histogram(s2);
    
    int count = 0;
    for(char k : map1.keySet()) {
        for(char l : map2.keySet()) {
            if(k == l) {
                count++;
            }
            // System.out.println(k+l);
        }
    }
    return count;
    }

static int thecommoner(String s1, String s2) {
    int count = 0;
    String newS1 ="";
    String newS2 ="";
    
    for (int i = 0; i < s1.length(); i++) {
        for(int j = 1; j < s1.length(); j++) {
            if(s1.charAt(i) == s1.charAt(j)) {
                break;
            }
            else if (s1.charAt(i) != s1.charAt(j) && s2.charAt(i) != s2.charAt(j)){
                newS1 += s1.charAt(i);
                newS2 += s2.charAt(i);
            }
        }
    }
    for(int i = 0; i < newS1.length(); i++) {
        for(int j = 0; j < newS1.length(); j++) {
            if (newS1.charAt(i) == newS2.charAt(j)){
                count++;
            }
        }
    }
    System.out.println(newS1);
    System.out.println(newS2);
    return count;
}
static int thecommoner2(String s1, String s2) {
    int count = 0;
    String newS1 ="";
    String newS2 ="";
    
    for (int i = 0; i < s1.length(); i++) {
        for(int j = 1; j < s1.length(); j++) {
            if(s1.charAt(i) == s1.charAt(j)) {
                break;
            }
            else if (s1.charAt(i) != s1.charAt(j) && s2.charAt(i) != s2.charAt(j)){
                newS1 += s1.charAt(i);
                newS2 += s2.charAt(i);
            }
        }
    }
    for(int i = 0; i < newS1.length(); i++) {
        for(int j = 0; j < newS1.length(); j++) {
            if (newS1.charAt(i) == newS2.charAt(j)){
                count++;
            }
        }
    }
    System.out.println(newS1);
    System.out.println(newS2);
    return count;
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


    boolean resulto = isValidSubsequence(Arrays.asList(1,2,3,4,5), Arrays.asList(4,1));
    System.out.println(resulto + "\n\n");
    // int kas = commonChild("SHINCHAN", "NOHARAAA"); 
    // System.out.println(kas);
    // int las = thecommoner("BANANA", "NOHARAAA"); 
    int las = thecommoner("SHINCHAN", "NOHARAAA"); 
    System.out.println(las);
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
