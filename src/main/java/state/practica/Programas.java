package state.practica;

public class Programas {
    String programas;
    public Programas(){}

    public String getProgramas() {
        return programas;
    }

    public Programas setProgramas(String programas) {
        this.programas = programas;
        return this;
    }
    public void showInfo(){
        System.out.println("Programas abiertos: "+programas);
    }
}
