public class Main {
    public static void main(String...arg) {
        FactoryProducer factoryProducer = new FactoryProducer();

        AbstractFactory normalFactory = factoryProducer.getFactory(true);

        Shape normalCircle = normalFactory.createCircle();
        Shape normalRectangle = normalFactory.createRectangle();
        normalCircle.draw();
        normalRectangle.draw();



        AbstractFactory roundedFactory = factoryProducer.getFactory(false);
        Shape roundedCircle = roundedFactory.createCircle();
        Shape roundedRectangle = roundedFactory.createRectangle();

        roundedCircle.draw();
        roundedRectangle.draw();




        //TODO: This can more optimized using registry
    }
}
