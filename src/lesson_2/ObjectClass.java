package lesson_2;

class ObjectClass {
    public static void main(String[ ] args) {
        Vehicle car1 = new Vehicle("blue", "AI8978", 5600);
        Vehicle car2 = new Vehicle();// by default
        Vehicle car3 = new Vehicle();// by default
        Vehicle car4 = new Vehicle("blue", "AI8978", 5600);

        // Object.toString - returns a string representation of the object.
        System.out.println("toString for car1:" + car1.toString());
        System.out.println("toString for car2:" + car2.toString());
        System.out.println();

        // Object.hashCode - returns  hash code value for the object
        System.out.println("hashCode for car3: " + car3.hashCode());
        System.out.println();

        //Object.equals
        System.out.println("equals between car1 and car2: " + car1.equals(car2));
        System.out.println("equals between car1 and car4: " + car1.equals(car4));
        System.out.println();

        // Object.getClass - returns the runtime class of this Object
        System.out.println("getClass for car1: " + car1.getClass());
    }
}