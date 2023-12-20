/*Design following class hierarchies.
Data members are private, constructors and methods are public. Test the methods of all classes
by creating objects of Cylinder class in the main method under another class.*/

public class Shapes {
    public static void main(String[] args) {
        Cylinder obj = new Cylinder(2,4,1,2);
        obj.printCylinder();
    }
}
class Cylinder extends Circle{
    private int height;
    Cylinder(int height, int radius, int xCo, int yCo){
        super(radius, xCo, yCo);
        this.height = height;

    }
    public void printCylinder(){
        System.out.println("The height of the cylinder is: "+height);
        printCircle();
    }
}
class Circle extends Point{
    int radius;
    Circle(int radius, int xCo, int yCo){
        super(xCo,yCo);
        this.radius = radius;
    }
    public void printCircle(){
        System.out.println("The radius of the circle is: "+radius);
        printPoint();
    }
}

class Point{
    int xCo,yCo;
    Point(int xCo, int yCo){
        this.xCo = xCo;
        this.yCo = yCo;
    }
    public void printPoint(){
        System.out.println("The Coordinates of the circle are: ("+xCo+","+yCo+")");
    }
}
