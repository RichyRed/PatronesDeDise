package mediator.exercise;

public abstract class Usuario {
    protected ICanalComunicacion mediator;
    private String name;
    private String ci;
    private String cargo;

    public Usuario(ICanalComunicacion mediator) {
        this.mediator = mediator;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getCi() {
        return ci;
    }

    public void setCi(String ci) {
        this.ci = ci;
    }

    public String getCargo() {
        return cargo;
    }

    public void setCargo(String cargo) {
        this.cargo = cargo;
    }

    public abstract void send(String msg);
    public abstract void receive(String msg);
}
