public class TestShapes {
    public static void main (String [] args){
        Shapes [] shape = new Shapes[3];
        shape[0] = new Circle(4.5);
        shape[1] = new Square(7);
        shape[2] = new Triangle(3);


        //for loop to iterate through array and display getName, getArea, getPerimeter
        for (Shapes shapes : shape){
            System.out.println("Shape: " + shapes.getName());
            System.out.println("Area: " + shapes.getArea());
            System.out.println("Perimeter: " + shapes.getPerimeter());
            System.out.println();
        }
    }
}
