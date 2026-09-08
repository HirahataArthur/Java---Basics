package arithmeticoperators;


public class Main{ //addition
    public static void main(String[] args){
       float n1 = 3;
       float n2 = 5;
       float a = (n1 + n2)/2;
        System.out.printf("Average values of %f and %f is equal to %.1f \n", n1, n2, a);


        int number = 5;
        number++;
        System.out.printf("value of 'number' is: %d\n", number);

        int n3 = 4;
        n3 *= 2;
        System.out.printf("value of 'n2': %d \n", n3);


        double n8 = Math.abs(-10); //absolute
        System.out.print(n8 + "\n");

        double n4 = Math.sqrt(25); // square root
        System.out.print(n4 + "\n");

        double n5 = Math.ceil(3.3); //round up
        System.out.print(n5 + "\n");

        double n6 = Math.floor(3.9); // round down
        System.out.print(n6 + "\n");

        double n7 = Math.random(); //random number
        System.out.print(n7 + "\n");

        double ran = Math.random(); //limiting the possible outcomes
        int n9 = (int) (5+ ran * (100-5));
        System.out.print(n9 + "\n");

    }
}