package factoryMethod.practice.ejercicio3;

public class PasajeStandart implements IPasaje{
    private int numeroVuelo;
    private OriDes destino = new OriDes();
    private OriDes origen = new OriDes();
    private Pasajero pasajero = new Pasajero();
    private Avion avion = new Avion();
    private String numeroAsiento;
    private int costoPasaje;

    public PasajeStandart(OriDes destino, OriDes origen, Avion avion, Pasajero pasajero){
        this.destino = destino;
        this.origen = origen;
        this.avion = avion;
        this.pasajero = pasajero;
    }
    @Override
    public void showInfo() {
        System.out.println("* PASAJE STANDART ******************************************");
        System.out.println("Numero de Vuelo: "+numeroVuelo);
        System.out.println("Destino: ");
        System.out.println("   - Pais: "+destino.getPais());
        System.out.println("   - Ciudad: "+destino.getCiudad());
        System.out.println("   - Aeropuerto: "+destino.getAeropuerto());
        System.out.println("Origen: ");
        System.out.println("   - Pais: "+origen.getPais());
        System.out.println("   - Ciudad: "+origen.getCiudad());
        System.out.println("   - Aeropuerto: "+origen.getAeropuerto());
        System.out.println("Avion: ");
        System.out.println("   - Marca: "+avion.getMarca());
        System.out.println("   - Capacidad: "+avion.getCapacidad());
        System.out.println("   - Modelo: "+avion.getModelo());
        System.out.println("   - Numero de Asientos: "+avion.getNumeroAsientos());
        System.out.println("Pasajero: ");
        System.out.println("   - Nombre: "+pasajero.getNombre());
        System.out.println("   - CI: " +pasajero.getCi());
        System.out.println("Numero de Asiento: "+numeroAsiento);
        System.out.println("Costo de Pasaje: "+costoPasaje);
    }

    public int getNumeroVuelo() {
        return numeroVuelo;
    }

    public void setNumeroVuelo(int numeroVuelo) {
        this.numeroVuelo = numeroVuelo;
    }

    public OriDes getDestino() {
        return destino;
    }

    public void setDestino(OriDes destino) {
        this.destino = destino;
    }

    public OriDes getOrigen() {
        return origen;
    }

    public void setOrigen(OriDes origen) {
        this.origen = origen;
    }

    public Pasajero getPasajero() {
        return pasajero;
    }

    public void setPasajero(Pasajero pasajero) {
        this.pasajero = pasajero;
    }

    public Avion getAvion() {
        return avion;
    }

    public void setAvion(Avion avion) {
        this.avion = avion;
    }

    public String getNumeroAsiento() {
        return numeroAsiento;
    }

    public void setNumeroAsiento(String numeroAsiento) {
        this.numeroAsiento = numeroAsiento;
    }

    public int getCostoPasaje() {
        return costoPasaje;
    }

    public void setCostoPasaje(int costoPasaje) {
        this.costoPasaje = costoPasaje;
    }
}