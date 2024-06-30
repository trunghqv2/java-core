public class Test {
    public static void main(String[] args) {
        Circles circle = new Circles(2.5, "red");
        System.out.println(circle);
        System.out.println("Area: " + circle.getArea());

        Cylinder cylinder = new Cylinder(5, "blue", 5);
        System.out.println(cylinder);
        System.out.println("Volume: " + cylinder.getVolume());
    }
}