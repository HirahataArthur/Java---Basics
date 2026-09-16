package repetitionstructures;


public class Main{
    public static void main(String[] args){

        //USING WHILE
        int nn = 0;
        while (nn<=4){
            System.out.println("nn is equal to " + nn);
            nn++;
        }

        //WHILE WITH CONDITIONALS
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
        //INTERRUPTING WHILE
        int nn3 = 10;
        while (nn3>0){
            if (nn3 == 4){
                break;
            }
            System.out.println("NN3 is equal to: " + nn3);
            nn3--;
        }
    }
}