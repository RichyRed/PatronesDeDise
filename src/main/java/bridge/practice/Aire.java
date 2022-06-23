package bridge.practice;

public class Aire implements IEnvio {
    @Override
    public void enviar(Paquete paquete) {
        double precioConEnvio = paquete.getPrecio()+ paquete.getPrecio()*0.1;
        System.out.println("---- Enviando el paquete mediante AIRE -----");
        paquete.showInfo();
        System.out.println("Precio (envio aire):" + precioConEnvio);
        System.out.println();
    }
}
