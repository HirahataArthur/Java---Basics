package conditionals;
import java.util.Scanner;
import java.time.LocalDate; //more modern

public class ChainedCompoundConditionals{
    public static void main(String[] args){

        
        //based on the Brazilian voting system
        //practicing chained conditionals
        Scanner scanner = new Scanner(System.in);
        System.out.print("CAN I VOTE?\n");
        System.out.print("Please enter your age: ");
        int age = scanner.nextInt();

        if (age > 18){
            if (age > 70){
                System.out.println("OPTIONAL - FOR THOSE OVER 70 Y.O."); //executes if both conditions are TRUE
            } else{
                System.out.println("MANDATORY - FOR THOSE OVER 18 AND UNDER 70"); //executes if first condition is TRUE but second one is FALSE
            }
        } else {
            if (age >=16){
                System.out.println("OPTIONAL - FOR THOSE BETWEEN 16 AND 17 Y.O."); //executes if first condition is FALSE and second one is TRUE
            } else {
                System.out.println("VOTING IS PROHIBITED FOR THOSE UNDER 16"); //executes if both conditions are FALSE
            }
        }

        //Consulting retirement possibility in Brazil

        LocalDate today = LocalDate.now();
        int current_year = today.getYear(); // Returns 2026 for example


        System.out.print("CAN I RETIRE? \n"); //Based on retirement in Brazil
        System.out.print("Enter your year of birth: ");
        int year = scanner.nextInt();
        System.out.print("Enter the number of years of contribution(labor): ");
        int user_contribution = scanner.nextInt();
        int user_age = current_year - year;

        //chained conditions
        if (user_age > 60){
            if (user_contribution >= 15){
                System.out.print("YOU CAN RETIRE"); //executes if both conditions are TRUE
            } else{
                System.out.println("YOU CANNOT RETIRE DUE TO FEWER YEARS OF CONTRIBUTION THAN 15"); //Executes if first condition is TRUE but second is FALSE
            }
        } else {
            System.out.println("YOU CANNOT RETIRE DUE TO NOT ACHIEVING MINIMUM AGE"); //executes if both conditions are FALSE
        }


        //  It is important to clarify that there are many other aspects to consider regarding retirement in Brazil,
        //  such as gender and work environment (urban workers take longer to retire than rural workers).
    }
}