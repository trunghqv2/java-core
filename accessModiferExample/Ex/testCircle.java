public class testCircle {
    public static void main(String[] args) {
        Circle circle1 = new Circle();
        Circle circle2 = new Circle(5);

        System.out.println("Circle 1 - Radius: " + circle1.getRadius() + ", Area: " + circle1.getArea() + ", Color: " + circle1.getColor());
        System.out.println("Circle 2 - Radius: " + circle2.getRadius() + ", Area: " + circle2.getArea()+ ", Color: " + circle2.getColor());
    }
}
