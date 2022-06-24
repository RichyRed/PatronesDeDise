package composite.practice;

public class Client {
    public static void main(String[] args){
        CompositeCompu lab1 = new CompositeCompu("LABORATORIO 1");
        lab1.add(new Compu("PC1").setPrecio(100));
        lab1.add(new Compu("PC2").setPrecio(100));
        lab1.add(new Compu("PC3").setPrecio(100));

        CompositeCompu lab2 = new CompositeCompu("LABORATORIO 2");
        lab2.add(new Compu("PC4").setPrecio(100));
        lab2.add(new Compu("PC5").setPrecio(100));
        lab2.add(new Compu("PC6").setPrecio(100));
        lab2.add(new Compu("PC7").setPrecio(100));

        CompositeCompu cont1 = new CompositeCompu("CONTENEDOR ");
        cont1.add(lab1);
        cont1.add(lab2);

        cont1.mostrarDetalles();
    }
}
