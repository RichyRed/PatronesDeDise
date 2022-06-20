package adapter.practica;

public class Lavadora implements IEmpresaB {
    private int precio;
    private int tiempoDeGarantia;

    public Lavadora(int precio, int tiempoDeGarantia) {
        this.precio = precio;
        this.tiempoDeGarantia = tiempoDeGarantia;
    }

    @Override
    public void showCosto() {
        System.out.println("Precio de la lavadora: " + precio + " Bs");
    }

    @Override
    public void showTiempoDeGarantia() {
        System.out.println("Tiempo de garantia de la lavadora: " + tiempoDeGarantia + " años");
    }
}
