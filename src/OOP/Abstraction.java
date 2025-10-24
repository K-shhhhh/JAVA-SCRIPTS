abstract class Animal{    // due to abstract keyword, this class exists, but we cant use it directly
                         
    abstract void walk(); // due to abstract keyword, this method exists, but we cant use it directly 
    
    Animal(){ // in abstract class, we can create constructors
        System.out.println("Creating a new animal");
    }

    public void eat(){    // although in abstract class, other classes can use this method
        System.out.println("It eats");
    }
}

class Horse extends Animal{
    Horse(){
        System.out.println("Horse created");
    }
    public void walk(){
        System.out.println("Walks on 4 legs");
    }
}

class Chicken extends Animal {
    Chicken(){
        System.out.println("Chicken created");
    }
    public void walk(){
        System.out.println("Walks on 2 legs");
    }
}

public class Abstraction {
    public static void main(String[] args) {
        Horse h1 = new Horse();
        h1.walk();
        h1.eat();
        System.out.println("\n");
        Chicken c1 = new Chicken();
        c1.walk();
        c1.eat();
        // cannot make animal object
    }
}

/*
"Data Hiding" is the process of protecting members of class from unintended changes.
"Abstraction" is hiding the implementation details and showing only important/useful parts to therefore.

// no need to show user Animal class, thats why we use abstract

2 ways to use abstraction in java : 
    1. Use Abstract Keyword
    ->  no need to show user Animal class, thats why we use abstract
    -> we used abstract keyword in animal class and showed abstaction
    
    2. Make interfaces
    -> check Interfaces.java
*/
