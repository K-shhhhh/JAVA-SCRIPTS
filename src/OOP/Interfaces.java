

interface Animal{
    int EYES = 2; // value fixed for all
    void walk(); // no need to write public
    // Animal(){} ---> Cannot make constructor
    /*
    eat(){
        Systm.out.print("it eats") ----> Cannot create non-abstract/defined methods   
    }
     */

}

// interface Herbivore {
//     void type();
// }

class Horse implements Animal{ // multiple inheritance 
    public void walk(){
        System.out.println("Walks on 4 legs abc");
    }
    // public void type(){
    //     System.out.println("I only eat veg food");
    // }
}

class Chicken implements Animal{
    public void walk(){
        System.out.println("Walks on 2 legs");
    }
}

public class Interfaces {
    public static void main(String[] args) {
        Horse h1 = new Horse();
        h1.walk();
        // h1.type();
        System.out.println("\n");
        Chicken c1 = new Chicken();
        c1.walk();
    }
}
/*
Use implements keyword, like extends for classes to perform inheritance

Characterstics of Interfaces

    1. all the fields are public static and final by defualt
    2. all methods are public and abstract by default
    3. a class that implements an interface must implement all methods declared in it
    4. interfaces support the functionality of multiple inheritance


 */

