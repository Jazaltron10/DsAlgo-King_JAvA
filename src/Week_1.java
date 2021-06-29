import java.util.Scanner;
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
        static void PhoneBills() {
            Scanner scan = new Scanner(System.in);
            int phonebills[] = new int[12];
            // phonebills[12] = data.nextInt();
            float sum = 0, average;
            int i;
            // scan.close();
            System.out.print("\n");
            for (i = 0; i < 12; i++) {
                System.out.print((i + 1) + "=>$");
                phonebills[i] = scan.nextInt();
            }
            // System.out.println(phonebills[i]);
            for (i = 0; i < 12; i++) {
                sum += phonebills[i];
            }
            
            average = sum / (float) 12;
            System.out.println("\nYour average phonebill for 12 months is $" + average);
        }

        static void cat(){
            String name = "jj";
            switch(name){
                case "john":
                    System.out.println("welcome john");
                    break;
                case "mary":
                    System.out.println("welcome mary");
                    break;
                case "dasko":
                    System.out.println("welcome dasko");
                    break;
                default:
                    System.out.println("Can't find who you are looking for ");

            }
        }
        public static void main(String []args) {
            //System.out.print("Hello");
            //semantic_error();
            //syntax_error();
            PhoneBills();
            //cat();
        }
}





