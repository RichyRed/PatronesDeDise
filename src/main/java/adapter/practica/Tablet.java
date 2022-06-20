package adapter.practica;

public class Tablet implements IEmpresaA {
    private int precio;
    private int tiempoDeVida;

    public Tablet(int precio, int tiempoDeVida) {
        this.precio = precio;
        this.tiempoDeVida = tiempoDeVida;
    }

    @Override
    public void showPrecio() {
        System.out.println("PRecio de la tablet: " + precio + " Bs");
    }

    @Override
    public void showTiempo() {
        System.out.println("Tiempo de vida de la tablet: " + tiempoDeVida + " años");
    }
}
