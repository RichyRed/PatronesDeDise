package iterator.practica;

import java.util.Stack;

public class ConcreteIteratorImportadora4 implements Iterator {
    private Stack<Auto> listaAutos;

    public ConcreteIteratorImportadora4(Stack<Auto> listaDeAutos) {
        this.listaAutos = listaDeAutos;
    }

    @Override
    public Object next() {
        return listaAutos.pop();
    }

    @Override
    public boolean hasNext() {
        return !listaAutos.isEmpty();
    }
}
