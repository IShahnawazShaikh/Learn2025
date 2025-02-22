import java.util.HashMap;
import java.util.Map;
import java.util.function.Supplier;

public class ShapeFactroy {

    Map<String, Supplier<Shape>> shapeMap = new HashMap<>();

    public Shape getShape(String shapeType) {
        Supplier<Shape> shapeSupplier = shapeMap.get(shapeType.toLowerCase());
        if (shapeSupplier != null) {
            return shapeSupplier.get();
        }
        throw new IllegalArgumentException("Invalid shape type: "+shapeType);
    }

    public void registerShape(String shapeType, Supplier<Shape> shapeSupplier) {
        shapeMap.put(shapeType.toLowerCase(), shapeSupplier);
    }
}
