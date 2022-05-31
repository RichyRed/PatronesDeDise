package iterator.practica;

import java.util.Vector;

public class ConcreteImportadora3 implements IAggregate {
    private Vector<Auto> listaAutos;

    public ConcreteImportadora3(){
        listaAutos = new Vector<>();
    }

    public void add(Auto a){
        listaAutos.add(a);
    }

    @Override
    public Iterator createIterator() {
        return new ConcreteIteratorImportadora3(listaAutos);
    }
}
