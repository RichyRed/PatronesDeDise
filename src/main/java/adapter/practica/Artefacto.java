package adapter.practica;

public class Artefacto implements IEmpresaA {
    private IEmpresaB artefacto;

    public Artefacto(IEmpresaB artefacto) {
        this.artefacto = artefacto;
    }

    @Override
    public void showPrecio() {
        artefacto.showCosto();
    }

    @Override
    public void showTiempo() {
        artefacto.showTiempoDeGarantia();
    }
}
