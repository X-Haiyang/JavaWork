package j1114;

public class Main {
    public static void main(String[] args) {
        Shape shape = new Shape(10, 20);

        Shape.Circle circle = shape.new Circle(5);
        circle.draw();  // 输出: Drawing Circle at (10, 20) with radius 5

        Shape.Square square = shape.new Square(10);
        square.draw();  // 输出: Drawing Square at (10, 20) with side 10
    }
}