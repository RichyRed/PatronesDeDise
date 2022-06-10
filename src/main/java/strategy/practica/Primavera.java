package strategy.practica;

import java.util.List;

public class Primavera implements IEstacion {
    @Override
    public void descuento(List<Ropa> tienda) {
        System.out.println("---- Precios por primaveraaa ---- ");
        for (Ropa ropa : tienda) {
            ropa.setPrecioTemporada(ropa.getPrecioOriginal());
            ropa.showInfo();
        }
    }
}