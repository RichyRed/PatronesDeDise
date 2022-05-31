package iterator.practica;

import java.util.Stack;

public class ConcreteImportadora4 implements IAggregate {
    private Stack<Auto> listaAutos;

    public ConcreteImportadora4(){
        listaAutos = new Stack<Auto>();
    }

    public void add(Auto a){
        listaAutos.push(a);
    }

    @Override
    public Iterator createIterator() {
        return new ConcreteIteratorImportadora4(listaAutos);
    }
}
