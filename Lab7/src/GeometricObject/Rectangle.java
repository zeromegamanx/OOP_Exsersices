package GeometricObject;

import java.awt.*;

public class Rectangle implements GeometricObject {
    double width;
    double length;

    public Rectangle(double width, double length) {
        this.length = length;
        this.width = width;
    }

    public double getArea() {
        return width * length;
    }

    public double getPerimeter() {
        return 2 * (width + length);
    }

    @Override
    public String toString() {
        return "Rectangle{" +
                "width=" + width +
                ", length=" + length +
                '}';
    }
}
