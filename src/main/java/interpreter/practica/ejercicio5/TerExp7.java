package interpreter.practica.ejercicio5;

public class TerExp7 extends Expressions {

    @Override
    public void interpreter(Context context) {
        if (context.input.startsWith("7")){
            context.output= context.output+"VII ";
            context.input= context.input.substring(1);
        }
    }
}
