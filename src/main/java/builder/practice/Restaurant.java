package builder.practice;


public class Restaurant {
    private BuilderPizza builder;

    public Pizza getPizzaPreparada(){
        return builder.getProduct();
    }

    public void setBuilder(BuilderPizza builder){
        this.builder=builder;
    }

    public void pizzaPreparada(){
        this.builder.createPizza();
        this.builder.buildIngredientes();
        this.builder.buildTipoMasa();
        this.builder.buildTipoQueso();
    }
}
