package lesson_2;

/**
 * Created by Liliia.Vasylenko on 21.11.2017.
 */
public class NumberClass {
    public static void main(String[] args) {
        int a = 78;
        Integer b = 78;
        Double c = 78.76;
        Float d = 67.87f;
        System.out.println("toString" + b.toString());
        System.out.println(b.equals(a));
        System.out.println(b.byteValue());
        System.out.println(b.doubleValue());
        System.out.println(b.floatValue());
        System.out.println(b.intValue());
        System.out.println(b.compareTo(90));
        System.out.println(Math.abs(d));
    }


}
