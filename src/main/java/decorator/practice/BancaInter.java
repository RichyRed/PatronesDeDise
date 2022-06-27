package decorator.practice;

public class BancaInter extends Funcionalidades {

    public BancaInter(ICuenta cuenta) {
        super(cuenta);
    }

    @Override
    public void showInfo(){
        System.out.println("*** Se habilito banca por internet ***");
        cuenta.setBancaInternet(true);
        super.showInfo();
    }
}
