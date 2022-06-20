package adapter.practica;

public class Tele implements IEmpresaB {
    private int precio;
    private int tiempoDeGarantia;

    public Tele(int precio, int tiempoDeGarantia) {
        this.precio = precio;
        this.tiempoDeGarantia = tiempoDeGarantia;
    }

    @Override
    public void showCosto() {
        System.out.println("Precio de la tele: " + precio + " Bs");
    }

    @Override
    public void showTiempoDeGarantia() {
        System.out.println("El tiempo de garantia de la tele: " + tiempoDeGarantia + " años");
    }
}
