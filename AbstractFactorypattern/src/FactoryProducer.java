public class FactoryProducer {
    public AbstractFactory getFactory(boolean isNormal) {
        if (isNormal) {
            return new NormalFactory();
        }
        else {
            return new RoundedFactory();
        }
    }
}
