package bridge.example;

public class Client {

    public static void main (String[]args){
        IColor rojo= new Rojo();
        IColor verde= new Verde();
        IColor azul= new Azul();

        Cuadrado cuadrado = new Cuadrado(rojo);
        cuadrado.pintar();

        Triangulo triangulo = new Triangulo(verde);
        triangulo.pintar();

        Circulo circulo = new Circulo(azul);
        circulo.pintar();

        IColor amarillo = new Amarillo();

        Rectangulo rectangulo = new Rectangulo(amarillo);
        rectangulo.pintar();




    }
}
