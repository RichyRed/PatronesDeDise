package mediator.exercise;

public class SM extends Usuario {
    private String certificaciones;

    public SM(ICanalComunicacion mediator) {
        super(mediator);
    }

    public String getCertificaciones() {
        return certificaciones;
    }

    public void setCertificaciones(String certificaciones) {
        this.certificaciones = certificaciones;
    }

    @Override
    public void send(String msg) {
        mediator.send(msg, this);
    }

    @Override
    public void receive(String msg) {
        System.out.println("Nombre: " + getName() + ", Cargo: " + getCargo() + ", Certificaciones: " + certificaciones);
        System.out.println("Mensaje recibido: " + msg);
    }
}
