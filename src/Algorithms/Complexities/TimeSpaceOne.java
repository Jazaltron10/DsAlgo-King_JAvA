package Algorithms.Complexities;
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
            System.out.printf("grabbing memo[%d]\n", n);
            return memo.get(n);
        }
        System.out.printf("computing fib(%d)\n", n);
        double result = fibonacci(n - 1) + fibonacci(n - 2);
        // memoize
        memo.put(n, result);
        return result;
    }
    


    public static void main(String[] args) {
        int res;
        res = pairSumSequence(5);
        System.out.println(res);
        double fibRes = fibonacci(50);
        System.out.printf("%n%nThe fibonacci number is %e",fibRes);
    }
}
