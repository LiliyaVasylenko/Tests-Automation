/**
 * Created by Liliia.Vasylenko on 20.11.2017.
 */
public class StringClass {

    public static void main(String[] args) {
        String testString1 = "Automation";
        String testString2 = "Testing";
        String testString3 = "Testing";
        String testString4 = "testing";
        String testString5 = "Automation testing + Java";
        String testString6 = " Automation  ";
        int char1 = 0;
        int char2 = 1;
        int char3 = 7;


        // char charAt (int index)
        System.out.println("----------------------------------- charAt-- ---------------------------------------------");
        System.out.println("The " + char1 + " symbol of " + testString1 + " is: " + testString1.charAt(char1));
        System.out.println("The " + char2 + " symbol of " + testString2 + " is: " + testString2.charAt(char2));
        System.out.println("The " + char3 + " symbol of " + testString1 + " is: " + testString1.charAt(char3));
        System.out.println();

        // concat
        System.out.println("-------------------------------- concat-- ------------------------------------------------");
        System.out.println(testString1.concat(" ".concat(testString2)));
        System.out.println(testString1.concat(" course"));
        System.out.println();

        //endsWith & startsWith
        System.out.println("-------------------------- endsWith & startsWith ------------------------------------------");
        if (testString1.startsWith("Auto") & testString1.endsWith("tion")) {
            System.out.println(testString1 + " начинается на 'Auto'" + " заканчивается на 'tion'");
        } else {
            System.out.println(testString1 + " не начинается на 'Auto'" + " или не заканчивается на 'tion'");
        }
        System.out.println();


        //equils
        System.out.println("------------------------------equils, equalsIgnoreCase-------------------------------------");
        if (testString1.equals(testString2)) {
            System.out.println(testString1 + " and " + testString2 + " совпадают");
        } else if (testString2.equals(testString3)) {
            System.out.println(testString2 + " and " + testString3 + " совпадают");
        } else if (testString1.equals(testString3)) {
            System.out.println(testString1 + " and " + testString3 + " совпадают");
        } else {
            System.out.println("Строки не совпадают");
        }

        if (testString1.equalsIgnoreCase(testString3)) {
            System.out.println(testString1 + " and " + testString3 + " совпадают без учёта регистра");
        } else {
            System.out.println("Строки не совпадают");
        }


        if (testString3.equalsIgnoreCase(testString4)) {
            System.out.println(testString3 + " and " + testString4 + " совпадают без учёта регистра");
        } else {
            System.out.println("Строки не совпадают");
        }
        System.out.println();


        // indexOf
        System.out.println("--------------------------------------indexOf----------------------------------------------");
        System.out.println("Индекс 'u' для " + testString1 + ": " + (testString1.indexOf('u')));
        System.out.println("Индекс 't' для " + testString1 + ",  начиная с позиции start 3: " + (testString1.indexOf('t', 3)));
        System.out.println("Hомер последней встречной позиции 'o' для " + testString1 + ": " + (testString1.lastIndexOf('o')));
        System.out.println("Hомер последней встречной позиции 'ti' для " + testString1 + ": " + (testString1.lastIndexOf("ti")));
        System.out.println();


        // length
        System.out.println("----------------------------------------length--------------------------------------------");
        System.out.println("Длина " + testString1 + ": " + (testString1.length()));
        System.out.println();


        // replace
        System.out.println("-----------------------------------------replace-----------------------------------------");
        System.out.println("Замена символа 'A' на 'a' для " + testString1 + ": " + (testString1.replace('A', 'a')));
        System.out.println();


        // split
        System.out.println("-----------------------------------------split--------------------------------------------");
        String testString5Array[] = testString5.split(" ");
        System.out.println("Строка " +" '" + testString5 + "'" + " разделена на: ");
        for (String elementOfArray : testString5Array) {
            System.out.println(elementOfArray);
        }
        System.out.println();


        // substring
        System.out.println("-----------------------------------------substring-----------------------------------------");
        System.out.println("Новая строка с символами из " + testString1 + "," + " начиная с конкретной позиции: " +(testString1.substring(4)));
        System.out.println( "Новая строка с символами из " + testString1 + "," + " начиная и заканчивая с конкретной позиции: " + (testString1.substring(4, 7)));
        System.out.println();

        // toCharArray
        System.out.println("--------------------------------------toCharArray------------------------------------------");
        char[] charArray = testString5.toCharArray();
        System.out.println("12 елемент в массивe: " + (charArray[12]));
        System.out.println();


        // toLowerCase, toUpperCase
        System.out.println("---------------------------------toLowerCase, toUpperCase----------------------------------");
        System.out.println("Нижний регистр для " + testString1 + ": " + testString1.toLowerCase());
        System.out.println("Верхний регистр для " + testString1 + ": " + testString1.toUpperCase());
        System.out.println();


        // trim
        System.out.println("-----------------------------------------trim----------------------------------------------");
        System.out.println("Нет пробелов в начале и в конце " + "'" + testString6 +"': " + (testString6.trim()));


    }
}
