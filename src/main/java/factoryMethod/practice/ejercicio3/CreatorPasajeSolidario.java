package factoryMethod.practice.ejercicio3;

public class CreatorPasajeSolidario extends Creator{

    @Override
    public IPasaje createProduct() {
        Avion boa = new Avion();
        boa.setMarca("Iberia");
        boa.setCapacidad(100);
        boa.setModelo("Boeing 747F");
        boa.setNumeroAsientos(98);
        OriDes dest = new OriDes();
        dest.setPais("Qatar");
        dest.setCiudad("Doha");
        dest.setAeropuerto("A.I. Hamad");
        OriDes ori = new OriDes();
        ori.setPais("EEUU");
        ori.setCiudad("New York");
        ori.setAeropuerto("A. I. New York");
        Pasajero def = new Pasajero();
        def.setNombre("default");
        def.setCi("default");
        PasajeSolidario pasaje = new PasajeSolidario(dest,ori,def,boa);
        pasaje.setCostoPasaje(500);
        pasaje.setNumeroVuelo(666);
        return pasaje;
    }
}
