package bridge.practice;

public class Tierra implements IEnvio {
    @Override
    public void enviar(Paquete paquete) {
        double precioConEnvio = paquete.getPrecio()+ paquete.getPrecio()*0.05;
        System.out.println("---- Enviando el paquete mediante TIERRA -----");
        paquete.showInfo();
        System.out.println("Precio (envio tierra): " + precioConEnvio);
        System.out.println();
    }
}
