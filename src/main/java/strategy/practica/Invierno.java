package strategy.practica;

import java.util.List;

public class Invierno implements IEstacion {
    @Override
    public void descuento(List<Ropa> tienda) {
        System.out.println("--- Precios de invierno paa ----");
        for (Ropa ropa : tienda) {
            int monto = ropa.getPrecioOriginal()*10/100;
            ropa.setPrecioTemporada(ropa.getPrecioOriginal() + monto);
            ropa.showInfo();
        }
    }
}
