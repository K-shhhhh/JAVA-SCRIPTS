class Student{ // name of constructor and class should be same
    String name; // class will never return anything
    int age;

    public void printInfo(){
        System.out.println(this.name); // "this" keyword is a reference to the current object within a class. look at example for more clarity
        System.out.println(this.age);
    }

    // student() is called constructor
    // can be created once only
    // types of constructors : 
    // 1. non parameterized : java makes this automatically with no value but we can make if we want, no return type 
    // 2. parameterized : we can initialize object in this and then just pass the values while calling constructor
    Student(String NAME, int AGE){
        this.name = NAME; // NAME and name is different 
        this.age = AGE; // AGE and age is different
        System.out.println("\nOBJECT CREATED");
    }
    // 3. copy constructors : to copy one object to another, rarely used
    // Student(Student s2){
    //  this.name = s2.name;
    //  this.age = s2.age;
    // }
    
    // Student(){ // made this empty constructor just to define  
    
    // }

    
}

public class Constructors {
    public static void main(String args[]) {
        Student s1 = new Student("Krish", 21); // call constructor only after creating object
        // s1.name = "krish"; // use "." to access methods 
        // s1.age = 21;
        s1.printInfo();
        Student s2 = new Student("Zoya", 21);
        // s2.name = "zoya";
        // s2.age = 21;
        s2.printInfo();

        /*
        there are disructors in java aswell, but we dont need to write them as java makes it automatically
        and stores all the values, variables that are not used are taking some memory in a garbage bin 
        */
    }
}
