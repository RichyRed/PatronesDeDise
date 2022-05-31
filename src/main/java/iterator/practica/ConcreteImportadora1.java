package iterator.practica;

public class ConcreteImportadora1 implements IAggregate {
    private int posicion;
    private Auto[] listaAutos;

    public ConcreteImportadora1(){
        listaAutos = new Auto[2];
    }

    public void add(Auto a){
        listaAutos[posicion] = a;
        posicion++;
    }

    @Override
    public Iterator createIterator() {
        return new ConcreteIteratorImportadora1(listaAutos);
    }
}
