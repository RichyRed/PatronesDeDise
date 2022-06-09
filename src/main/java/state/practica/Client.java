package state.practica;

public class Client {
    public static void main(String[] args) throws InterruptedException {
        Compu computadora=new Compu();
        computadora.setStateComputadora(new Prendido());
        computadora.resourceManager();
    }
}
