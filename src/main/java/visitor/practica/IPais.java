package visitor.practica;

public interface IPais {
    void aceptar(IVisitante visitante);
    void setCambio(int monto, String moneda);
}