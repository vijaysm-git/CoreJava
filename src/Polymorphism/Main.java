package Polymorphism;

public class Main {
    public static void main (String[] args){
        Shapes shape= new Shapes();
        Shapes circle=new Circle();
        Shapes  tri =  new Triangle();
        Shapes square = new Square();

        tri.area();
        square.area();
        shape.area();
    }
}
