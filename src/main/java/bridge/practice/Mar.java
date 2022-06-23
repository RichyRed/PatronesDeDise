package bridge.practice;

public class Mar implements IEnvio {
    @Override
    public void enviar(Paquete paquete) {
        double precioConEnvio = paquete.getPrecio()+ paquete.getPrecio()*0.5;
        System.out.println("---- Enviando el paquete mediante MAR -----");
        paquete.showInfo();
        System.out.println("Precio (envio mar): " + precioConEnvio);
        System.out.println();
    }
}
