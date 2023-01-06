public class CircleComputation {
    public static void main(String[] args) {
        double radius = 2.3;
        double diameter = 2.0 * radius;
        double circumference = Math.PI * radius * radius;
        double area = 2.0 * Math.PI * radius;
        System.out.printf("Radius is: %.2f%n", radius);
        System.out.printf("Circumference is: %.2f%n", circumference);
        System.out.printf("Area is: %.2f%n", area);
        System.out.printf("Diameter is: %.2f%n", diameter);
    }
}
