package conditionals;
import java.util.Scanner;

public class Switch{
    public static void main(String[] args){


        try {
            Scanner scanner = new Scanner(System.in);
            System.out.print("How many legs does it have? \n");
            int legs = scanner.nextInt();

            //With switch, we can limit the responses to expected inputs
            switch (legs){
                case 0: //executes if legs == 0
                    System.out.print("No legs: Snakes, Fish, or Earthworms.");
                    break;
                case 2:
                    System.out.print("Bipeds: Humans, Birds, and Kangaroos.");
                    break;
                case 4:
                    System.out.print("Quadrupeds: Dogs, Cats, Horses, and Frogs.");
                    break;
                case 6:
                    System.out.print("Insects: Ants, Bees, and Butterflies");
                    break;
                case 8:
                    System.out.print("Arachnids & Cephalopods: Spiders, Scorpions, and Octopuses.");
                    break;
                case 10:
                    System.out.print("Decapod Crustaceans: Crabs, Lobsters, and Shrimp.");
                    break;
                default: //default case - In none match
                    if (legs > 10) {
                        System.out.print("Myriapods: Centipedes and Millipedes.");
                    } else {
                        System.out.print("Invalid or unknown number of legs!");
                    }
        }
        } catch (Exception e) {
            System.out.println("Exception: " + e);;
        }
    }
}