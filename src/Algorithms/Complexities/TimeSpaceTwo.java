import java.util.*;
public class TimeSpaceTwo {
    static String nline = "\n";
    static void reverse(int[] array){
        // O(n) time 
        for(int i=0; i < array.length/2;i++){
            int other = array.length-i-1; // getting the indexes
            int temp = array[i];          // getting the value at an index
            array[i] = array[other];
            array[other] = temp;
        }
        System.out.println(Arrays.toString(array));
        // return array;
    }
    public static void main(String[] args) {
        int [] arr = new int[]{ 1, 2, 3, 4,5,6,7, 8,9};
        System.out.println(nline + Arrays.toString(arr)+ nline);
        reverse(arr);

    }    
}
