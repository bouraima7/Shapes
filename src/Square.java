public class Square extends Shapes{
    private double side;
    public Square (double side) {
        this.side = side;
    }

    @Override
    public double getArea() {
        double area;
        area = side * side;
        return area;
    }

    @Override
    public double getPerimeter() {
        return side + side + side;
    }
}
