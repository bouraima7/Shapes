public class Triangle extends Shapes{

    private double side;
    public Triangle (double sides) {
        this.side = sides;
    }

    @Override
    public double getArea() {
        //base * height / 2 = area of triangle
        double area;
        area = (side * side) /2;

        return area;
    }

    @Override
    public double getPerimeter() {
        return side + side + side;
    }
}
