package lesson_4;

public class BreedBee {
    public static void main(String[] args) {

        Bee breed1 = new Bee(12, "red", new AttackImpl("fly", "sting"));
        Bee breed2 = new Bee(8, "yellow", new AttackImpl("sit", "bite"));
        Bee breed3 = new Bee(45, "blue");

        breed1.move();
        breed1.attack();

        System.out.println("-------------------");
        breed2.move();
        breed2.attack();

        System.out.println("-------------------");
        breed3.attack();
        breed3.move();



    }
}
