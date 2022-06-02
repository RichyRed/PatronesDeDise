package mediator.stucture;

public interface Mediator {
    void send(String msg, Colleague colleague);
}