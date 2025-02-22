import java.util.Arrays;
import java.util.List;

public class Main {
    public static void main(String...arg) {
       ShapeFactroy shapeFactroy = new ShapeFactroy();
       shapeFactroy.registerShape("Circle", Circle::new);
       shapeFactroy.registerShape("Rectangle", () -> new Rectangle()); // both Circle::new and () -> new Rectangle() are same
       List<Shape> shapeList = Arrays.asList(shapeFactroy.getShape("Circle"),
                                             shapeFactroy.getShape("Rectangle"));
       for (Shape shape: shapeList) {
           shape.draw();
       }


    }
}
