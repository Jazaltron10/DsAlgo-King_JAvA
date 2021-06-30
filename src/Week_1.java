public class Week_1 {
        static void semantic_error() {
            //This program is meant to calculate the square of 5
            int square = 5 / 5;
            System.out.print("\n"+square);
        }

        static void syntax_error() {
            int height = 20;
            int width = 10;
            int area = height * width;
            System.out.println("\nThe Area of the rectangle is " + area);
        }
        
        public static void main(String []args) {
            System.out.print("Hello");
            semantic_error();
            syntax_error();
            
        }
}





