package domain;

public class Rectangle {
    private final int length;
    private final int width;
    public Rectangle(int length, int width) {
        this.length = length;
        this.width = width;
    }
    public int getLength() {
        return length;
    }
    public int getWidth() {
        return width;
    }
    public int squareFeetCalculator() {
        return length * width;
    }
    public double squareMeterCalculator() {
        double target = 0.009290304;
        return squareFeetCalculator() * target;
    }

}
