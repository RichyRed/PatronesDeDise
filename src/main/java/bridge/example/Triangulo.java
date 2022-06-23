package bridge.example;

public class Triangulo implements IFigure {

    private IColor color;

    public Triangulo(IColor color) {
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
        System.out.println("pintando Triangulo ..");
        color.pintar();
    }
}
