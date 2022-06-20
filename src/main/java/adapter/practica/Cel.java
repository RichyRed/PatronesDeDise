package adapter.practica;

public class Cel implements IEmpresaA {
    private int precio;
    private int tiempoDeVida;

    public Cel(int precio, int tiempoDeVida) {
        this.precio = precio;
        this.tiempoDeVida = tiempoDeVida;
    }

    @Override
    public void showPrecio() {
        System.out.println("Precio del celular: " + precio + " Bs");
    }

    @Override
    public void showTiempo() {
        System.out.println("Tiempo de vida del celular: " + tiempoDeVida + " años");
    }
}
