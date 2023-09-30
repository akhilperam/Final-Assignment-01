/*
 * 2. Write a Java program to invoke parent class constructor from a child class. Create
      Child class object and parent class constructor must be invoked. Demonstrate by
      writing a program. Also explain key points about Constructor.
 * 
 * 
 */
// Parent class
class Parent {
    public Parent() {
        System.out.println("Parent class constructor invoked");
    }
}

// Child class
class Child extends Parent {
    public Child() {
        super(); // Invoking parent class constructor
        System.out.println("Child class constructor invoked");
    }
}

// Main class
public class QUESTION02 {
    public static void main(String[] args) {
        Child child = new Child();
    }
}

/*
 KEYPOINTS OF A CONSTRUCTOR:
 
 > Constructor which is to be with particular class name.
 > Where Constructor is parameterized or zero Parameterized which is known as Default constructor.
 > In Constructor there is no return type.
 > We can also Overload a constructor with different parameters.
 > In constructor, default method is super method which calls parent class constructor.By avoiding this calling parent class constructor
   instead of same class constructor go for this method.
*/
