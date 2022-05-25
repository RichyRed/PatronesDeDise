package abstractFactory.practice;

public class Infantes implements IPasaje{
    @Override
    public void showInfo() {
        System.out.println("INFANTE");
        System.out.println(numVuelo);
        System.out.println(numAsiento);
        System.out.println(pasajero.getCi());
        System.out.println(pasajero.getName());
        System.out.println(costo);
        System.out.println(descueto);
    }
}