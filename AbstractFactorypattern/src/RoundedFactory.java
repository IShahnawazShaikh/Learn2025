public class RoundedFactory implements AbstractFactory{
    @Override
    public Shape createCircle() {
        return new RoundedCircle();
    }

    @Override
    public Shape createRectangle() {
        return new RoundedRectangle();
    }

}
