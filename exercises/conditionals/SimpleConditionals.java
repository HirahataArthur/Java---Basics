package conditionals;
import java.util.Scanner;


public class SimpleConditionals{
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        System.out.print("Insert your first grade: ");
        float n1 = scanner.nextFloat();
        System.out.print("Insert your second grade: ");
        float n2 = scanner.nextFloat();
        float a = (n1+n2)/2;
        System.out.print("Your average was: " + String.format("%.1f", a));
        if (a>7){
            System.out.println("\nCongratulations!");
        } else {
            System.out.println("\nYou should study more");
        }

        

    }
}