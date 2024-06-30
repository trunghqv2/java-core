public class testProgram {
    public static void main(String[] args) {
        Point point = new Point(1.5f, 2.5f);
        System.out.println(point); 

        MovablePoint movablePoint = new MovablePoint(1.5f, 2.5f, 0.5f, 0.5f);
        System.out.println(movablePoint);
        movablePoint.move();
        System.out.println(movablePoint); 
    }
}
