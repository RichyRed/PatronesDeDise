package interpreter.practica.ejercicio5;

public class TerExp5 extends Expressions {

    @Override
    public void interpreter(Context context) {
        if (context.input.startsWith("5")){
            context.output= context.output+"V ";
            context.input= context.input.substring(1);
        }
    }
}
