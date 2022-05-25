package builder.practice;



public class PizzaHawaina extends BuilderPizza {


    @Override
    public void buildIngredientes() {
        this.pizza.setIngredientes("Piña, Salsa de tomate, otro");
    }

    @Override
    public void buildTipoMasa() {
        this.pizza.setTipoMasa("Masa normal");
    }

    @Override
    public void buildTipoQueso() {
        this.pizza.setTipoQueso("Quezo mozarella tipo2");
    }
}
