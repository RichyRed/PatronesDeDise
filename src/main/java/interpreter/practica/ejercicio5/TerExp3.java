package interpreter.practica.ejercicio5;

public class TerExp3 extends Expressions {

    @Override
    public void interpreter(Context context) {
        if (context.input.startsWith("3")){
            context.output= context.output+"III ";
            context.input= context.input.substring(1);
        }
    }
}
