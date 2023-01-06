package Shape;

public class Square extends Rectangle{
    double side;

    public Square() {
        super();
        this.side = side;
    }

    public Square(double side, String color, boolean filled) {
        super();
        this.side = side;
    }

    public double getSide() {
        return side;
    }

    public void setSide(double side) {
        this.side = side;
    }

    public void setWidth(double width) {
        this.width = width;
    }

    public void setLength(double length) {
        this.length = length;
    }

     @Override
     public String toString() {
         return "Square{" +
                 "width=" + width +
                 ", length=" + length +
                 ", color='" + color + '\'' +
                 ", filled=" + filled +
                 '}';
     }
}
