/*
 * 5. Demonstrate the difference between abstract class and interface by writing programs
      as well as in keypoints.
      
      
      
      
      Abstract class:                                              Interface:
* Abstract class having abstract                                    * In terrace having abstract methods
 Methods and non abstract methods

*Abstract class doesn’t support                                     * Interface support multiple inheritance
Multiple inheritance

* Abstract class having final &                                     * Interface having only final and static methods
 Non final and static and
Non-static variables

* Abstract can provide implementation of interface                  * Interface cannot  provide implementation of abstract class.

* It can done through using keyword                                 * It can don through interface keyword.
  Abstract
 * 
 */
abstract class Animal {
    protected String name;

    public Animal(String name) {
        this.name = name;
    }

    public abstract void sound();
}

class Dog extends Animal {
    public Dog(String name) {
        super(name);
    }

    public void sound() {
        System.out.println("The dog " + name + " barks");
    }
}

public class QUESTION05 {
    public static void main(String[] args) {
        Dog dog = new Dog("Buddy");
        dog.sound();
    }
}
	


interface Vehicle {
    void start();
    void stop();
}

class Car implements Vehicle {
    public void start() {
        System.out.println("Car started.");
    }

    public void stop() {
        System.out.println("Car stopped.");
    }
}

class Bike implements Vehicle {
    public void start() {
        System.out.println("Bike started.");
    }

    public void stop() {
        System.out.println("Bike stopped.");
    }


public class main {
    public void main(String[] args) {
        Car car = new Car();
        car.start();
        car.stop();

        Bike bike = new Bike();
        bike.start();
        bike.stop();
    }
}
}

