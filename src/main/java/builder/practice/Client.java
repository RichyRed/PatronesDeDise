package builder.practice;

public class Client {
    public static void main(String[] args) {
        Restaurant nostra = new Restaurant();
        BuilderPizza pizzaCarnivora = new PizzaCarnivora();
        BuilderPizza pizzaHawaina = new PizzaHawaina();
        BuilderPizza pizzaClasica = new PizzaClasica();

        System.out.println("***** Pizza Carnivora *****");
        nostra.setBuilder(pizzaCarnivora);
        nostra.pizzaPreparada();
        Pizza pizza1 = nostra.getPizzaPreparada();
        pizza1.showInfo();

        System.out.println("***** Pizza Clasica *****");
        nostra.setBuilder(pizzaClasica);
        nostra.pizzaPreparada();
        Pizza pizza2 = nostra.getPizzaPreparada();
        pizza2.showInfo();

        System.out.println("***** Pizza Hawaina *****");
        nostra.setBuilder(pizzaHawaina);
        nostra.pizzaPreparada();
        Pizza pizza3 = nostra.getPizzaPreparada();
        pizza3.showInfo();
    }
}
