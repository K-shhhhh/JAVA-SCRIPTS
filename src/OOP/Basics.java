
class Pen{
    String color;
    String type; // ballpoint or gel or fountain

    public void write(){
        System.out.println("writing something");
    }

    public void printColor(){
        System.out.println(this.color); // this is a keyword which will print the color of the pen that calls it
    }

    public void printType(){
        System.out.println(this.type); // this is a keyword which will print the type of the pen that calls it
    }
}

public class Basics {
    public static void main(String[] args) {
        Pen pen1 = new Pen(); // new keyword makes a heap in memory for the new object, p1 in this case
        pen1.color = "black";
        pen1.type = "gel";

        Pen pen2 = new Pen();
        pen2.color = "blue";
        pen2.type = "fountain";

        
        pen1.write();
        System.out.println("\n");
        pen1.printColor();
        pen1.printType();
        System.out.println("\n");
        pen2.printColor();
        pen2.printType();
    }
}
