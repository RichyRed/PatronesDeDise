package decorator.practice;

public class Client {
    public static void main (String []args){
        ICuenta cuentaBancaria = new CuentaBancaria(250, "Tony Stark", false);
        cuentaBancaria.showInfo();

        cuentaBancaria = new Promocion(cuentaBancaria);
        cuentaBancaria = new Seguro(cuentaBancaria);
        cuentaBancaria = new BancaInter(cuentaBancaria);

        cuentaBancaria.showInfo();
    }
}
