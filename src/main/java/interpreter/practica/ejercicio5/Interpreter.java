package interpreter.practica.ejercicio5;

import java.util.ArrayList;
import java.util.List;

public class Interpreter extends Expressions {
    private List<Expressions> grammar = new ArrayList<>();
    private Context context;

    public Interpreter(String msgToInterpreter){
        // asegurando que el msg original no tenga espacios - regla gramatica
        context = new Context(msgToInterpreter.replace(" ",""));
        for ( String charOriginal :  msgToInterpreter.split(" ")) {
            switch (charOriginal){
                case "1":
                    grammar.add(new TerExp1());
                    break;
                case "2":
                    grammar.add(new TerExp2());
                    break;
                case "3":
                    grammar.add(new TerExp3());
                    break;
                case "4":
                    grammar.add(new TerExp4());
                    break;
                case "5":
                    grammar.add(new TerExp5());
                    break;
                case "6":
                    grammar.add(new TerExp6());
                    break;
                case "7":
                    grammar.add(new TerExp7());
                    break;
                case "8":
                    grammar.add(new TerExp8());
                    break;
                case "9":
                    grammar.add(new TerExp9());
                    break;
                case "10":
                    grammar.add(new TerExp10());
                    break;
                default:
                    break;


            }
        }
    }

    public String evaluateMsg(){

        for (Expressions expression:grammar) {
            expression.interpreter(context);
        }

        return context.output;
    }


    @Override
    public void interpreter(Context context) {

    }
}
