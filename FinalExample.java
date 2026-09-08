final class Vehicle {
    void displayVehicle() {
        System.out.println("This is a final class.");
    }
}
class Animal {
    final void sound() {
        System.out.println("Animals make sounds.");
    }
}
class Dog extends Animal {
    void displayDog() {
        System.out.println("Dog barks.");
    }
}
public class FinalExample {
    public static void main(String[] args) {
        final int MAX = 100;
        System.out.println("Final Variable: " + MAX);
        Dog d = new Dog();
        d.sound();
        d.displayDog();
        Vehicle v = new Vehicle();
        v.displayVehicle();
    }
}



