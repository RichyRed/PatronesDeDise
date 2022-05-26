package interpreter.practica.ejercicio5;

public class Client {
    public static void main (String[]args){

        String msg1="1 2 3 4 5 6 7 8 9 10";

        Interpreter parser = new Interpreter(msg1);
        System.out.println("i. e1: 1 2 3 4 5 6 7 8 9 10");
        System.out.println("En numeros romanos: "+parser.evaluateMsg());

        String msg2="1 5";

        Interpreter parser2 = new Interpreter(msg2);
        System.out.println("i. e2: 1 2 3 4 5");
        System.out.println("En numeros romanos: "+parser2.evaluateMsg());


    }

}
