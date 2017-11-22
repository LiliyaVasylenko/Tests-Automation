package lesson_2;

public class Fibonacci {
    public static void main(String[] args) {
        Fibonacci fibonacci = new Fibonacci();
        fibonacci.printFibonacciNumbers(10);
    }

    void  printFibonacciNumbers(int counter) {
        int fn0 = 0;
        int fn1 = 1;
        System.out.println("Числа Фибоначчи для 0-" + counter + ":");

        for (int n = 0; n <= counter; n++) {
            if (n == 0) {
                System.out.println(fn0);
            } else if (n == 1) {
                System.out.println(fn1);
            }
            else {
                fn1 = fn1 + fn0;
                fn0 = fn1 - fn0;
                System.out.println(fn1);
            }
        }
    }
}







