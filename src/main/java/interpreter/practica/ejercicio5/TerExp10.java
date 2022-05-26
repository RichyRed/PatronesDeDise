package interpreter.practica.ejercicio5;

public class TerExp10 extends Expressions {

    @Override
    public void interpreter(Context context) {
        if (context.input.startsWith("10")){
            context.output= context.output+"X ";
            context.input= context.input.substring(1);
        }
    }
}
