package cylinder;

public class Cylinder extends Circle {
    private double height;

    public Cylinder(){
        super();
        height = 1.0;
    }

    public Cylinder(double height){
        super();
        this.height = height;
    }

    public Cylinder(double radius, double height){
        super(radius);
        this.height = height;
    }

    public double getHeight() {
        return height;
    }

    public void setHeight(double height) {
        this.height = height;
    }

    public double getVolumn(){
        return getArea() * height;
    }
}
