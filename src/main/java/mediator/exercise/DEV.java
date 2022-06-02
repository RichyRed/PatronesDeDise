package mediator.exercise;

public class DEV extends Usuario {
    private String lenguaje;

    public DEV(ICanalComunicacion mediator) {
        super(mediator);
    }

    public String getLenguaje() {
        return lenguaje;
    }

    public void setLenguaje(String lenguaje) {
        this.lenguaje = lenguaje;
    }

    @Override
    public void send(String msg) {
        mediator.send(msg, this);
    }

    @Override
    public void receive(String msg) {
        System.out.println("Nombre: " + getName() + ", Cargo: " + getCargo() + ", Lenguaje: " + lenguaje);
        System.out.println("Mensaje recibido: " + msg);
    }
}