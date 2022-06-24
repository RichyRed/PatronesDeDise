package composite.practice;

import java.util.ArrayList;
import java.util.List;

public class CompositeCompu extends Component {
    private List<Component> componentList = new ArrayList<>();
    int precioTotal = 0;

    public CompositeCompu(String tipo){
        super(tipo);
    }

    @Override
    public void mostrarDetalles() {
        for(Component c : componentList){
            c.mostrarDetalles();
            precioTotal = precioTotal+c.getPrecio();
        }

        if(this.getTipo().startsWith("LABORATORIO")){
            this.setPrecio(precioTotal);
            System.out.println("Precio del labo: " + precioTotal + "$");
        } else if(this.getTipo().startsWith("CONTENEDOR")){
            this.setPrecio(precioTotal);
            System.out.println("Precio del contenedor:  " + precioTotal + "$");
        }

    }

    @Override
    public void add(Component component) {
        componentList.add(component);
    }

    @Override
    public void remove(Component component) {
        componentList.remove(component);
    }
}
