package Excercise;

import java.util.Scanner;

public class Excercise_Led3_3 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print( ("Enter an integer: ");
        int num = sc.nextInt();

        for (int i = 1; i <=12 ; i++) {
            System.out.print((num+" x"+i+" = "+(num*i));
        }
    }


}
