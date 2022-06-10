package strategy.practica;

public class Client {
    public static void main(String[] args){
        Tienda tiendaDeRopa = new Tienda("Tu tienda nasheeeee");
        tiendaDeRopa.addRopa(new Ropa("Shorts", "Negro", 50));
        tiendaDeRopa.addRopa(new Ropa("Leras", "Blancas", 150));
        tiendaDeRopa.addRopa(new Ropa("Busos", "Rosa good", 200));
        tiendaDeRopa.addRopa(new Ropa("Calcetas", "Blancas", 20));
        tiendaDeRopa.addRopa(new Ropa("Zapas", "Rojas", 300));


        tiendaDeRopa.setEstacion(new Verano());

        tiendaDeRopa.iniciarEstacion();
    }
}
