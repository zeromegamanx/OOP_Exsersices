package cylinder;

public class TestCylinder {
    public static void main(String[] args) {
        Cylinder cylinder1 = new Cylinder();
        System.out.println("CircleAndCylinder.Cylinder:"
            + " radius=" + cylinder1.getRadius()
            + " height=" + cylinder1.getHeight()
            + " base area= " + cylinder1.getArea()
            + " volumn=" + cylinder1.getVolumn());

        Cylinder cylinder2 = new Cylinder(10.0);
        System.out.println("CircleAndCylinder.Cylinder:"
                + " radius=" + cylinder2.getRadius()
                + " height=" + cylinder2.getHeight()
                + " base area= " + cylinder2.getArea()
                + " volumn=" + cylinder2.getVolumn());

        Cylinder cylinder3 = new Cylinder(2.0, 10.0);
        System.out.println("CircleAndCylinder.Cylinder:"
                + " radius=" + cylinder3.getRadius()
                + " height=" + cylinder3.getHeight()
                + " base area= " + cylinder3.getArea()
                + " volumn=" + cylinder3.getVolumn());
    }
}
