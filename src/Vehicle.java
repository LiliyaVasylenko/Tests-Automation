public class Vehicle {
    String color;
    String number;
    double mileage;

    // constructor by default
    public Vehicle() {
        color = "yellow";
        number = "AX1111";
        mileage = 1111.8;
    }

    // my constructor
    public Vehicle(String color, String number, double mileage) {
        this.color = color;
        this.number = number;
        this.mileage = mileage;
    }

    public String toString () {
        return  " Color is " + this.color+ "; " + "Number is " + this.number + "; " + "Mileage is "  + this. mileage + "km;";
    }
}


