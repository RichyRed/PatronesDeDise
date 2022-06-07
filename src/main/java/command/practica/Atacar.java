package command.practica;

public class Atacar implements ICommand {
    private Receiver receiver;

    public Atacar(Receiver receiver){
        this.receiver = receiver;
    }

    @Override
    public void execute() {
        receiver.atacar();
    }
}
