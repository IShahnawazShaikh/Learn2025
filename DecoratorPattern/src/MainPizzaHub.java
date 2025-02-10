public class MainPizzaHub {

    public static void main(String ...arg) {
        BasePizza margheritaBasePizza =  new MargheritaBasePizza();
        BasePizza margheritaPizzaWithCheese = new ExtraCheese(new MargheritaBasePizza());
        BasePizza margheritaPizzaWithMushroom = new Mushroom(new MargheritaBasePizza());
        BasePizza margheritaPizzaWithMushroomAndCheese = new ExtraCheese(new Mushroom(new MargheritaBasePizza()));

        System.out.println("Margherita Pizza without any Toppings "+ margheritaBasePizza.cost());
        System.out.println("Margherita Pizza with extra cheese : "+ margheritaPizzaWithCheese.cost());
        System.out.println("Margherita Pizza with extra mushroom : "+ margheritaPizzaWithMushroom.cost());
        System.out.println("Margherita Pizza with extra mushroom + Cheese : "+ margheritaPizzaWithMushroomAndCheese.cost());

        BasePizza veggieBasePizza =  new VeggieBasePizza();
        BasePizza veggieBasePizzaWithCheese = new ExtraCheese(veggieBasePizza);
        BasePizza veggieBasePizzaWithMushroom = new Mushroom(veggieBasePizza);
        BasePizza veggieBasePizzaWithMushroomAndCheese = new ExtraCheese(new Mushroom(veggieBasePizza));

        System.out.println("Veggie Pizza without any Toppings "+ veggieBasePizza.cost());
        System.out.println("Veggie Pizza with extra cheese : "+ veggieBasePizzaWithCheese.cost());
        System.out.println("Veggie Pizza with extra mushroom : "+ veggieBasePizzaWithMushroom.cost());
        System.out.println("Veggie Pizza with extra mushroom + Cheese : "+ veggieBasePizzaWithMushroomAndCheese.cost());


    }
}
