public class Circle extends Shapes{
    private double diameters;

    public Circle (double diameter) {
        this.diameters = diameter;
    }

    @Override
    public double getArea() {
        double radius = diameters /2;
        return Math.PI * (radius * radius); // PI r squared
    }

    @Override
    public double getPerimeter() {

        double perimeter;
        perimeter = Math.PI * 2 * (diameters/2);
        return perimeter;
    }
}
