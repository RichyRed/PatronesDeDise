package interpreter.practica.ejercicio5;

public class TerExp9 extends Expressions {

    @Override
    public void interpreter(Context context) {
        if (context.input.startsWith("9")){
            context.output= context.output+"IX ";
            context.input= context.input.substring(1);
        }
    }
}
