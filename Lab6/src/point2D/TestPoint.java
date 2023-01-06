package point2D;

public class TestPoint {
    public static void main(String[] args) {
        Point2D point2D1 = new Point2D();
        System.out.println("Point 2D-1: " + point2D1);

        Point2D point2D2 = new Point2D(1.3f, 0.3f);
        System.out.println("Point 2D-2: " + point2D2);

        Point3D point3D1 = new Point3D();
        System.out.println("Point 3D-1: " + point3D1);

        Point3D point3D2 = new Point3D(0.4f, 1.2f,0.4f);
        System.out.println("Point 3D-2: " + point3D2);
    }
}
