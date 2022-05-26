package interpreter.practica.ejercicio5;

public class TerExp6 extends Expressions {

    @Override
    public void interpreter(Context context) {
        if (context.input.startsWith("6")){
            context.output= context.output+"VI ";
            context.input= context.input.substring(1);
        }
    }
}