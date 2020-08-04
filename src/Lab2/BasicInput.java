package Lab2;

import java.util.Scanner;

public class BasicInput {

    public static void  main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        String name;
        System.out.print("What is yous name? :");
        name = scanner.nextLine();
        System.out.println("Your name is "+name);

        System.out.print("What is yous major ? :");
        String major = scanner.nextLine();
        System.out.println("Your major is "+major);


        System.out.print("What is yous age ? :");
        String age = scanner.nextLine();
        System.out.println("Your age is "+age);

        System.out.print("What is yous email ? :");
        String email = scanner.nextLine();
        System.out.println("Your email is "+email);






}//main
    }//class