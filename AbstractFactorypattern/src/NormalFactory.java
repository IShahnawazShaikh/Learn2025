public class NormalFactory implements AbstractFactory{
    @Override
    public Shape createCircle() {
        return new NormalCircle();
    }

    @Override
    public Shape createRectangle() {
        return new NormalRectangle();
    }
}
