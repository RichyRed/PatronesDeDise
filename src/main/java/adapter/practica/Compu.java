package adapter.practica;

public class Compu implements IEmpresaA {
    private int precio;
    private int tiempoDeVida;

    public Compu(int precio, int tiempoDeVida) {
        this.precio = precio;
        this.tiempoDeVida = tiempoDeVida;
    }

    @Override
    public void showPrecio() {
        System.out.println("Precio de la compu: " + precio + " Bs");
    }

    @Override
    public void showTiempo() {
        System.out.println("Tiempo de via de la compu: " + tiempoDeVida + " años");
    }
}
