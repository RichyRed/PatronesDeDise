package interpreter.practica.ejercicio5;

public class TerExp4 extends Expressions {

    @Override
    public void interpreter(Context context) {
        if (context.input.startsWith("4")){
            context.output= context.output+"IV ";
            context.input= context.input.substring(1);
        }
    }
}
