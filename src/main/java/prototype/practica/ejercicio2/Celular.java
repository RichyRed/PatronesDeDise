package prototype.practica.ejercicio2;

public class Celular implements ICelular {

    private double tamaño;
    private String cpu;
    private int memory;
    private SIM sim = new SIM();
    private double versionAndroid;
    private double camara;
    private int bluetooth;
    private int cantidadDeMemoriasExternas;
    private String tipoBateria;
    private Cargador cargador = new Cargador();
    private Estuche estucheCel = new Estuche();
    private Audifonos audifonos = new Audifonos();


    public Celular() {
    }

    public double getTamaño() {
        return tamaño;
    }

    public void setTamaño(double tamaño) {
        this.tamaño = tamaño;
    }

    public String getCpu() {
        return cpu;
    }

    public void setCpu(String cpu) {
        this.cpu = cpu;
    }

    public int getMemory() {
        return memory;
    }

    public void setMemory(int memory) {
        this.memory = memory;
    }

    public SIM getSim() {
        return sim;
    }

    public void setSim(SIM sim) {
        this.sim = sim;
    }

    public double getVersionAndroid() {
        return versionAndroid;
    }

    public void setVersionAndroid(double versionAndroid) {
        this.versionAndroid = versionAndroid;
    }

    public double getCamara() {
        return camara;
    }

    public void setCamara(double camara) {
        this.camara = camara;
    }

    public int getBluetooth() {
        return bluetooth;
    }

    public void setBluetooth(int bluetooth) {
        this.bluetooth = bluetooth;
    }

    public int getCantidadDeMemoriasExternas() {
        return cantidadDeMemoriasExternas;
    }

    public void setCantidadDeMemoriasExternas(int cantidadDeMemoriasExternas) {
        this.cantidadDeMemoriasExternas = cantidadDeMemoriasExternas;
    }

    public String getTipoBateria() {
        return tipoBateria;
    }

    public void setTipoBateria(String tipoBateria) {
        this.tipoBateria = tipoBateria;
    }

    public Cargador getCargador() {
        return cargador;
    }

    public void setCargador(Cargador cargador) {
        this.cargador = cargador;
    }

    public Estuche getEstucheCel() {
        return estucheCel;
    }

    public void setEstucheCel(Estuche estucheCel) {
        this.estucheCel = estucheCel;
    }

    public Audifonos getAudifonos() {
        return audifonos;
    }

    public void setAudifonos(Audifonos audifonos) {
        this.audifonos = audifonos;
    }

    @Override
    public Celular clone() {

        SIM cloneS = new SIM();
        cloneS.setNumeroTelefono(this.getSim().getNumeroTelefono());
        cloneS.setNombreEmpresa(this.getSim().getNombreEmpresa());

        Cargador cloneC = new Cargador();
        cloneC.setNombre(this.getCargador().getNombre());

        Estuche cloneCase = new Estuche();
        cloneCase.setNombre(this.getEstucheCel().getNombre());
        cloneCase.setColor(this.getEstucheCel().getColor());

        Audifonos cloneE = new Audifonos();
        cloneE.setNombre(this.getAudifonos().getNombre());
        cloneE.setSinCable(this.getAudifonos().getSinCable());

        Celular clone = new Celular();
        clone.setTamaño(this.getTamaño());
        clone.setCpu(this.getCpu());
        clone.setMemory(this.getMemory());
        clone.setSim(cloneS);
        clone.setVersionAndroid(this.getVersionAndroid());
        clone.setCamara(this.getCamara());
        clone.setBluetooth(this.getBluetooth());
        clone.setCantidadDeMemoriasExternas(this.getCantidadDeMemoriasExternas());
        clone.setTipoBateria(this.getTipoBateria());
        clone.setCargador(cloneC);
        clone.setEstucheCel(cloneCase);
        clone.setAudifonos(cloneE);

        return clone;
    }

    public void showCellphoneInfo() {
        System.out.println("\n **** INFORMACION DEL CELULAR ****");
        System.out.println("Tamaño: " + tamaño + "cm");
        System.out.println("cpu: " + cpu);
        System.out.println("Memoria: " + memory + "GB");
        System.out.println("SIM de " + sim.getNombreEmpresa() + " con el numero: " + sim.getNumeroTelefono());
        System.out.println("Version de Android: " + versionAndroid);
        System.out.println("Camara de: " + camara + "MPX");
        System.out.println("Bluetooth version: " + bluetooth);
        System.out.println("Cantidad de memorias externas: " + cantidadDeMemoriasExternas);
        System.out.println("Bateria: " + tipoBateria);
        if (cargador.getNombre() != null)
            System.out.println("Cargador: " + cargador.getNombre() + " de longitud " + cargador.getNombre() + " metros");
        if (estucheCel.getNombre() != null)
            System.out.println("Case: " + estucheCel.getNombre() + " de color " + estucheCel.getColor());
        if (audifonos.getNombre() != null) {
            System.out.print("Audifonos: " + audifonos.getNombre());
            if (audifonos.getSinCable())
                System.out.println(" con capacidad inalambrica");
        }
    }
}
