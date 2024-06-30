public class Square extends Rectangle implements Resizeable {
    public Square() {
        super(1.0, 1.0);
    }

    public Square(double side) {
        super(side, side);
    }

    public double getSide() {
        return getWidth();
    }

    public void setSide(double side) {
        setWidth(side);
        setHeight(side);
    }

    @Override
    public String toString() {
        return "Square[side=" + getSide() + "]";
    }

    @Override
    public void resize(double percent) {
        setSide(getSide() * (1 + percent / 100));
    }
}
