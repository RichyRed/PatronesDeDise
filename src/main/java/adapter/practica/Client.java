package adapter.practica;

public class Client {
    public static void main(String[] args) throws InterruptedException {
        IEmpresaA celular = new Cel(500, 3);
        celular.showPrecio();
        celular.showTiempo();

        IEmpresaA tablet = new Tablet(1000, 4);
        tablet.showPrecio();
        tablet.showTiempo();

        IEmpresaA computadora = new Compu(5000, 2);
        computadora.showPrecio();
        computadora.showTiempo();

        IEmpresaA televisor = new Artefacto(new Tele(2000, 1));
        televisor.showPrecio();
        televisor.showTiempo();

        IEmpresaA lavadora = new Artefacto(new Lavadora(4500, 8));
        lavadora.showPrecio();
        lavadora.showTiempo();

        IEmpresaA refrigerador = new Artefacto(new Refri(3000, 4));
        refrigerador.showPrecio();
        refrigerador.showTiempo();
    }
}
