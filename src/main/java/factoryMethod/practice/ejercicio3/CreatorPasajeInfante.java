package factoryMethod.practice.ejercicio3;

public class CreatorPasajeInfante extends Creator{
    @Override
    public IPasaje createProduct() {
        Avion boa = new Avion();
        boa.setMarca("Iberia");
        boa.setCapacidad(100);
        boa.setModelo("Airbus 666");
        boa.setNumeroAsientos(95);
        OriDes dest = new OriDes();
        dest.setPais("Qatar");
        dest.setCiudad("Lusail");
        dest.setAeropuerto("A.I. Hamad");
        OriDes ori = new OriDes();
        ori.setPais("EEUU");
        ori.setCiudad("Canada");
        ori.setAeropuerto("Qatar Airways");
        Pasajero def = new Pasajero();
        def.setNombre("default");
        def.setCi("default");
        PasajeInfante pasaje = new PasajeInfante(ori,dest,def,boa);
        pasaje.setCostoEspecial(1000);
        pasaje.setNumeroVuelo(123);
        return pasaje;
    }
}
