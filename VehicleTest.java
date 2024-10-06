// Base Class: Vehicle
class Vehicle {
    public void move() {
        System.out.println("Vehicle is moving");
    }
}

// Subclass: Car
class Car extends Vehicle {
    @Override
    public void move() {
        System.out.println("Car is driving on the road");
    }
}

// Subclass: Bike
class Bike extends Vehicle {
    @Override
    public void move() {
        System.out.println("Bike is riding on the road");
    }
}

// Subclass: Boat
class Boat extends Vehicle {
    @Override
    public void move() {
        System.out.println("Boat is sailing on the water");
    }
}

public class VehicleTest {
    public static void main(String[] args) {
        Vehicle v1 = new Car();
        Vehicle v2 = new Bike();
        Vehicle v3 = new Boat();

        v1.move();  // Output: Car is driving on the road
        v2.move();  // Output: Bike is riding on the road
        v3.move();  // Output: Boat is sailing on the water
    }
}
