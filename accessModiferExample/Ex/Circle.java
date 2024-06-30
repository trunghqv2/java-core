

public class Circle {
    private double radius = 1.0;
    private String color = "red";

    public Circle() {
    }
    public String getColor(){
        return color;
    }
    public Circle(double radius) {
        this.radius = radius;
    }

    protected double getRadius() {
        return radius;
    }

    protected double getArea() {
        return Math.PI * radius * radius;
    }
    
    // @Override
    // public String toString() {
        
    // }
}