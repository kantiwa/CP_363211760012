package Excercise;

import java.util.Scanner;

public class Excercise_Led3_1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in) ;
        double total = 0;
        for (int i = 0; i < 5; i++) {
            System.out.print("Enter number: ");
            double num =sc.nextDouble();
            total += num;  //total = total+num


            //find avarage value
            double avg = total / 5;

            //display
            System.out.print("Total: "+ total);
            System.out.print("Average: "+ avg);
    }










    }



}
