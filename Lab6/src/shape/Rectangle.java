package shape;

public class Rectangle extends Shape {
    private static double width;
    private double length;

    public Rectangle(){
        width = 1.0;
        length = 1.0;
    }

    public Rectangle(double length, double width){
        this.length = length;
        this.width = width;
    }

    public Rectangle(double width, double length, String color){
        super();
        this.width = width;
        this.length = length;
    }

    public static double getWidth() {
        return width;
    }

    public void setWidth(double width) {
        this.width = width;
    }

    public double getLength() {
        return length;
    }

    public void setLength(double length) {
        this.length = length;
    }

    public double getArea() {
        return this.width * this.length;
    }

    public double getPerimeter(){
        return 2 * (this.length + this.width);
    }

    @Override
    public String toString() {
        return "Shape.Rectangle[" + super.toString() + ", width=" + this.width + ", length=" + this.length + "]";
    }
}
