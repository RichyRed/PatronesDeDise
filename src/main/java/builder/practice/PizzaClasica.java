package builder.practice;



public class PizzaClasica extends BuilderPizza {
    @Override
    public void buildIngredientes() {
        this.pizza.setIngredientes("Salsa  de tomate, otro");
    }

    @Override
    public void buildTipoMasa() {
        this.pizza.setTipoMasa("Masa especial");
    }

    @Override
    public void buildTipoQueso() {
        this.pizza.setTipoQueso("Doble quezo motzarellaa tipo2");
    }
}
