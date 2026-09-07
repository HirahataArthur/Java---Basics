package datatypes;

import java.util.Scanner;

public class Main{
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        System.out.print("Insert student's name:");
        String name = scanner.nextLine();
        System.out.print("insert student's grade: ");
        float grade = scanner.nextFloat();
        System.out.format("A nota de %s é %.1f", name, grade);
    }
}



