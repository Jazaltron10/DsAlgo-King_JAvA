package Algorithms.Sorting;
import java.util.*;
public class QuickSort {
    static ArrayList<Integer> createRandomList(Random rand){
        ArrayList<Integer> list = new ArrayList<Integer>();
        for (int i = 0; i < 13;i++) {
            int rnum = rand.nextInt(20);
            list.add(rnum + i );
        }
        System.out.println(list);
        return list;
    }
    static ArrayList<Integer> quickSort(ArrayList<Integer> list){
        if (list.size() <= 1){
            return list;
        }
        ArrayList<Integer> lessTp = new ArrayList<Integer>();  
        ArrayList<Integer> greaterTp = new ArrayList<Integer>();  
        int pivot =list.get(0);
        int length = list.size();
        
        for(int i = 1; i < length;i++){
            int cValue = list.get(i);
            if (cValue <= pivot){
                lessTp.add(cValue);
            }
            else{
                greaterTp.add(cValue);
            }
        }
        ArrayList<Integer> sortedList = new ArrayList<Integer>();  
        sortedList.addAll(quickSort(lessTp));
        sortedList.add((pivot));
        sortedList.addAll(quickSort(greaterTp));
        return sortedList;
    }
    
    public static void main(String[] args) {
        Random rand = new Random();
        ArrayList<Integer> list;
        list = createRandomList(rand);
        ArrayList<Integer> sortedList;
        sortedList = quickSort(list);

        System.out.println("\nApplying QuickSort");
        System.out.println(sortedList);
    }
}
