package bridge.practice;

public class Client {
    public static void main(String[] args){

        IEnvio mar = new Mar();
        IEnvio tierra = new Tierra();
        IEnvio aire = new Aire();


        EmpresaSA empSA = new EmpresaSA();
        empSA.setEnvio(tierra);
        empSA.enviarPaquete(new Paquete(100, "Paquete terrestre SA ashee"));
        empSA.setEnvio(aire);
        empSA.enviarPaquete(new Paquete(70, "Paquete aereo SA asheee"));

        EmpresaSRL empSRL = new EmpresaSRL();
        empSRL.setEnvio(tierra);
        empSRL.enviarPaquete(new Paquete(50, "Paquete terrestre SRL good"));
        empSRL.setEnvio(aire);
        empSRL.enviarPaquete(new Paquete(60, "Paquete aereo SRL godines"));


        empSA.setEnvio(mar);
        empSA.enviarPaquete(new Paquete(80, "Paquete marino SA paaaa"));

        empSRL.setEnvio(mar);
        empSRL.enviarPaquete(new Paquete(70, "Paquete marino SRL paaaaa"));

    }
}
