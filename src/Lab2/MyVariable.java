package Lab2;

import java.util.function.ToLongBiFunction;

public class MyVariable {
    public static void main(String[] args) {

        //integer จำนวนเต็ม เช่น 10 0 -10
            int x; //ประกาศตัวแปรชื่อ x สำหรับเก็บข้อมูลจำนวนเต็ม
        x = 10; // กำหนดตัวแปร x มีค่าเท่ากับ10
        System.out.println("x="+x);
        int y = 20; //ประกาศตัวแปรชื่อ y และกำหนดค่าให้เท่ากับ 20
        System.out.println("y="+y);
        System.out.println("x+y="+(x+y)); // x+y =30

        //real number จำนวนจริง เช่น 10.00 -555.36 78.21
        float f =10.10f;
        System.out.println(f);
        double d = 45; //?
        System.out.println(d);

        //character ตัวอักษรเพียง 1 ตัวเท่านั้น เช่น # $ % A a
        char c = 'c';
        System.out.println(c);
        //boolean เก็บค่า true (1) และ False (0)
        boolean b = true;
        System.out.println(b);
        System.out.println(!b);

        //String เป็นคลาสในภาษา Java ใช้สำหรับเก็บข้อมูลชนด ข้อความ
        String s ="Management Technology";


        System.out.println(s);
        System.out.println(s.length()); //คืนค่ากลับมาเป็น จำนวนเต็ม
        System.out.println(s.toUpperCase()); //แปลอักขระเป็นพิมพ์ใหญ่
        System.out.println(s.toLowerCase()); //แปลอักขระเป็นพิมพ์ใหญ่
        System.out.println(s.charAt(5)); //





    }//main

}//class
