package builder.practice;



public class PizzaCarnivora extends BuilderPizza {

    @Override
    public void buildIngredientes() {
        this.pizza.setIngredientes("Carne, Salsa de tomate, Otro");
    }

    @Override
    public void buildTipoMasa() {
        this.pizza.setTipoMasa("Masa especial");
    }

    @Override
    public void buildTipoQueso() {
        this.pizza.setTipoQueso("Quezo mozarella");
    }
}
