package proxy.practice;

public class Tarjeta implements ICuenta {
    private Cuentabancaria cuentaBancaria;

    public Tarjeta() {
        System.out.println("Creando cuenta, saldo inicial de 1000 BS ");
        cuentaBancaria = new Cuentabancaria(1000);
    }

    @Override
    public void realizarTransaccion(Transaccion transaccion) {
        if(transaccion.getMoneda().equals("bolivianos") && transaccion.getMonto()<=cuentaBancaria.getSaldo()){
            cuentaBancaria.realizarTransaccion(transaccion);
        } else if(transaccion.getMonto()>cuentaBancaria.getSaldo()){
            System.out.println("SAlDO INSUFICIENTE papu!!!!");
        } else {
            cuentaBancaria.realizarTransaccion(cuentaBancaria.cambiarABolivianos(transaccion));
        }
    }
}