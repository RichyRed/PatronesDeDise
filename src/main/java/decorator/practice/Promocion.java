package decorator.practice;

import java.util.Random;

public class Promocion extends Funcionalidades {

    public Promocion(ICuenta cuenta) {
        super(cuenta);
    }

    @Override
    public void showInfo(){
        int numeroRandom = new Random().nextInt(50);
        if(numeroRandom % 2 == 0){
            System.out.println(">> Usted gano, y duplico el monto de su cuenta paaa");
            int nuevoSaldo = 2 * cuenta.getMonto();
            cuenta.setMonto(nuevoSaldo);
            super.showInfo();
        } else {
            super.showInfo();
        }
    }
}
