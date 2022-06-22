package proxy.practice;

public class Client {
    public static void main(String[] args){
        ICuenta cuenta = new Tarjeta();
        cuenta.realizarTransaccion(new Transaccion(10, "dolares"));
        cuenta.realizarTransaccion(new Transaccion(200, "bolivianos"));
        cuenta.realizarTransaccion(new Transaccion(90, "euros"));
        cuenta.realizarTransaccion(new Transaccion(50, "boliviano"));
    }
}
