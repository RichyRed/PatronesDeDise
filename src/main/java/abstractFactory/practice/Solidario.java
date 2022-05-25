package abstractFactory.practice;

public class Solidario  implements IPasaje{
    @Override
    public void showInfo() {
        System.out.println("SOLIDARO");
        System.out.println(numVuelo);
        System.out.println(numAsiento);
        System.out.println(pasajero.getCi());
        System.out.println(pasajero.getName());
        System.out.println(costo);
        System.out.println(descueto);
    }
}