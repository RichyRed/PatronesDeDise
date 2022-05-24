package factoryMethod.practice.ejercicio3;

public class Client {
    public static void main (String []args){
        Pasajero tony = new Pasajero();
        tony.setNombre("Tony Stark");
        tony.setCi("11010 Miami");
        PasajeInfante p1 = (PasajeInfante) new CreatorPasajeInfante().createProduct();
        p1.setPasajero(tony);
        p1.setNumeroAsiento("41 M");
        p1.showInfo();

        Pasajero steve = new Pasajero();
        steve.setNombre("Steve Rogers");
        steve.setCi("1999 Brooklyn");
        PasajeInfante p2 = (PasajeInfante) new CreatorPasajeInfante().createProduct();
        p2.setPasajero(steve);
        p2.setNumeroAsiento("1 A");
        p2.showInfo();

        Pasajero bruce = new Pasajero();
        bruce.setNombre("Bruce Banner");
        bruce.setCi("951475 EEUU");
        PasajeSolidario p3 = (PasajeSolidario) new CreatorPasajeSolidario().createProduct();
        p3.setPasajero(bruce);
        p3.setNumeroAsiento("60 B");
        p3.setMotivoDescuento("Habilidades Especiales");
        p3.setDescuento(20);
        p3.showInfo();

        Pasajero clint = new Pasajero();
        clint.setNombre("Clint Barton");
        clint.setCi("111111 Canada");
        PasajeSolidario p4 = (PasajeSolidario) new CreatorPasajeSolidario().createProduct();
        p4.setPasajero(clint);
        p4.setNumeroAsiento("10 A");
        p4.setMotivoDescuento("Adulto mayor");
        p4.setDescuento(30);
        p4.showInfo();

        Pasajero natasha = new Pasajero();
        natasha.setNombre("Natasha Romanoff");
        natasha.setCi("321456 Madre Rusia");
        PasajeStandart p5 = (PasajeStandart) new CreatorPasajeStandart().createProduct();
        p5.setPasajero(natasha);
        p5.setNumeroAsiento("99 F");
        p5.showInfo();

        Pasajero thor = new Pasajero();
        thor.setNombre("Thor hijo de Odin");
        thor.setCi("1 Azgard");
        PasajeStandart p6 = (PasajeStandart) new CreatorPasajeStandart().createProduct();
        p6.setPasajero(thor);
        p6.setNumeroAsiento("33 D");
        p6.showInfo();
    }
}
