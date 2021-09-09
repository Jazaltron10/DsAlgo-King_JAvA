import java.util.*;
public class DynamicProgramming {
    public static int gridTraveler(int width , int height){
        if(width == 1 && height == 1) return 1;
        if(width == 0 || height == 0) return 0;
        // Decreasing the width and height of the grid with each recursive call
        return gridTraveler(width-1, height)+ gridTraveler(width, height-1);
    }
    
    public static double gridTravelerMemoized(int w , int h, Map<String,Double> memo){
        String key = "" + w + "," + h;
        if( memo.containsKey(key)){
            return memo.get(key);
        }
        if(w == 1 && h == 1) return 1;
        if(w == 0 || h == 0) return 0;
        memo.put(key, (gridTravelerMemoized(w-1, h, memo)+ gridTravelerMemoized(w, h-1, memo)));  
        return memo.get(key);
    }
    public static void main(String[] args) {
        // int res = gridTraveler(2,3);
        // System.out.println("\n"+gridTraveler(2,3));
        // System.out.println("\n"+gridTraveler(3,3));
        // System.out.println("\n"+gridTraveler(4,3));
        // System.out.println("\n"+gridTraveler(8,8));
        // System.out.println("\n"+gridTraveler(18,18));
        Map<String,Double> memo = new HashMap<String, Double>();
        System.out.println("\n"+gridTravelerMemoized(18,18, memo));
        System.out.println("\n"+gridTravelerMemoized(4,3, memo));
    }
}
