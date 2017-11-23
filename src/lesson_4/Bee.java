package lesson_4;

public class Bee extends Insect  implements Attack{
    private Attack attack;
//    int size = 78;
//   String color = "black";



    public Bee(int size, String color) {
        super(size, color);
        this.attack = new AttackImpl("77", "88");
    }


    public Bee (int size, String color, Attack attack) {
        super(size, color);
        this.attack = attack;
    }


    public void move () {
        attack.move();
    }

    public void attack () {
        attack.attack();
    }
}
