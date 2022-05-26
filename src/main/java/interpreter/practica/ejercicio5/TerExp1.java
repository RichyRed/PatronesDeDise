package interpreter.practica.ejercicio5;

public class TerExp1 extends Expressions {

    @Override
    public void interpreter(Context context) {
        if (context.input.startsWith("1")){
            context.output= context.output+"I ";
            context.input= context.input.substring(1);
        }
    }
}
