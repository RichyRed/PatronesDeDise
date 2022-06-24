package composite.practice;

public class Compu extends Component {

    public Compu(String type){
        super(type);
    }

    @Override
    public void mostrarDetalles() {
        this.showInfo();
    }

    @Override
    public void add(Component component) {
    }

    @Override
    public void remove(Component component) {
    }
}
