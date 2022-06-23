package proxy.practice;

public class Cuentabancaria implements ICuenta {
    int saldo;

    public Cuentabancaria(int saldo){
        this.saldo = saldo;
    }

    public int getSaldo() {
        return saldo;
    }

    @Override
    public void realizarTransaccion(Transaccion transaccion) {
        transaccion.showInfo();
        saldo = saldo - transaccion.getMonto();
        System.out.println("Su saldo actual es de " + saldo + " Bs");
    }

    public Transaccion cambiarABolivianos(Transaccion transaccion) {
        if(transaccion.getMoneda().equals("dolares")){
            System.out.println("Cambiando dolares a bolivianos");
            return new Transaccion(transaccion.getMonto() * 7, "bolivianos");
        } else if(transaccion.getMoneda().equals("euros")) {
            System.out.println("Cambiando euros a bolivianos");
            return new Transaccion(transaccion.getMonto() * 8, "bolivianos");
        } else {
            System.out.println("No tenemos cambios para esta moneda paaaaaa");
            return new Transaccion(0, "bolivianos");
        }
    }
}
