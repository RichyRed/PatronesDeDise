package visitor.practica;

public class Client {
    public static void main(String[] args){
        LibreCambista librecambista = new LibreCambista();

        Argentina argentina = new Argentina();
        argentina.setCambio(100, "dolar");
        argentina.aceptar(librecambista);

        argentina.setCambio(100, "peso");
        argentina.aceptar(librecambista);

    }
}
