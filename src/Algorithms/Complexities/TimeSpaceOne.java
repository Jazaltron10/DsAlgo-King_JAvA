import java.util.*;
public class TimeSpaceOne {
    static int pairSumSequence(int n){
        int sum = 0;
        for(int i = 0; i < n; i++){
            sum += pairSum(i, i+1);
            System.out.printf("%d\n", sum);
        }
        return sum;
    }
    static int pairSum(int a , int b){
        return a + b;
    }

    /**
     * using a memo to store fibonacci numbers in order to
     * speed up the computation of larger fibonacci numbers.
     */
    static Map<Double,Double> memo = new HashMap<>();
    static double fibonacci(double n){
        // Base case since fib(1) and fib(2) are the same i.e 1
        if (n <= 2 ) return 1;
        
        // see if we've already calculated this
        if (memo.containsKey(n)) {
            // System.out.printf("grabbing memo[%e]\n", n);
            return memo.get(n);
        }
        // System.out.printf("computing fib(%e)\n", n);
        double result = fibonacci(n - 1) + fibonacci(n - 2);
        // memoize
        memo.put(n, result);
        return result;
    }
    
    static Map<String,Double> memo_2 = new HashMap<>();
    static double gridTraveler(int m, int n){
        String key = ""+ m + "," + n;
        if (memo_2.containsKey(key)){
            return memo_2.get(key);
        }
        if (m == 1 && n == 1){
            return 1;
        }
        if (m == 0 || n == 0){
            return 0;
        }
        double result = gridTraveler(m-1, n)+gridTraveler(m, n-1);
        memo_2.put(key, result);
        return result;
    }

    static void gridPrinter(double res){
        System.out.printf("%n%nThe Number of possible paths to the bottom right corner of the grid are %e",res);
    }
    public static void main(String[] args) {
        int res;
        res = pairSumSequence(5);
        System.out.println(res);
        double fibRes = fibonacci(50);
        System.out.printf("%n%nThe fibonacci number is %e",fibRes);
        // double grid_1 = gridTraveler(1,2);
        // double grid_2 = gridTraveler(3,2);
        // double grid_3 = gridTraveler(45,90);
        // double grid_4 = gridTraveler(18,20);
        // double grid_5 = gridTraveler(32,20);
        ArrayList<Double> Grids = new ArrayList<Double>();
        for (int i = 1; i <= 5; i++){
            Grids.add(gridTraveler(i*4, i*3));
        }
        for(double item : Grids){
            gridPrinter(item);
        }
        System.out.println("\n" + Grids);
    }
}
