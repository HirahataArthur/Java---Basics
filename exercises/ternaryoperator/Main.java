package ternaryoperator;

public class Main{
    public static void main(String[] args){
        int age = 18;
        String anws = (age>=18)?"NO":"YES";

        System.out.print("Are you a minor?\n-" + anws);

        String s1 = "Arthur";
        String s2 = "Mary";
        String anw = (s1== s2)?"YES":"NO";
        System.out.println("\nAre the number the same? " + anw);


        int x = 10;
        int y = 20;
        String aw = (y>x && y>18)?"YES":"NO"; //it only prints 'YES' if both conditions are true
        System.out.println("\nAre you a major?" + aw);

        int n1 = 18;
        int n2 = 65;
        String aw2 = (n1>n2 || n1>=18)?"yes":"no"; //it will fit even if only one condition is true
        System.out.println("\nAre you over 18? " + aw2);
    }
}