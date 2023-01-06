package cylinder;

public class Circle {
    private double radius;
    private String color;

    public Circle(){
        this.radius = 1.0;
        this.color = "red";
    }

    public Circle(double radius){
        this.radius = radius;
    }

    public Circle(double radius, String color){
        this.radius = radius;
        this.color = color;
    }

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public double getArea(){
        return Math.PI * this.radius * this.radius;
    }

    @Override
    public String toString() {
        StringBuilder description = new StringBuilder();
        description.append("CircleAndCylinder.Circle[radius=")
                .append(this.radius)
                .append(",color=")
                .append(this.color)
                .append("]");
        return description.toString();
    }
}