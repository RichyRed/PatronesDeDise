package iterator.practica;

import java.util.ArrayList;
import java.util.List;

public class ConcreteImportadora2 implements IAggregate {
    private List<Auto> listaDeAutos;

    public ConcreteImportadora2(){
        listaDeAutos = new ArrayList<>();
    }

    public void add(Auto a){
        listaDeAutos.add(a);
    }

    @Override
    public Iterator createIterator() {
        return new ConcreteIteratorImportadora2(listaDeAutos);
    }
}
