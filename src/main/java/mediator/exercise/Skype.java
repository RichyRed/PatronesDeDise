package mediator.exercise;

import java.util.HashMap;
import java.util.Map;

public class Skype implements ICanalComunicacion {
    Map<Usuario, String> map = new HashMap<Usuario, String>();

    public void addToChat(Usuario persona){
        map.put(persona, persona.getCargo());
    }

    @Override
    public void send(String msg, Usuario persona) {
        Usuario emisor = (Usuario) persona;
        for (Usuario p : map.keySet()) {
            if(!emisor.getCi().equals(p.getCi())){
                if(emisor.getCargo().equals("QA") && p.getCargo().equals("QA")){
                    p.receive(msg);
                } else if (emisor.getCargo().equals("DEV") && p.getCargo().equals("DEV")){
                    p.receive(msg);
                } else if (emisor.getCargo().equals("SM")) {
                    p.receive(msg);
                }
            }
        }
    }
}
