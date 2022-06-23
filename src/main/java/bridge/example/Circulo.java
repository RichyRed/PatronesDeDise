package bridge.example;

public class Circulo implements IFigure {

    private IColor color;

    public Circulo(IColor color) {
        this.color = color;
    }

    public void setColor(IColor color) {
        this.color = color;
    }

    @Override
    public int getArea() {
        return 0;
    }

    @Override
    public void pintar() {
        System.out.println("pintando Circulo ..");
        color.pintar();
    }
}
