package others;

import java.util.Scanner;

public class Person {
    public static void main(String[] args) {
        ty(0, 4, 3);
    }

    static  double ty(int a, int b, int c) {
        double d = Math.pow(b, 2) - 4 * a * c;
        double x1 = (-b + Math.sqrt(d)) / 2 * a;
        double x2 = (-b - Math.sqrt(d)) / 2 * a;

        if (b == 0) {
            System.out.println("It's not ...");
        }

        try {
            if (d > 0) {
               // return x1;

                return x2;

            } else if (d == 0) {
                return x1;
            } else if (d < 0) {
                System.out.println("error");
                return 0;
            }
            else return 0;
       }
       catch (Exception e){
            System.out.println(e.toString());
    }
         return 0;

    }
}




