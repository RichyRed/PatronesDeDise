package factoryMethod.practice.ejercicio3;

public class CreatorPasajeStandart extends Creator{
    @Override
    public IPasaje createProduct() {
        Avion boa = new Avion();
        boa.setMarca("Emigrates");
        boa.setCapacidad(100);
        boa.setModelo("Airbus 319");
        boa.setNumeroAsientos(95);
        OriDes dest = new OriDes();
        dest.setPais("Qatar");
        dest.setCiudad("Al Wakrah");
        dest.setAeropuerto("A.I. Hamad");
        OriDes ori = new OriDes();
        ori.setPais("Alemania");
        ori.setCiudad("Munich");
        ori.setAeropuerto("A. I. Munich");
        Pasajero def = new Pasajero();
        def.setNombre("default");
        def.setCi("default");
        PasajeStandart pasaje = new PasajeStandart(ori,dest,boa,def);
        pasaje.setCostoPasaje(600);
        pasaje.setNumeroVuelo(777);
        return pasaje;
    }
}
