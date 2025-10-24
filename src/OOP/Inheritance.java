class shape{
    String color;
    public void area(){
        System.out.println("display area");
    }
}

class triangle extends shape{ // single level inheritance
    public void area(int length, int hieght){
        System.out.println(0.5*length*hieght);
    }
}

class equilateralTriangle extends triangle{ // multilevel inheritance
    public void angle(){
        System.out.println("all angles are 60 degrees");
    }
}

class circle extends shape{ // heirarchial inheritance
    public void area(int r){
        System.out.println(3.14*r*r);
    }
}

public class Inheritance {
    public static void main(String[] args) {
        
        triangle t1 = new triangle();
        System.out.println(t1.color = "red"); // attribute of shape class
        t1.area(); // method of shape class
        t1.area(50, 50); // method of triangle class
        System.out.println("\n");
        
        equilateralTriangle e1 = new equilateralTriangle();
        e1.area(); // method of shape class
        e1.area(10, 10); // method of triangle class
        e1.angle(); // method of equilateralTriangle class
        System.out.println("\n");

        circle c1 = new circle();
        c1.area();
        c1.area(1);


    }
}


// Inheritance means passing down some attributes from top to bottom
// we can do that by using extends keyword
// inheritance helps us get rid of redundantly defining attributes
// the class which gives properties is called base/parent class
// the class which takes/ inherits propertis is called sub/child class
// types of inheritance : 
//  1. Single level inheritance : 1 parent class 1 with 1child class (example : shape, triangle)
//  2. Multilevel inheritance : 1 *parent* class with 1 parent class with 1 child class (example : shape, triangle, equilateral triangle) 
//  3. Hierarchial inheritance : 1 parent class with different 2 child classes (example : shape, traingle, circle)
//  4. Hybrid inheritance (uses all of the above ) : 1 **parent** class has branches and multilevel or hierachial or single level inheritance run in that branch