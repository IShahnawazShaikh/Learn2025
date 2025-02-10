public class ExtraCheese extends Toppings {

    private BasePizza basePizza;

    ExtraCheese(BasePizza basePizza) {
      this.basePizza = basePizza;
    }
    @Override
    public int cost() {
        return basePizza.cost() + 50;  // extra cost for cheese
    }
}
