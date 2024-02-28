package Part1;

public class Triangle implements Shape {
    private float side1;
    private float side2;
    private float side3;

    public Triangle(float side1, float side2, float side3) {
        super();
        this.side1 = side1;
        this.side2 = side2;
        this.side3 = side3;
    }

    public float getSide1() {
        return side1;
    }

    public void setSide1(float side1) {
        this.side1 = side1;
    }

    public float getSide2() {
        return side2;
    }

    public void setSide2(float side2) {
        this.side2 = side2;
    }

    public float getSide3() {
        return side3;
    }

    public void setSide3(float side3) {
        this.side3 = side3;
    }

    @Override
    public double calculateArea() {
        float semi = (side1 + side2 + side3) / 2;
        double area = Math.sqrt(semi * (semi - side1) * (semi - side2) * (semi - side3));
        return Math.abs(area);
    }

    @Override
    public double calculatePerimeter() {
        return side1 + side2 + side3;
    }

}
