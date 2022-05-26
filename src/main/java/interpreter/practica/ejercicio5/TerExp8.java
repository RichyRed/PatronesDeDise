package interpreter.practica.ejercicio5;

public class TerExp8 extends Expressions {

    @Override
    public void interpreter(Context context) {
        if (context.input.startsWith("8")){
            context.output= context.output+"VIII ";
            context.input= context.input.substring(1);
        }
    }
}