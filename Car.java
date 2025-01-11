/*
public class Car {

    String make = "Chevrolet";
    String model = "Corvette";
    int year = 2020;
    String color = "blue";
    double price = 50000.00;

    void drive() {
        System.out.println("You drive the car");
    }
    void brake() {
        System.out.println("You step on the brakes");
    }
}
*/

/*
public class Car {

    String make = "Ford";
    String model = "Mustang";
    String color = "Red";
    int year = 2021;

    public String toString() {
    
        return make + "\n"+model+"\n"+color+"\n"+year;

    }
}
*/

/*
public class Car {

    String name;

    Car(String name) {
        this.name = name;
    }

}
*/

/*
public class Car extends Vehicle {


    int wheels = 4;
    int doors = 4;
}
*/

public class Car extends Vehicle {

    @Override
    public void go() {
        System.out.println("*The car begins moving*");
    }
}
