package observer.practice;

public interface ICanal {
    void attach(IUser observer);
    void detach(IUser observer);
    void notifyObservers(Notificaciones notificaciones);
}
