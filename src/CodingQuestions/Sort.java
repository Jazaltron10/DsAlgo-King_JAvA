import java.util.Arrays;

public class Sort {
    static int[] largeSmall(Integer[] array){
        int largest = 0;
        int smallest = array[0];
        for(int a : array){
            if(a > largest){
                largest = a;
            }
            if (a < smallest){
                smallest = a;
            }
        }
        return new int[]{largest, smallest};
    }
    public static void main(String[] args) {
        Integer[] array = {109,302,34,4,55,36,17,86,29,10};
        System.out.println(Arrays.toString(array));
        
        int[] ind = largeSmall(array);
        System.out.println(Arrays.toString(ind));
        int L = Arrays.asList(array).indexOf(ind[0]);
        System.out.println(L);
        int S = Arrays.asList(array).indexOf(ind[1]);
        System.out.println(S);
        
    }
}

// Random rand = new Random();
// int temp = 0;
// int index = 0;
// int[] randnum = new int[10];
// for (int i = 0; i < randnum.length; i++) {
//     randnum[i] = rand.nextInt(100);
// }
// System.out.println(Arrays.toString(randnum));
// for(int i = 0; i < randnum.length; i++) {
//     for(int j = i+1; j < randnum.length; j++){
//         if(randnum[i] > randnum[j])
//         {
//             temp = randnum[i];
//             randnum[i] = randnum[j];
//             randnum[j] = temp;
//             System.out.println(j);
//             // index = j;
//         }
        
//     }
// }
// // System.out.printf("the number is %d %n the index is %d",temp, index);
// return index;