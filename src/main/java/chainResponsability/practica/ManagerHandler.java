package chainResponsability.practica;

public class ManagerHandler implements IHandler {
    private IHandler next;

    @Override
    public void setNext(IHandler handler) {
        next = handler;
    }

    @Override
    public void criteriaHandler(Persona[] personas) {
        Algo1 a1 = new Algo1();
        this.setNext(a1);

        Algo2 a2 = new Algo2();
        a1.setNext(a2);

        Algo3 a3 = new Algo3();
        a2.setNext(a3);

        this.next.criteriaHandler(personas);
    }

    @Override
    public IHandler next() {
        return next;
    }
}
