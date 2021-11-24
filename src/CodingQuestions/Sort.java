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
    static int ConsonountCount(String s){
        /*
         * This function can also be used to calculate the amount of vowels present in a string.
         */
        s = s.toLowerCase();
        int numcon = 0;
        for (char c : s.toCharArray()){
            if (!(c == 'a' || c == 'e' || c == 'i' || c == 'o' || c == 'u')){
                numcon++;
            }
        }
        // numcon = s.length() - numcon;
        return numcon;
    }

    static void ReverseArray(){
        int[] array = {1,2,3,4,5,6,7,8,9,10};
        int j = array.length - 1;
        int temp = 0;
        System.out.println(Arrays.toString(array));
        for(int i = 0; i < array.length/2; i++, j--){
            temp = array[i] ;
            array[i] = array[j];
            array[j]= temp;
        }
        System.out.println(Arrays.toString(array));
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

        int num = ConsonountCount("aeroplanser");
        System.out.printf("%n%nThe total amount of consonants in the given word are %d\n\n",num);
        // String name = "james";
        // System.out.printf("%n%nThe name is %s",name.getClass().getName());
        
        ReverseArray();
    }
    // System.out.println(theVariable.getClass().getName());
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
//             index = j;
//         }
        
//     }
// }
// System.out.printf("the number is %d %n the index is %d",temp, index);
// return index;



