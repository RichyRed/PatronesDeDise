package strategy.practica;

import java.util.List;

public class Otoño implements IEstacion {
    @Override
    public void descuento(List<Ropa> tienda) {
        System.out.println("---- Precios por otoño -----");
        for (Ropa ropa : tienda) {
            int monto = ropa.getPrecioOriginal()*50/100;
            ropa.setPrecioTemporada(ropa.getPrecioOriginal() - monto);
            ropa.showInfo();
        }
    }
}