abstract class Shapes {

    /*
     getArea – Which calculates the area of the shape and returns that value as a double.
     getPerimeter – Which calculates the perimeter of the shape and return that value as
     a double.
     And one concrete method:
     getName – that returns the shape’s name as a String.
     */
    public abstract double getArea();
    public abstract double getPerimeter();
    public String getName(){
        return this.getClass().getSimpleName();
    }


}
