package abstractFactory.practice;

public interface IPasaje {
    int numVuelo=0;
    int numAsiento=0;
    Pasajero pasajero=new Pasajero("default","default");
    int costo=0;
    int descueto=0;

    void showInfo();
}
