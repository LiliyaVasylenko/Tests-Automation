public class Person {

        int age;
        String name;
        public Person (int age,  String name){
            this.age = age;
            this.name = name;
        }

        public Person (){

        }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Person person = (Person) o;

        if (age != person.age) return false;
        return name.equals(person.name);
    }

    @Override
    public int hashCode() {
        int result = age;
        result = 31 * result + name.hashCode();
        return result;
    }

    public static void main(String[] args)  {
//        Person person1 = new Person(87, "Ivan");
//        Person person2 = new Person(87, "Petro");
//        Person person3 = new Person(87, "Ivan");
//        Person person4 = new Person();
//        Person person5 = new Person();
//
//
//        System.out.println(person1.hashCode());
//        System.out.println(person1.equals(person2));
//        System.out.println(person1.equals(person3));
//        System.out.println(person4.equals(person1));
//      //  System.out.println(person4.equals(person5));

        int a = 8;
        int b = 0;
        int result = 0;

        try {
           result = a/b;
        } catch (ArithmeticException e) {
            //System.out.println("found exeption " + e.getMessage());
//            e.printStackTrace("Div by 0");

        }

    }
}

