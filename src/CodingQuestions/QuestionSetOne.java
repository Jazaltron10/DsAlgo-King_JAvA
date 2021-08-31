import java.util.*;

public class QuestionSetOne {
    public static int[] TwoNumberSum(int[] array, int targetSum) {
        int[] twonums = new int[2];
        
        
        int sum;
        for(int i = 0; i < array.length; i++){
            for(int j = i + 1; j < array.length; j++){
                sum = array[i] + array[j];
                if (sum==targetSum){
                    twonums[0] = array[i];
                    twonums[1] = array[j];
                    return twonums;
                }
                // System.out.println("\n"+ "The sum of " + array[i] +" and " + array[j] + " is " + sum);
            }
        }
        return new int[0];
    }
    public static int ProductSum(){
        List<Object> sparr = new ArrayList<Object>();
        sparr = Arrays.asList(
            5,
            2,
            new ArrayList<Object>(Arrays.asList(7,-1)),
            3, 
            new ArrayList<Object>(Arrays.asList(
                    6,
                    new ArrayList<Object>(Arrays.asList(-13,8)),
                    4)
                )
            );
        // int[][]{ 5 , 2, {7, -1}, 3, {6,{-13, 8},4}};
        System.out.println(sparr);
        return -1;
    }
    
    public static void main(String[] args) {
        int[] numlist = new int[10];
        int[] twonums = new int[2];
        Random rand = new Random();
        int randnum = rand.nextInt(21);
        for (int i = 0; i<numlist.length; i++) {
            numlist[i] = i * randnum;
        }
        // System.out.println(Arrays.toString(numlist));
        // System.out.println("\n"+ randnum);
        // twonums = TwoNumberSum(numlist, randnum);
        int[] numlist_2 = new int[] {3,5,-4,8,11,1,-1,6};
        System.out.println(Arrays.toString(numlist_2));
        twonums = TwoNumberSum(numlist_2, 20);
        System.out.println("\n"+Arrays.toString(twonums));

        ProductSum();
        totalsum();
        System.out.println(1+2+3+4+5+6+7+8+9);
    }
    static void totalsum(){
        int sum = 0;
        for (int i = 1; i < 10; i++){
            sum +=i;
            System.out.println(sum);
        }
    }
}