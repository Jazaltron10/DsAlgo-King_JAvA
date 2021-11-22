public class QuestionSetThree {

    public static String findSubstring(String s, int k) {
        String notfound = "Not found!";
        int res = 0;
        int count = 0;
        int newcnt = 0;
        for(int i = 0 ; i < s.length(); i++){
            newcnt+=1;
            if (s.charAt(i) == 'a' || s.charAt(i) == 'e' ||s.charAt(i) == 'i' || s.charAt(i) == 'o' ||s.charAt(i) =='u'){
                count++;
            }
            if(newcnt == k){
                if(res < count){
                res = count;
                notfound = s.substring(i-k+1, i);
            }
            count = 0;
            newcnt -= 1;
            }
        }// end of for loop 
        return notfound;
    }
    public static void main(String[] args) {
        // findSubstring();
        
        
        
        
        int num = 59;
        char name = 'i';
        String haha = "" + num + name;
        String rulenc = "" + haha.repeat(2);
        System.out.println(rulenc);
    }
}





// public static String findSubstring(String s, int k) {
//     String notfound = "Not found!";
//     int fad = 0;
//     for(int i = 0 ; i < s.length() - k+1; i++){
//     int count = 0;
//         String name = s.substring(i, i+k);
//         for(int j = 0; j < k; j++ ){
//             if (name.charAt(j) == 'a' || name.charAt(j) == 'e' ||name.charAt(j) == 'i' || name.charAt(j) == 'o' ||name.charAt(j) =='u'){
//                 count++;
//             }
//         }
//         if(fad < count){
//             fad = count;
//             notfound = name;
//         }
        
//     }
//     return notfound;
// }

