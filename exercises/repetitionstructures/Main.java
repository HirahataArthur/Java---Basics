package repetitionstructures;
import java.util.Scanner;

public class Main{
    public static void main(String[] args){

        // Using a while loop
        int nn = 0;
        while (nn<=4){
            System.out.println("nn is equal to " + nn);
            nn++;
        }

        // While loop with conditionals
        int nn2 = 0;
        while(nn2<=10){
            if (nn2 == 0){
                System.out.println("NN2 is equal to zero: " + nn2);
            } else if ((nn2%2)==0){
                System.out.println("NN2 is an even number: " + nn2);
            } else {
                System.out.println("NN2 is an odd number: " + nn2);
            }
            nn2++;
        }
        // Interrupting a while loop
        int nn3 = 10;
        while (nn3>0){
            if (nn3 == 4){
                break;
            }
            System.out.println("NN3 is equal to: " + nn3);
            nn3--;
        }

        // Do-while loop
        int nn4 = 0;
        do{                         // Executes the code inside before checking the condition
            System.out.print(nn4 + "\n");
            nn4++;
        } while (nn4<=4);


        int nn5 = 7;
        do {
            System.out.println("This is an even number"); // Prints even though the condition returns false
        } while((7%2)==0); // Only possible because the computer runs the code before checking the condition

        //Example-1
        int n,s =0;
        String result;
        Scanner input = new Scanner(System.in);
        do {
            try {
                System.out.print("Type a number: ");
                n = input.nextInt();
                s += n;
            } catch (Exception e) {
                System.out.println("Please insert a valid number.\n");
                input.next();
            }

            System.out.print("Continue? [Y/N]\n");
            result = input.next().toUpperCase();
        } while (result.equals("Y"));
        System.out.print("Summing up all the entered values: " + s);
    }
}