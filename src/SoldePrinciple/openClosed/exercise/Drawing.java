package SoldePrinciple.openClosed.exercise;

public class Drawing {
    void drawShape(Shape shape) {
        if (shape instanceof Circle) {
            drawCircle((Circle) shape);
        } else if (shape instanceof Square) {
            drawSquare((Square) shape);
        }
    }

    void drawCircle(Circle circle) {
        System.out.println("Drawing a circle");
        // Draw circle logic
    }

    void drawSquare(Square square) {
        System.out.println("Drawing a square");
        // Draw square logic
    }
}
