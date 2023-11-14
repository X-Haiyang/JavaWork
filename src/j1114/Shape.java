package j1114;

public class Shape {
    private int x, y;

    public Shape(int x, int y) {
        this.x = x;
        this.y = y;
    }

    // 内部类Circle
    public class Circle {
        private int radius;

        public Circle(int radius) {
            this.radius = radius;
        }

        public void draw() {
            System.out.println("Drawing Circle at (" + x + ", " + y + ") with radius " + radius);
        }
    }

    // 内部类Square
    public class Square {
        private int side;

        public Square(int side) {
            this.side = side;
        }

        public void draw() {
            System.out.println("Drawing Square at (" + x + ", " + y + ") with side " + side);
        }
    }
}
