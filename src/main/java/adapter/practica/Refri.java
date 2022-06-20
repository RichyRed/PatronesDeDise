package adapter.practica;

public class Refri implements IEmpresaB {
    private int precio;
    private int tiempoDeGarantia;

    public Refri(int precio, int tiempoDeGarantia) {
        this.precio = precio;
        this.tiempoDeGarantia = tiempoDeGarantia;
    }

    @Override
    public void showCosto() {
        System.out.println("Precio del refri: " + precio + " Bs");
    }

    @Override
    public void showTiempoDeGarantia() {
        System.out.println("Tiempo de garantia del refri: " + tiempoDeGarantia + " años");
    }
}
