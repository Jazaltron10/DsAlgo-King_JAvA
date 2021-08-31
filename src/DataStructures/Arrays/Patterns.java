public class Patterns {
    public static void main(String[] args) {
        System.out.println("\nHello World");
        System.out.println("\n   This is a Multiplication Time Table");
        
        // multiplication table 
        String sta = "";
        for(int i=1; i<=12;i++){
            for(int j=1; j<=12; j++){
                sta += "  "+j*i;    
            }
            System.out.println( "\n"+ sta);
            sta =  "";
        }

        // Printing block or square patterns  
        String t = "";
        String k = "";
        for(int i=1; i<=5;i++){
            for(int j=1; j<=i; j++){
                t = "*".repeat(5)+"+".repeat(5)+"*".repeat(5);    
                // k += "+";    
            }
            System.out.printf("%n%n%s\n%s", t, k);
        }
        
        
        
        System.out.printf("%n%nRight Angled Triangle%n");
        // Right angled triangle  
        for (int i = 0; i < 1;i++){
            // star += "+-";    
            String star = "";
            // System.out.println(star);
            for (int j = 0; j < 10;j++) {
                star += "*";    
                System.out.println(star);
            }
        }
        
        
        
        System.out.printf("%n%nReverse Right Angled Triangle using repeat()%n");
        // Reverse Right angled triangle
        for (int i = 0; i < 1; i++){
            String st = "";
            for (int a = 10; a > 0; a--){
                st = "*".repeat(a);   
                System.out.println(st);
            }
        }
        
        
        // Reverse Right angled triangle using a while loop
        System.out.printf("%n%nReverse Right angled triangle using a while loop\n");
        int l = 10;
        while (l > 0){
            System.out.println("+".repeat(l));
            l-=1;
        }

    



    }
}
